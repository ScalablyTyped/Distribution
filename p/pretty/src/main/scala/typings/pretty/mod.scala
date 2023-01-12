package typings.pretty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(str: String, options: PrettyOptions): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("pretty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PrettyOptions extends StObject {
    
    var ocd: Boolean
  }
  object PrettyOptions {
    
    inline def apply(ocd: Boolean): PrettyOptions = {
      val __obj = js.Dynamic.literal(ocd = ocd.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrettyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrettyOptions] (val x: Self) extends AnyVal {
      
      inline def setOcd(value: Boolean): Self = StObject.set(x, "ocd", value.asInstanceOf[js.Any])
    }
  }
}
