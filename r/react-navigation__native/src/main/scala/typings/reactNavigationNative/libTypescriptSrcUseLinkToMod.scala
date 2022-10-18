package typings.reactNavigationNative

import typings.reactNavigationCore.libTypescriptSrcTypesMod.global.ReactNavigation.RootParamList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseLinkToMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useLinkTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ParamList /* <: RootParamList */](): js.Function1[/* to */ To[ParamList, /* keyof ParamList */ String], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* to */ To[ParamList, /* keyof ParamList */ String], Unit]]
  
  type To[ParamList /* <: RootParamList */, RouteName /* <: /* keyof ParamList */ String */] = String | (/* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? {  screen :std.Extract<RouteName, string>,   params :ParamList[RouteName] | undefined} : {  screen :std.Extract<RouteName, string>,   params :ParamList[RouteName]} */ js.Any)
}
