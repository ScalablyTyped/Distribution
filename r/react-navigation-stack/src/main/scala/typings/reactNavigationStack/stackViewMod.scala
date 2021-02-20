package typings.reactNavigationStack

import typings.react.mod.Component
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.anon.ClosingRouteKeys
import typings.reactNavigationStack.anon.Descriptors
import typings.reactNavigationStack.anon.ReadonlyProps
import typings.reactNavigationStack.anon.ReadonlyState
import typings.reactNavigationStack.vendorTypesMod.Route
import typings.reactNavigationStack.vendorTypesMod.StackCardMode
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typings.reactNavigationStack.vendorTypesMod.StackNavigationHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackViewMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/StackView", JSImport.Default)
  @js.native
  class default () extends StackView
  /* static members */
  object default {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/StackView", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | Descriptors = js.native
  }
  
  /* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackNavigationConfig & {  state :react-navigation.react-navigation.NavigationState,   navigation :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackNavigationHelpers,   descriptors :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackDescriptorMap,   screenProps :unknown} */
  @js.native
  trait Props extends StObject {
    
    var descriptors: StackDescriptorMap = js.native
    
    /**
      * Whether inactive screens should be detached from the view hierarchy to save memory.
      * Make sure to call `enableScreens` from `react-native-screens` to make it work.
      * Defaults to `true` on Android, depends on the version of `react-native-screens` on iOS.
      */
    var detachInactiveScreens: js.UndefOr[Boolean] = js.native
    
    var headerMode: js.UndefOr[StackHeaderMode] = js.native
    
    /**
      * If `false`, the keyboard will NOT automatically dismiss when navigating to a new screen.
      * Defaults to `true`.
      */
    var keyboardHandlingEnabled: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[StackCardMode] = js.native
    
    var navigation: StackNavigationHelpers = js.native
    
    var screenProps: js.Any = js.native
    
    var state: NavigationState = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
      descriptors: StackDescriptorMap,
      navigation: StackNavigationHelpers,
      screenProps: js.Any,
      state: NavigationState
    ): Props = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachInactiveScreensUndefined: Self = StObject.set(x, "detachInactiveScreens", js.undefined)
      
      @scala.inline
      def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderModeUndefined: Self = StObject.set(x, "headerMode", js.undefined)
      
      @scala.inline
      def setKeyboardHandlingEnabled(value: Boolean): Self = StObject.set(x, "keyboardHandlingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardHandlingEnabledUndefined: Self = StObject.set(x, "keyboardHandlingEnabled", js.undefined)
      
      @scala.inline
      def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNavigation(value: StackNavigationHelpers): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenProps(value: js.Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: NavigationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StackView
    extends Component[Props, State, js.Any] {
    
    var getGesturesEnabled: js.Any = js.native
    
    var getPreviousRoute: js.Any = js.native
    
    var handleCloseRoute: js.Any = js.native
    
    var handleGestureCancel: js.Any = js.native
    
    var handleGestureEnd: js.Any = js.native
    
    var handleGestureStart: js.Any = js.native
    
    var handleOpenRoute: js.Any = js.native
    
    var handleTransitionComplete: js.Any = js.native
    
    var handleTransitionEnd: js.Any = js.native
    
    var handleTransitionStart: js.Any = js.native
    
    var renderHeader: js.Any = js.native
    
    var renderScene: js.Any = js.native
  }
  
  @js.native
  trait State extends StObject {
    
    var closingRouteKeys: js.Array[String] = js.native
    
    var descriptors: StackDescriptorMap = js.native
    
    var openingRouteKeys: js.Array[String] = js.native
    
    var previousDescriptors: StackDescriptorMap = js.native
    
    var previousRoutes: js.Array[Route[String]] = js.native
    
    var replacingRouteKeys: js.Array[String] = js.native
    
    var routes: js.Array[Route[String]] = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      closingRouteKeys: js.Array[String],
      descriptors: StackDescriptorMap,
      openingRouteKeys: js.Array[String],
      previousDescriptors: StackDescriptorMap,
      previousRoutes: js.Array[Route[String]],
      replacingRouteKeys: js.Array[String],
      routes: js.Array[Route[String]]
    ): State = {
      val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], replacingRouteKeys = replacingRouteKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "closingRouteKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosingRouteKeysVarargs(value: String*): Self = StObject.set(x, "closingRouteKeys", js.Array(value :_*))
      
      @scala.inline
      def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpeningRouteKeys(value: js.Array[String]): Self = StObject.set(x, "openingRouteKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpeningRouteKeysVarargs(value: String*): Self = StObject.set(x, "openingRouteKeys", js.Array(value :_*))
      
      @scala.inline
      def setPreviousDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "previousDescriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousRoutes(value: js.Array[Route[String]]): Self = StObject.set(x, "previousRoutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousRoutesVarargs(value: Route[String]*): Self = StObject.set(x, "previousRoutes", js.Array(value :_*))
      
      @scala.inline
      def setReplacingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "replacingRouteKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacingRouteKeysVarargs(value: String*): Self = StObject.set(x, "replacingRouteKeys", js.Array(value :_*))
      
      @scala.inline
      def setRoutes(value: js.Array[Route[String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: Route[String]*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
}
