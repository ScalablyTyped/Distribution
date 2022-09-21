package typings.stablelibChacha20poly1305

import typings.stablelibAead.mod.AEAD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/chacha20poly1305", "ChaCha20Poly1305")
  @js.native
  open class ChaCha20Poly1305 protected ()
    extends StObject
       with AEAD {
    /**
      * Creates a new instance with the given 32-byte key.
      */
    def this(key: js.typedarray.Uint8Array) = this()
    
    /* private */ var _authenticate: Any = js.native
    
    /* private */ var _key: Any = js.native
  }
  
  @JSImport("@stablelib/chacha20poly1305", "KEY_LENGTH")
  @js.native
  val KEY_LENGTH: /* 32 */ Double = js.native
  
  @JSImport("@stablelib/chacha20poly1305", "NONCE_LENGTH")
  @js.native
  val NONCE_LENGTH: /* 12 */ Double = js.native
  
  @JSImport("@stablelib/chacha20poly1305", "TAG_LENGTH")
  @js.native
  val TAG_LENGTH: /* 16 */ Double = js.native
}
