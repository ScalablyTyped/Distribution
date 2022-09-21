package typings.stablelibPoly1305

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/poly1305", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stablelib/poly1305", "DIGEST_LENGTH")
  @js.native
  val DIGEST_LENGTH: /* 16 */ Double = js.native
  
  @JSImport("@stablelib/poly1305", "Poly1305")
  @js.native
  open class Poly1305 protected () extends StObject {
    def this(key: js.typedarray.Uint8Array) = this()
    
    /* private */ var _blocks: Any = js.native
    
    /* private */ var _buffer: Any = js.native
    
    /* private */ var _fin: Any = js.native
    
    /* private */ var _finished: Any = js.native
    
    /* private */ var _h: Any = js.native
    
    /* private */ var _leftover: Any = js.native
    
    /* private */ var _pad: Any = js.native
    
    /* private */ var _r: Any = js.native
    
    def clean(): this.type = js.native
    
    def digest(): js.typedarray.Uint8Array = js.native
    
    val digestLength: /* 16 */ Double = js.native
    
    def finish(mac: js.typedarray.Uint8Array): this.type = js.native
    def finish(mac: js.typedarray.Uint8Array, macpos: Double): this.type = js.native
    
    def update(m: js.typedarray.Uint8Array): this.type = js.native
  }
  
  inline def equal(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def oneTimeAuth(key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("oneTimeAuth")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
