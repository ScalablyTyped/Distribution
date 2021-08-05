package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait C extends StObject {
  
  var a: ParamListBase
  
  var b: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String
}
object C {
  
  inline def apply(
    a: ParamListBase,
    b: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String
  ): C = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[C]
  }
  
  extension [Self <: C](x: Self) {
    
    inline def setA(value: ParamListBase): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(
      value: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String
    ): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
  }
}
