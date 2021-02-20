package typings.reactNativeSafeAreaContext

import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactNativeSafeAreaContext.safeAreaContextMod.SafeAreaViewProps
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.NativeSafeAreaViewProps
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("react-native-safe-area-context", "SafeAreaProvider")
  @js.native
  def SafeAreaProvider(hasChildrenInitialMetricsInitialSafeAreaInsetsStyle: SafeAreaViewProps): Element = js.native
  
  @JSImport("react-native-safe-area-context", "SafeAreaView")
  @js.native
  def SafeAreaView(hasStyleModeEdgesRest: NativeSafeAreaViewProps): Element = js.native
  
  @JSImport("react-native-safe-area-context", "initialWindowMetrics")
  @js.native
  val initialWindowMetrics: Metrics | Null = js.native
  
  @JSImport("react-native-safe-area-context", "initialWindowSafeAreaInsets")
  @js.native
  val initialWindowSafeAreaInsets: EdgeInsets | Null = js.native
  
  @JSImport("react-native-safe-area-context", "useSafeArea")
  @js.native
  def useSafeArea(): EdgeInsets = js.native
  
  @JSImport("react-native-safe-area-context", "useSafeAreaFrame")
  @js.native
  def useSafeAreaFrame(): Rect = js.native
  
  @JSImport("react-native-safe-area-context", "useSafeAreaInsets")
  @js.native
  def useSafeAreaInsets(): EdgeInsets = js.native
  
  @JSImport("react-native-safe-area-context", "withSafeAreaInsets")
  @js.native
  def withSafeAreaInsets[T](WrappedComponent: ComponentType[T]): ForwardRefExoticComponent[PropsWithoutRef[T] with RefAttributes[T]] = js.native
}
