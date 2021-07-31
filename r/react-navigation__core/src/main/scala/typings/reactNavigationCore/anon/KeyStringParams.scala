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
  
  @scala.inline
  def apply[RouteName /* <: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String */](key: String): KeyStringParams[RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyStringParams[RouteName]]
  }
  
  @scala.inline
  implicit class KeyStringParamsMutableBuilder[Self <: KeyStringParams[?], RouteName /* <: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String */] (val x: Self & KeyStringParams[RouteName]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
