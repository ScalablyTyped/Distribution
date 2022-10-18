package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
  
  var params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
}
object `3` {
  
  inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](
    params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ): `3`[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`[ParamList, RouteName]]
  }
  
  extension [Self <: `3`[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](x: Self & (`3`[ParamList, RouteName])) {
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
