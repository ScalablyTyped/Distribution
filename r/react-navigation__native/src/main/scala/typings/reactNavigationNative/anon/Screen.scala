package typings.reactNavigationNative.anon

import typings.reactNavigationCore.typesMod.global.ReactNavigation.RootParamList
import typings.reactNavigationNative.useLinkToMod._To
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screen[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: RootParamList */]
  extends StObject
     with _To[ParamList, RouteName] {
  
  var params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  
  var screen: Extract[RouteName, String]
}
object Screen {
  
  inline def apply[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: RootParamList */](
    params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any,
    screen: Extract[RouteName, String]
  ): Screen[RouteName, ParamList] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen[RouteName, ParamList]]
  }
  
  extension [Self <: Screen[?, ?], RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: RootParamList */](x: Self & (Screen[RouteName, ParamList])) {
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setScreen(value: Extract[RouteName, String]): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
  }
}
