package typings.reactNativeSafeAreaContext

import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAreaContextMod {
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "SafeAreaConsumer")
  @js.native
  val SafeAreaConsumer: Consumer[EdgeInsets | Null] = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "SafeAreaContext")
  @js.native
  val SafeAreaContext: Context[EdgeInsets | Null] = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "SafeAreaFrameContext")
  @js.native
  val SafeAreaFrameContext: Context[Rect | Null] = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "SafeAreaInsetsContext")
  @js.native
  val SafeAreaInsetsContext: Context[EdgeInsets | Null] = js.native
  
  @scala.inline
  def SafeAreaProvider(hasChildrenInitialMetricsInitialSafeAreaInsetsStyle: SafeAreaViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SafeAreaProvider")(hasChildrenInitialMetricsInitialSafeAreaInsetsStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def useSafeArea(): EdgeInsets = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeArea")().asInstanceOf[EdgeInsets]
  
  @scala.inline
  def useSafeAreaFrame(): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeAreaFrame")().asInstanceOf[Rect]
  
  @scala.inline
  def useSafeAreaInsets(): EdgeInsets = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeAreaInsets")().asInstanceOf[EdgeInsets]
  
  @scala.inline
  def withSafeAreaInsets[T](WrappedComponent: ComponentType[T]): ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSafeAreaInsets")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[T]]]
  
  trait SafeAreaViewProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var initialMetrics: js.UndefOr[Metrics | Null] = js.undefined
    
    /**
      * @deprecated
      */
    var initialSafeAreaInsets: js.UndefOr[EdgeInsets | Null] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object SafeAreaViewProps {
    
    @scala.inline
    def apply(): SafeAreaViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeAreaViewProps]
    }
    
    @scala.inline
    implicit class SafeAreaViewPropsMutableBuilder[Self <: SafeAreaViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialMetrics(value: Metrics): Self = StObject.set(x, "initialMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialMetricsNull: Self = StObject.set(x, "initialMetrics", null)
      
      @scala.inline
      def setInitialMetricsUndefined: Self = StObject.set(x, "initialMetrics", js.undefined)
      
      @scala.inline
      def setInitialSafeAreaInsets(value: EdgeInsets): Self = StObject.set(x, "initialSafeAreaInsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSafeAreaInsetsNull: Self = StObject.set(x, "initialSafeAreaInsets", null)
      
      @scala.inline
      def setInitialSafeAreaInsetsUndefined: Self = StObject.set(x, "initialSafeAreaInsets", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
