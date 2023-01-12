package typings.reactNavigationStack

import typings.react.mod.Component
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.anon.ClosingRouteKeys
import typings.reactNavigationStack.anon.Descriptors
import typings.reactNavigationStack.anon.ReadonlyProps
import typings.reactNavigationStack.anon.ReadonlyState
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackNavigationConfig
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackNavigationHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsStackStackViewMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/StackView", JSImport.Default)
  @js.native
  open class default () extends StackView
  /* static members */
  object default {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/StackView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | Descriptors = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ClosingRouteKeys | Descriptors]
  }
  
  trait Props
    extends StObject
       with StackNavigationConfig {
    
    var descriptors: StackDescriptorMap
    
    var navigation: StackNavigationHelpers
    
    var screenProps: Any
    
    var state: NavigationState
  }
  object Props {
    
    inline def apply(
      descriptors: StackDescriptorMap,
      navigation: StackNavigationHelpers,
      screenProps: Any,
      state: NavigationState
    ): Props = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: StackNavigationHelpers): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setScreenProps(value: Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
      
      inline def setState(value: NavigationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StackView extends Component[Props, State, Any] {
    
    /* private */ var getGesturesEnabled: Any = js.native
    
    /* private */ var getPreviousRoute: Any = js.native
    
    /* private */ var handleCloseRoute: Any = js.native
    
    /* private */ var handleGestureCancel: Any = js.native
    
    /* private */ var handleGestureEnd: Any = js.native
    
    /* private */ var handleGestureStart: Any = js.native
    
    /* private */ var handleOpenRoute: Any = js.native
    
    /* private */ var handleTransitionComplete: Any = js.native
    
    /* private */ var handleTransitionEnd: Any = js.native
    
    /* private */ var handleTransitionStart: Any = js.native
    
    /* private */ var renderHeader: Any = js.native
    
    /* private */ var renderScene: Any = js.native
  }
  
  trait State extends StObject {
    
    var closingRouteKeys: js.Array[String]
    
    var descriptors: StackDescriptorMap
    
    var openingRouteKeys: js.Array[String]
    
    var previousDescriptors: StackDescriptorMap
    
    var previousRoutes: js.Array[Route[String]]
    
    var replacingRouteKeys: js.Array[String]
    
    var routes: js.Array[Route[String]]
  }
  object State {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setClosingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "closingRouteKeys", value.asInstanceOf[js.Any])
      
      inline def setClosingRouteKeysVarargs(value: String*): Self = StObject.set(x, "closingRouteKeys", js.Array(value*))
      
      inline def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setOpeningRouteKeys(value: js.Array[String]): Self = StObject.set(x, "openingRouteKeys", value.asInstanceOf[js.Any])
      
      inline def setOpeningRouteKeysVarargs(value: String*): Self = StObject.set(x, "openingRouteKeys", js.Array(value*))
      
      inline def setPreviousDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "previousDescriptors", value.asInstanceOf[js.Any])
      
      inline def setPreviousRoutes(value: js.Array[Route[String]]): Self = StObject.set(x, "previousRoutes", value.asInstanceOf[js.Any])
      
      inline def setPreviousRoutesVarargs(value: Route[String]*): Self = StObject.set(x, "previousRoutes", js.Array(value*))
      
      inline def setReplacingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "replacingRouteKeys", value.asInstanceOf[js.Any])
      
      inline def setReplacingRouteKeysVarargs(value: String*): Self = StObject.set(x, "replacingRouteKeys", js.Array(value*))
      
      inline def setRoutes(value: js.Array[Route[String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: Route[String]*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
}
