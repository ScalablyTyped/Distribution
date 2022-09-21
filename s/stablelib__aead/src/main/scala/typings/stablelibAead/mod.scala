package typings.stablelibAead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait AEAD extends StObject {
    
    /**
      * Wipes state from memory.
      * Doesn't wipe the underlying block cipher state.
      */
    def clean(): this.type = js.native
    
    /**
      * Byte length of nonce that is used with this AEAD.
      */
    var nonceLength: Double = js.native
    
    /**
      * Authenticates ciphertext (which includes authentication tag) and
      * associated data, decrypts ciphertext, and returns decrypted plaintext.
      *
      * If authentication fails, it returns null.
      *
      * If dst is given (it must be of ciphertext length minus tag length),
      * the result will be put into it. Dst and plaintext must not overlap.
      */
    def open(nonce: js.typedarray.Uint8Array, ciphertext: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
    def open(
      nonce: js.typedarray.Uint8Array,
      ciphertext: js.typedarray.Uint8Array,
      associatedData: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array | Null = js.native
    def open(
      nonce: js.typedarray.Uint8Array,
      ciphertext: js.typedarray.Uint8Array,
      associatedData: js.typedarray.Uint8Array,
      dst: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array | Null = js.native
    def open(
      nonce: js.typedarray.Uint8Array,
      ciphertext: js.typedarray.Uint8Array,
      associatedData: Unit,
      dst: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array | Null = js.native
    
    /**
      * Encrypts and authenticates plaintext, authenticates associated data,
      * and returns ciphertext, which includes authentication tag.
      *
      * If dst is given (it must be the size of plaintext + the size of tag length)
      * the result will be put into it. Dst and plaintext must not overlap.
      */
    def seal(nonce: js.typedarray.Uint8Array, plaintext: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def seal(
      nonce: js.typedarray.Uint8Array,
      plaintext: js.typedarray.Uint8Array,
      associatedData: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    def seal(
      nonce: js.typedarray.Uint8Array,
      plaintext: js.typedarray.Uint8Array,
      associatedData: js.typedarray.Uint8Array,
      dst: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    def seal(
      nonce: js.typedarray.Uint8Array,
      plaintext: js.typedarray.Uint8Array,
      associatedData: Unit,
      dst: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    
    /**
      * Byte length of authentication tag included in the sealed ciphertext.
      * Result of seal() will be longer than plaintext for this number of bytes.
      */
    var tagLength: Double = js.native
  }
}
