package typings.reactNavigationNative

import typings.reactNavigationCore.typesMod.global.ReactNavigation.RootParamList
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLinkToMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useLinkTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ParamList /* <: RootParamList */](): js.Function1[/* to */ To[ParamList, /* keyof ParamList */ String], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* to */ To[ParamList, /* keyof ParamList */ String], Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.reactNavigationNative.anon.Screen[RouteName, ParamList]
    - typings.reactNavigationNative.anon.Params[RouteName, ParamList]
  */
  type To[ParamList /* <: RootParamList */, RouteName /* <: /* keyof ParamList */ String */] = (_To[ParamList, RouteName]) | String
  
  trait _To[ParamList /* <: RootParamList */, RouteName /* <: /* keyof ParamList */ String */] extends StObject
  object _To {
    
    inline def Params[ParamList /* <: RootParamList */, RouteName /* <: /* keyof ParamList */ String */](screen: Extract[RouteName, String]): typings.reactNavigationNative.anon.Params[ParamList, RouteName] = {
      val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationNative.anon.Params[ParamList, RouteName]]
    }
    
    inline def Screen[ParamList /* <: RootParamList */, RouteName /* <: /* keyof ParamList */ String */](
      params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any,
      screen: Extract[RouteName, String]
    ): typings.reactNavigationNative.anon.Screen[ParamList, RouteName] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationNative.anon.Screen[ParamList, RouteName]]
    }
  }
}
