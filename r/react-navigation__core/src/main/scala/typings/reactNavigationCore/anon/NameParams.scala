package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameParams[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: js.Object */] extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var merge: js.UndefOr[Boolean] = js.undefined
  
  var name: RouteName
  
  var params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
}
object NameParams {
  
  inline def apply[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: js.Object */](
    name: RouteName,
    params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ): NameParams[RouteName, ParamList] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameParams[RouteName, ParamList]]
  }
  
  extension [Self <: NameParams[?, ?], RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: js.Object */](x: Self & (NameParams[RouteName, ParamList])) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
