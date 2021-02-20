package typings.reactNativeSafeAreaView

import org.scalablytyped.runtime.Shortcut
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
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
  
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_bottom(key: bottom): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_bottom(key: bottom, isLandscape: Boolean): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_left(key: left): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_left(key: left, isLandscape: Boolean): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_right(key: right): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_right(key: right, isLandscape: Boolean): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_top(key: top): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_top(key: top, isLandscape: Boolean): Double = js.native
  
  @JSImport("react-native-safe-area-view", "getStatusBarHeight")
  @js.native
  def getStatusBarHeight(): Double = js.native
  @JSImport("react-native-safe-area-view", "getStatusBarHeight")
  @js.native
  def getStatusBarHeight(isLandscape: Boolean): Double = js.native
  
  @JSImport("react-native-safe-area-view", "withSafeArea")
  @js.native
  def withSafeArea[P /* <: js.Object */](): js.Function1[/* Component */ ComponentType[P], ComponentType[P with SafeAreaViewProps]] = js.native
  @JSImport("react-native-safe-area-view", "withSafeArea")
  @js.native
  def withSafeArea[P /* <: js.Object */](safeAreaViewProps: SafeAreaViewProps): js.Function1[/* Component */ ComponentType[P], ComponentType[P with SafeAreaViewProps]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.always
    - typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.never
  */
  trait SafeAreaViewForceInsetValue extends StObject
  object SafeAreaViewForceInsetValue {
    
    @scala.inline
    def always: typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.always = "always".asInstanceOf[typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.always]
    
    @scala.inline
    def never: typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.never = "never".asInstanceOf[typings.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.never]
  }
  
  @js.native
  trait SafeAreaViewProps extends ViewProps {
    
    var forceInset: js.UndefOr[Bottom] = js.native
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
      def setForceInset(value: Bottom): Self = StObject.set(x, "forceInset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceInsetUndefined: Self = StObject.set(x, "forceInset", js.undefined)
    }
  }
  
  type _To = ComponentClass[SafeAreaViewProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[SafeAreaViewProps, ComponentState] = default
}
