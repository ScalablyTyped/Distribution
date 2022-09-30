package typings.reactNativeScreens

import typings.react.mod.global.JSX.Element
import typings.reactNativeScreens.typesMod.NativeStackNavigationEventMap
import typings.reactNativeScreens.typesMod.NativeStackNavigationOptions
import typings.reactNativeScreens.typesMod.NativeStackNavigatorProps
import typings.reactNavigationCore.typesMod.TypedNavigator
import typings.reactNavigationRouters.stackRouterMod.StackNavigationState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigatorsCreateNativeStackNavigatorMod {
  
  @JSImport("react-native-screens/lib/typescript/native-stack/navigators/createNativeStackNavigator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ParamList /* <: Record[String, js.UndefOr[js.Object]] */](): TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    NativeStackNavigationOptions, 
    NativeStackNavigationEventMap, 
    js.Function1[
      /* hasInitialRouteNameChildrenScreenOptionsRest */ NativeStackNavigatorProps, 
      Element
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    NativeStackNavigationOptions, 
    NativeStackNavigationEventMap, 
    js.Function1[
      /* hasInitialRouteNameChildrenScreenOptionsRest */ NativeStackNavigatorProps, 
      Element
    ]
  ]]
}
