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
  
  inline def SafeAreaProvider(hasChildrenInitialMetricsInitialSafeAreaInsetsStyle: SafeAreaViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SafeAreaProvider")(hasChildrenInitialMetricsInitialSafeAreaInsetsStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useSafeArea(): EdgeInsets = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeArea")().asInstanceOf[EdgeInsets]
  
  inline def useSafeAreaFrame(): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeAreaFrame")().asInstanceOf[Rect]
  
  inline def useSafeAreaInsets(): EdgeInsets = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeAreaInsets")().asInstanceOf[EdgeInsets]
  
  inline def withSafeAreaInsets[T](WrappedComponent: ComponentType[T]): ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSafeAreaInsets")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[T]]]
  
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
    
    inline def apply(): SafeAreaViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeAreaViewProps]
    }
    
    extension [Self <: SafeAreaViewProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialMetrics(value: Metrics): Self = StObject.set(x, "initialMetrics", value.asInstanceOf[js.Any])
      
      inline def setInitialMetricsNull: Self = StObject.set(x, "initialMetrics", null)
      
      inline def setInitialMetricsUndefined: Self = StObject.set(x, "initialMetrics", js.undefined)
      
      inline def setInitialSafeAreaInsets(value: EdgeInsets): Self = StObject.set(x, "initialSafeAreaInsets", value.asInstanceOf[js.Any])
      
      inline def setInitialSafeAreaInsetsNull: Self = StObject.set(x, "initialSafeAreaInsets", null)
      
      inline def setInitialSafeAreaInsetsUndefined: Self = StObject.set(x, "initialSafeAreaInsets", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
