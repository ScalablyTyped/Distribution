package typings.stablelibHkdf

import org.scalablytyped.runtime.Instantiable0
import typings.stablelibHash.mod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/hkdf", "HKDF")
  @js.native
  open class HKDF protected () extends StObject {
    /**
      * Create a new HKDF instance for the given hash function
      * with the master key, optional salt, and info.
      *
      * - Master key is a high-entropy secret key (not a password).
      * - Salt is a non-secret random value.
      * - Info is application- and/or context-specific information.
      */
    def this(hash: Instantiable0[Hash], key: js.typedarray.Uint8Array) = this()
    def this(hash: Instantiable0[Hash], key: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array) = this()
    def this(
      hash: Instantiable0[Hash],
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      info: js.typedarray.Uint8Array
    ) = this()
    def this(
      hash: Instantiable0[Hash],
      key: js.typedarray.Uint8Array,
      salt: Unit,
      info: js.typedarray.Uint8Array
    ) = this()
    
    /* private */ var _buffer: Any = js.native
    
    /* private */ var _bufpos: Any = js.native
    
    /* private */ var _counter: Any = js.native
    
    /* private */ var _fillBuffer: Any = js.native
    
    /* private */ var _hash: Any = js.native
    
    /* private */ var _hmac: Any = js.native
    
    /* private */ var _info: Any = js.native
    
    def clean(): Unit = js.native
    
    /**
      * Expand returns next key material of the given length.
      *
      * It throws if expansion limit is reached (which is
      * 254 digests of the underlying HMAC function).
      */
    def expand(length: Double): js.typedarray.Uint8Array = js.native
  }
}
