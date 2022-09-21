package typings.stegcloak

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stegcloak", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StegCloak {
    def this(encryption: Boolean, hmac: Boolean) = this()
    
    /* CompleteClass */
    override def hide(secret: String, password: String, cover: String): String = js.native
    
    /* CompleteClass */
    override def reveal(data: String, password: String): String = js.native
  }
  
  trait StegCloak extends StObject {
    
    def hide(secret: String, password: String, cover: String): String
    
    def reveal(data: String, password: String): String
  }
  object StegCloak {
    
    inline def apply(hide: (String, String, String) => String, reveal: (String, String) => String): StegCloak = {
      val __obj = js.Dynamic.literal(hide = js.Any.fromFunction3(hide), reveal = js.Any.fromFunction2(reveal))
      __obj.asInstanceOf[StegCloak]
    }
    
    extension [Self <: StegCloak](x: Self) {
      
      inline def setHide(value: (String, String, String) => String): Self = StObject.set(x, "hide", js.Any.fromFunction3(value))
      
      inline def setReveal(value: (String, String) => String): Self = StObject.set(x, "reveal", js.Any.fromFunction2(value))
    }
  }
}
