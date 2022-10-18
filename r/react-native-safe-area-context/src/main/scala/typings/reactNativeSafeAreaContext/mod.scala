package typings.reactNativeSafeAreaContext

import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactNativeSafeAreaContext.libTypescriptSafeAreaContextMod.SafeAreaProviderProps
import typings.reactNativeSafeAreaContext.libTypescriptSafeAreaContextMod.WithSafeAreaInsetsProps
import typings.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.EdgeInsets
import typings.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.Metrics
import typings.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.Rect
import typings.reactNativeSafeAreaContext.libTypescriptSafeAreaViewMod.NativeSafeAreaViewInstance
import typings.reactNativeSafeAreaContext.libTypescriptSafeAreaViewMod.SafeAreaViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-safe-area-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-safe-area-context", "SafeAreaConsumer")
  @js.native
  val SafeAreaConsumer: Consumer[EdgeInsets | Null] = js.native
  
  @JSImport("react-native-safe-area-context", "SafeAreaContext")
  @js.native
  val SafeAreaContext: Context[EdgeInsets | Null] = js.native
  
  @JSImport("react-native-safe-area-context", "SafeAreaFrameContext")
  @js.native
  val SafeAreaFrameContext: Context[Rect | Null] = js.native
  
  @JSImport("react-native-safe-area-context", "SafeAreaInsetsContext")
  @js.native
  val SafeAreaInsetsContext: Context[EdgeInsets | Null] = js.native
  
  inline def SafeAreaProvider(hasChildrenInitialMetricsInitialSafeAreaInsetsStyleOthers: SafeAreaProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SafeAreaProvider")(hasChildrenInitialMetricsInitialSafeAreaInsetsStyleOthers.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-native-safe-area-context", "SafeAreaView")
  @js.native
  val SafeAreaView: ForwardRefExoticComponent[SafeAreaViewProps & RefAttributes[NativeSafeAreaViewInstance]] = js.native
  
  @JSImport("react-native-safe-area-context", "initialWindowMetrics")
  @js.native
  val initialWindowMetrics: Metrics | Null = js.native
  
  @JSImport("react-native-safe-area-context", "initialWindowSafeAreaInsets")
  @js.native
  val initialWindowSafeAreaInsets: EdgeInsets | Null = js.native
  
  inline def useSafeArea(): EdgeInsets = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeArea")().asInstanceOf[EdgeInsets]
  
  inline def useSafeAreaFrame(): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeAreaFrame")().asInstanceOf[Rect]
  
  inline def useSafeAreaInsets(): EdgeInsets = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeAreaInsets")().asInstanceOf[EdgeInsets]
  
  inline def withSafeAreaInsets[T](WrappedComponent: ComponentType[T & WithSafeAreaInsetsProps]): ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSafeAreaInsets")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[Any]]]
}
