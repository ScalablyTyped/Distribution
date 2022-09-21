package typings.reactNativeSafeAreaContext

import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ViewProps
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAreaContextMod {
  
  @JSImport("react-native-safe-area-context/lib/typescript/SafeAreaContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/SafeAreaContext", "SafeAreaConsumer")
  @js.native
  val SafeAreaConsumer: Consumer[EdgeInsets | Null] = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/SafeAreaContext", "SafeAreaContext")
  @js.native
  val SafeAreaContext: Context[EdgeInsets | Null] = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/SafeAreaContext", "SafeAreaFrameContext")
  @js.native
  val SafeAreaFrameContext: Context[Rect | Null] = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/SafeAreaContext", "SafeAreaInsetsContext")
  @js.native
  val SafeAreaInsetsContext: Context[EdgeInsets | Null] = js.native
  
  inline def SafeAreaProvider(hasChildrenInitialMetricsInitialSafeAreaInsetsStyleOthers: SafeAreaProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SafeAreaProvider")(hasChildrenInitialMetricsInitialSafeAreaInsetsStyleOthers.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useSafeArea(): EdgeInsets = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeArea")().asInstanceOf[EdgeInsets]
  
  inline def useSafeAreaFrame(): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeAreaFrame")().asInstanceOf[Rect]
  
  inline def useSafeAreaInsets(): EdgeInsets = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeAreaInsets")().asInstanceOf[EdgeInsets]
  
  inline def withSafeAreaInsets[T](WrappedComponent: ComponentType[T & WithSafeAreaInsetsProps]): ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSafeAreaInsets")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[Any]]]
  
  trait SafeAreaProviderProps
    extends StObject
       with ViewProps {
    
    var initialMetrics: js.UndefOr[Metrics | Null] = js.undefined
    
    /**
      * @deprecated
      */
    var initialSafeAreaInsets: js.UndefOr[EdgeInsets | Null] = js.undefined
  }
  object SafeAreaProviderProps {
    
    inline def apply(): SafeAreaProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeAreaProviderProps]
    }
    
    extension [Self <: SafeAreaProviderProps](x: Self) {
      
      inline def setInitialMetrics(value: Metrics): Self = StObject.set(x, "initialMetrics", value.asInstanceOf[js.Any])
      
      inline def setInitialMetricsNull: Self = StObject.set(x, "initialMetrics", null)
      
      inline def setInitialMetricsUndefined: Self = StObject.set(x, "initialMetrics", js.undefined)
      
      inline def setInitialSafeAreaInsets(value: EdgeInsets): Self = StObject.set(x, "initialSafeAreaInsets", value.asInstanceOf[js.Any])
      
      inline def setInitialSafeAreaInsetsNull: Self = StObject.set(x, "initialSafeAreaInsets", null)
      
      inline def setInitialSafeAreaInsetsUndefined: Self = StObject.set(x, "initialSafeAreaInsets", js.undefined)
    }
  }
  
  trait WithSafeAreaInsetsProps extends StObject {
    
    var insets: EdgeInsets
  }
  object WithSafeAreaInsetsProps {
    
    inline def apply(insets: EdgeInsets): WithSafeAreaInsetsProps = {
      val __obj = js.Dynamic.literal(insets = insets.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithSafeAreaInsetsProps]
    }
    
    extension [Self <: WithSafeAreaInsetsProps](x: Self) {
      
      inline def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
    }
  }
}
