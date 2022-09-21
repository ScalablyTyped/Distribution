package typings.rfdc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Function1[/* input */ Any, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[/* input */ Any, Any]]
  inline def apply(options: Options): js.Function1[/* input */ Any, Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ Any, Any]]
  
  @JSImport("rfdc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var circles: js.UndefOr[Boolean] = js.undefined
    
    var proto: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCircles(value: Boolean): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
      
      inline def setCirclesUndefined: Self = StObject.set(x, "circles", js.undefined)
      
      inline def setProto(value: Boolean): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      inline def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    }
  }
}
