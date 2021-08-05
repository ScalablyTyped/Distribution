package typings.reactNativeSafeAreaView

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactNative.mod.ViewProps
import typings.reactNativeSafeAreaView.anon.Bottom
import typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.bottom
import typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.left
import typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.right
import typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-safe-area-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-safe-area-view", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[SafeAreaViewProps, ComponentState, js.Any] {
    def this(props: SafeAreaViewProps) = this()
    def this(props: SafeAreaViewProps, context: js.Any) = this()
  }
  @JSImport("react-native-safe-area-view", JSImport.Default)
  @js.native
  val default: ComponentClass[SafeAreaViewProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-safe-area-view", "SafeAreaView")
  @js.native
  class SafeAreaView protected ()
    extends Component[SafeAreaViewProps, ComponentState, js.Any] {
    def this(props: SafeAreaViewProps) = this()
    def this(props: SafeAreaViewProps, context: js.Any) = this()
  }
  @JSImport("react-native-safe-area-view", "SafeAreaView")
  @js.native
  val SafeAreaView: ComponentClass[SafeAreaViewProps, ComponentState] = js.native
  
  inline def getInset_bottom(key: bottom): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInset")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getInset_bottom(key: bottom, isLandscape: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInset")(key.asInstanceOf[js.Any], isLandscape.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getInset_left(key: left): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInset")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getInset_left(key: left, isLandscape: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInset")(key.asInstanceOf[js.Any], isLandscape.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getInset_right(key: right): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInset")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getInset_right(key: right, isLandscape: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInset")(key.asInstanceOf[js.Any], isLandscape.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getInset_top(key: top): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInset")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getInset_top(key: top, isLandscape: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInset")(key.asInstanceOf[js.Any], isLandscape.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getStatusBarHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarHeight")().asInstanceOf[Double]
  inline def getStatusBarHeight(isLandscape: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarHeight")(isLandscape.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def withSafeArea[P /* <: js.Object */](): js.Function1[/* Component */ ComponentType[P], ComponentType[P & SafeAreaViewProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSafeArea")().asInstanceOf[js.Function1[/* Component */ ComponentType[P], ComponentType[P & SafeAreaViewProps]]]
  inline def withSafeArea[P /* <: js.Object */](safeAreaViewProps: SafeAreaViewProps): js.Function1[/* Component */ ComponentType[P], ComponentType[P & SafeAreaViewProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSafeArea")(safeAreaViewProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ComponentType[P], ComponentType[P & SafeAreaViewProps]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.always
    - typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.never
  */
  trait SafeAreaViewForceInsetValue extends StObject
  object SafeAreaViewForceInsetValue {
    
    inline def always: typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.always = "always".asInstanceOf[typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.always]
    
    inline def never: typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.never = "never".asInstanceOf[typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.never]
  }
  
  trait SafeAreaViewProps
    extends StObject
       with ViewProps {
    
    var forceInset: js.UndefOr[Bottom] = js.undefined
  }
  object SafeAreaViewProps {
    
    inline def apply(): SafeAreaViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeAreaViewProps]
    }
    
    extension [Self <: SafeAreaViewProps](x: Self) {
      
      inline def setForceInset(value: Bottom): Self = StObject.set(x, "forceInset", value.asInstanceOf[js.Any])
      
      inline def setForceInsetUndefined: Self = StObject.set(x, "forceInset", js.undefined)
    }
  }
}
