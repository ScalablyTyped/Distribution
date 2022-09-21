package typings.reactNativeDrawerLayout

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import typings.reactNativeDrawerLayout.anon.Left
import typings.reactNativeDrawerLayout.anon.Offset
import typings.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.`locked-closed`
import typings.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.`locked-open`
import typings.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.`on-drag`
import typings.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.left
import typings.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.none
import typings.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.right
import typings.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.unlocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-drawer-layout", JSImport.Default)
  @js.native
  open class default () extends DrawerLayout
  /* static members */
  object default {
    
    @JSImport("react-native-drawer-layout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-drawer-layout", "default.positions")
    @js.native
    def positions: Left = js.native
    inline def positions_=(x: Left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positions")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DrawerLayout
    extends Component[DrawerLayoutProperties, js.Object, Any] {
    
    /**
      * Closes the drawer.
      */
    def closeDrawer(): Unit = js.native
    
    /**
      * Opens the drawer.
      */
    def openDrawer(): Unit = js.native
  }
  
  type DrawerLayoutCloseEventHandler = js.Function0[Unit]
  
  type DrawerLayoutOpenEventHandler = js.Function0[Unit]
  
  trait DrawerLayoutProperties
    extends StObject
       with ViewProps {
    
    /**
      * Specifies the background color of the drawer. The default value is white. If you want to set
      * the opacity of the drawer, use rgba.
      */
    var drawerBackgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the lock mode of the drawer. The drawer can be locked in 3 states:
      *
      * - unlocked (default), meaning that the drawer will respond (open/close) to touch gestures.
      * - locked-closed, meaning that the drawer will stay closed and not respond to gestures.
      * - locked-open, meaning that the drawer will stay opened and not respond to gestures.
      *
      * The drawer may still be opened and closed programmatically (`openDrawer`/`closeDrawer`).
      */
    var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.undefined
    
    /**
      * Specifies the side of the screen from which the drawer will slide in.
      */
    var drawerPosition: left | right
    
    /**
      * Specifies the width of the drawer, more precisely the width of the view that be pulled in from
      * the edge of the window.
      */
    var drawerWidth: Double
    
    /**
      * Determines whether the keyboard gets dismissed in response to a drag.
      *
      * - 'none' (the default), drags do not dismiss the keyboard.
      * - 'on-drag', the keyboard is dismissed when a drag begins.
      */
    var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.undefined
    
    /**
      * Function called whenever the navigation view has been closed.
      */
    var onDrawerClose: js.UndefOr[DrawerLayoutCloseEventHandler] = js.undefined
    
    /**
      * Function called whenever the navigation view has been opened.
      */
    var onDrawerOpen: js.UndefOr[DrawerLayoutOpenEventHandler] = js.undefined
    
    /**
      * Function called whenever there is an interaction with the navigation view.
      */
    var onDrawerSlide: js.UndefOr[DrawerLayoutSlideEventHandler] = js.undefined
    
    /**
      * Function called when the drawer state has changed. The drawer can be in 3 states:
      *
      * - idle, meaning there is no interaction with the navigation view happening at the time
      * - dragging, meaning there is currently an interaction with the navigation view
      * - settling, meaning that there was an interaction with the navigation view, and the navigation
      *   view is now finishing its closing or opening animation
      */
    var onDrawerStateChanged: js.UndefOr[DrawerLayoutStateChangeEventHandler] = js.undefined
    
    /**
      * The navigation view that will be rendered to the side of the screen and can be pulled in.
      */
    def renderNavigationView(): ReactNode
    
    /**
      * Make the drawer take the entire screen and draw the background of the status bar to allow it
      * to open over the status bar. It will only have an effect on API 21+.
      */
    var statusBarBackgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Use native driver animations.
      */
    var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  }
  object DrawerLayoutProperties {
    
    inline def apply(drawerPosition: left | right, drawerWidth: Double, renderNavigationView: () => ReactNode): DrawerLayoutProperties = {
      val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any], renderNavigationView = js.Any.fromFunction0(renderNavigationView))
      __obj.asInstanceOf[DrawerLayoutProperties]
    }
    
    extension [Self <: DrawerLayoutProperties](x: Self) {
      
      inline def setDrawerBackgroundColor(value: String): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
      
      inline def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
      
      inline def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
      
      inline def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      inline def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setOnDrawerClose(value: () => Unit): Self = StObject.set(x, "onDrawerClose", js.Any.fromFunction0(value))
      
      inline def setOnDrawerCloseUndefined: Self = StObject.set(x, "onDrawerClose", js.undefined)
      
      inline def setOnDrawerOpen(value: () => Unit): Self = StObject.set(x, "onDrawerOpen", js.Any.fromFunction0(value))
      
      inline def setOnDrawerOpenUndefined: Self = StObject.set(x, "onDrawerOpen", js.undefined)
      
      inline def setOnDrawerSlide(value: /* event */ DrawerLayoutSlideEvent => Unit): Self = StObject.set(x, "onDrawerSlide", js.Any.fromFunction1(value))
      
      inline def setOnDrawerSlideUndefined: Self = StObject.set(x, "onDrawerSlide", js.undefined)
      
      inline def setOnDrawerStateChanged(value: /* state */ String => Unit): Self = StObject.set(x, "onDrawerStateChanged", js.Any.fromFunction1(value))
      
      inline def setOnDrawerStateChangedUndefined: Self = StObject.set(x, "onDrawerStateChanged", js.undefined)
      
      inline def setRenderNavigationView(value: () => ReactNode): Self = StObject.set(x, "renderNavigationView", js.Any.fromFunction0(value))
      
      inline def setStatusBarBackgroundColor(value: String): Self = StObject.set(x, "statusBarBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setStatusBarBackgroundColorUndefined: Self = StObject.set(x, "statusBarBackgroundColor", js.undefined)
      
      inline def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
      
      inline def setUseNativeAnimationsUndefined: Self = StObject.set(x, "useNativeAnimations", js.undefined)
    }
  }
  
  trait DrawerLayoutSlideEvent extends StObject {
    
    var nativeEvent: Offset
  }
  object DrawerLayoutSlideEvent {
    
    inline def apply(nativeEvent: Offset): DrawerLayoutSlideEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerLayoutSlideEvent]
    }
    
    extension [Self <: DrawerLayoutSlideEvent](x: Self) {
      
      inline def setNativeEvent(value: Offset): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type DrawerLayoutSlideEventHandler = js.Function1[/* event */ DrawerLayoutSlideEvent, Unit]
  
  type DrawerLayoutStateChangeEventHandler = js.Function1[/* state */ String, Unit]
}
