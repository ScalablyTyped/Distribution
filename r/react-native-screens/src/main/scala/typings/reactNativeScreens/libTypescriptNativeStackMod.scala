package typings.reactNativeScreens

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactNativeScreens.libTypescriptNativeStackTypesMod.NativeStackNavigationEventMap
import typings.reactNativeScreens.libTypescriptNativeStackTypesMod.NativeStackNavigationOptions
import typings.reactNativeScreens.libTypescriptNativeStackTypesMod.NativeStackNavigatorProps
import typings.reactNativeScreens.libTypescriptNativeStackViewsNativeStackViewMod.Props
import typings.reactNavigationCore.libTypescriptSrcTypesMod.TypedNavigator
import typings.reactNavigationRouters.libTypescriptSrcStackRouterMod.StackNavigationState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNativeStackMod {
  
  @JSImport("react-native-screens/lib/typescript/native-stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-screens/lib/typescript/native-stack", "HeaderHeightContext")
  @js.native
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  
  inline def NativeStackView(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NativeStackView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createNativeStackNavigator[ParamList /* <: Record[String, js.UndefOr[js.Object]] */](): TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    NativeStackNavigationOptions, 
    NativeStackNavigationEventMap, 
    js.Function1[
      /* hasInitialRouteNameChildrenScreenOptionsRest */ NativeStackNavigatorProps, 
      Element
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeStackNavigator")().asInstanceOf[TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    NativeStackNavigationOptions, 
    NativeStackNavigationEventMap, 
    js.Function1[
      /* hasInitialRouteNameChildrenScreenOptionsRest */ NativeStackNavigatorProps, 
      Element
    ]
  ]]
  
  inline def useHeaderHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useHeaderHeight")().asInstanceOf[Double]
}
