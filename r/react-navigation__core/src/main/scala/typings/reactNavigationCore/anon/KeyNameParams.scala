package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyNameParams[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */] extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var name: RouteName
  
  var params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
}
object KeyNameParams {
  
  inline def apply[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */](
    name: RouteName,
    params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ): KeyNameParams[RouteName, ParamList] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyNameParams[RouteName, ParamList]]
  }
  
  extension [Self <: KeyNameParams[?, ?], RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */](x: Self & (KeyNameParams[RouteName, ParamList])) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
