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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-safe-area-context", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val SafeAreaConsumer: Consumer[EdgeInsets | Null] = js.native
  
  val SafeAreaContext: Context[EdgeInsets | Null] = js.native
  
  val SafeAreaFrameContext: Context[Rect | Null] = js.native
  
  val SafeAreaInsetsContext: Context[EdgeInsets | Null] = js.native
  
  def SafeAreaProvider(hasChildrenInitialMetricsInitialSafeAreaInsetsStyle: SafeAreaViewProps): Element = js.native
  
  def SafeAreaView(hasStyleModeEdgesRest: NativeSafeAreaViewProps): Element = js.native
  
  val initialWindowMetrics: Metrics | Null = js.native
  
  val initialWindowSafeAreaInsets: EdgeInsets | Null = js.native
  
  def useSafeArea(): EdgeInsets = js.native
  
  def useSafeAreaFrame(): Rect = js.native
  
  def useSafeAreaInsets(): EdgeInsets = js.native
  
  def withSafeAreaInsets[T](WrappedComponent: ComponentType[T]): ForwardRefExoticComponent[PropsWithoutRef[T] with RefAttributes[T]] = js.native
}
