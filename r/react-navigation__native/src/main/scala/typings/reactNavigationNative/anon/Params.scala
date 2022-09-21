package typings.reactNavigationNative.anon

import typings.reactNavigationCore.typesMod.global.ReactNavigation.RootParamList
import typings.reactNavigationNative.useLinkToMod._To
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: RootParamList */]
  extends StObject
     with _To[ParamList, RouteName] {
  
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ] = js.undefined
  
  var screen: Extract[RouteName, String]
}
object Params {
  
  inline def apply[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: RootParamList */](screen: Extract[RouteName, String]): Params[RouteName, ParamList] = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params[RouteName, ParamList]]
  }
  
  extension [Self <: Params[?, ?], RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: RootParamList */](x: Self & (Params[RouteName, ParamList])) {
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setScreen(value: Extract[RouteName, String]): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
  }
}
