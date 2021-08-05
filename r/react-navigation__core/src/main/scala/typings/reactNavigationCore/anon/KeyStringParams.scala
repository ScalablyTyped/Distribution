package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyStringParams[RouteName /* <: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String */] extends StObject {
  
  var key: String
  
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[RouteName] */ js.Any
  ] = js.undefined
}
object KeyStringParams {
  
  inline def apply[RouteName /* <: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String */](key: String): KeyStringParams[RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyStringParams[RouteName]]
  }
  
  extension [Self <: KeyStringParams[?], RouteName /* <: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String */](x: Self & KeyStringParams[RouteName]) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
