package typings.reactNativeDrawer

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.ScaledSize
import typings.reactNative.mod.ViewStyle
import typings.reactNativeDrawer.reactNativeDrawerStrings.bottom
import typings.reactNativeDrawer.reactNativeDrawerStrings.closed
import typings.reactNativeDrawer.reactNativeDrawerStrings.displace
import typings.reactNativeDrawer.reactNativeDrawerStrings.left
import typings.reactNativeDrawer.reactNativeDrawerStrings.open
import typings.reactNativeDrawer.reactNativeDrawerStrings.overlay
import typings.reactNativeDrawer.reactNativeDrawerStrings.right
import typings.reactNativeDrawer.reactNativeDrawerStrings.static
import typings.reactNativeDrawer.reactNativeDrawerStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-drawer", JSImport.Default)
  @js.native
  open class default () extends Drawer
  
  @js.native
  trait Drawer
    extends Component[DrawerProperties, js.Object, Any] {
    
    /** Close the drawer programmatically. */
    def close(): Unit = js.native
    
    /** Open the drawer programmatically. */
    def open(): Unit = js.native
  }
  
  trait DrawerProperties extends StObject {
    
    /**
      * Toggle drawer when double tap occurs within pan mask?
      */
    var acceptDoubleTap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow for drawer pan (on touch drag). Set to false to effectively
      * disable the drawer while still allowing programmatic control
      */
    var acceptPan: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow Pan when drawer is 'open'
      */
    var acceptPanOnDrawer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Toggle drawer when any tap occurs within pan mask?
      */
    var acceptTap: js.UndefOr[Boolean] = js.undefined
    
    // Gestures
    /**
      * If true, will capture all gestures inside of the pan mask. If 'open' will
      * only capture when drawer is open
      */
    var captureGestures: js.UndefOr[Boolean | open | closed] = js.undefined
    
    // Important
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Same as openDrawerOffset, except defines left hand margin when drawer is closed
      */
    var closedDrawerOffset: js.UndefOr[js.Function0[Double] | Double] = js.undefined
    
    /**
      * Menu component
      */
    var content: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If true the drawer can not be opened and will not respond to pans
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Android-only) Sets the elevation of the drawer using Android's underlying elevation API
      */
    var elevation: js.UndefOr[Double] = js.undefined
    
    /**
      * Initialize with drawer open
      */
    var initializeOpen: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, attempts to handle only horizontal swipes, making it play well with a child ScrollView
      */
    var negotiatePan: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will be called immediately after the drawer has entered the closed state
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Ccallback fired at the start of a close animation
      */
    var onCloseStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback fired when a drag gesture starts.
      */
    var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    // Event Handlers
    /**
      * Will be called immediately after the drawer has entered the open state
      */
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback fired at the start of an open animation
      */
    var onOpenStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If true will trigger drawer open, if false will trigger close.
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Can either be a integer (pixel value) or decimal (ratio of screen width). Defines the right hand margin when
      * the drawer is open. Or, can be function which returns offset
      */
    var openDrawerOffset: js.UndefOr[(js.Function1[/* viewport */ ScaledSize, Double]) | Double] = js.undefined
    
    /**
      * Ratio of screen width that is valid for the start of a pan close action. If null -> defaults to max(.05, openDrawerOffset)
      */
    var panCloseMask: js.UndefOr[Double] = js.undefined
    
    /**
      * Ratio of screen width that is valid for the start of a pan open action. If null -> defaults to max(.05, closedDrawerOffset)
      */
    var panOpenMask: js.UndefOr[Double] = js.undefined
    
    // Additional Configurations
    /**
      * Ratio of screen width that must be travelled to trigger a drawer open/close
      */
    var panThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * which side the drawer should be on.
      */
    var side: js.UndefOr[left | right | top | bottom] = js.undefined
    
    /**
      * Styles for the drawer, main, drawerOverlay and mainOverlay container Views
      */
    var styles: js.UndefOr[DrawerStyles] = js.undefined
    
    /**
      * Same as acceptTap, except only for close
      */
    var tapToClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The duration of the open/close animation
      */
    var tweenDuration: js.UndefOr[Double] = js.undefined
    
    /**
      *  A easing type supported by tween-functions
      */
    var tweenEasing: js.UndefOr[TweenFunctions] = js.undefined
    
    // Animation / Tween
    /**
      * Takes in the pan ratio (decimal 0 to 1) that represents the tween percent. Returns an object of
      * native props to be set on the constituent views
      */
    var tweenHandler: js.UndefOr[js.Function1[/* ratio */ Double, NestedViewStyles]] = js.undefined
    
    /**
      * Type of drawer
      */
    var `type`: js.UndefOr[displace | overlay | static] = js.undefined
    
    /**
      * if true will run InteractionManager for open/close animations.
      */
    var useInteractionManager: js.UndefOr[Boolean] = js.undefined
  }
  object DrawerProperties {
    
    inline def apply(): DrawerProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawerProperties] (val x: Self) extends AnyVal {
      
      inline def setAcceptDoubleTap(value: Boolean): Self = StObject.set(x, "acceptDoubleTap", value.asInstanceOf[js.Any])
      
      inline def setAcceptDoubleTapUndefined: Self = StObject.set(x, "acceptDoubleTap", js.undefined)
      
      inline def setAcceptPan(value: Boolean): Self = StObject.set(x, "acceptPan", value.asInstanceOf[js.Any])
      
      inline def setAcceptPanOnDrawer(value: Boolean): Self = StObject.set(x, "acceptPanOnDrawer", value.asInstanceOf[js.Any])
      
      inline def setAcceptPanOnDrawerUndefined: Self = StObject.set(x, "acceptPanOnDrawer", js.undefined)
      
      inline def setAcceptPanUndefined: Self = StObject.set(x, "acceptPan", js.undefined)
      
      inline def setAcceptTap(value: Boolean): Self = StObject.set(x, "acceptTap", value.asInstanceOf[js.Any])
      
      inline def setAcceptTapUndefined: Self = StObject.set(x, "acceptTap", js.undefined)
      
      inline def setCaptureGestures(value: Boolean | open | closed): Self = StObject.set(x, "captureGestures", value.asInstanceOf[js.Any])
      
      inline def setCaptureGesturesUndefined: Self = StObject.set(x, "captureGestures", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClosedDrawerOffset(value: js.Function0[Double] | Double): Self = StObject.set(x, "closedDrawerOffset", value.asInstanceOf[js.Any])
      
      inline def setClosedDrawerOffsetFunction0(value: () => Double): Self = StObject.set(x, "closedDrawerOffset", js.Any.fromFunction0(value))
      
      inline def setClosedDrawerOffsetUndefined: Self = StObject.set(x, "closedDrawerOffset", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setInitializeOpen(value: Double): Self = StObject.set(x, "initializeOpen", value.asInstanceOf[js.Any])
      
      inline def setInitializeOpenUndefined: Self = StObject.set(x, "initializeOpen", js.undefined)
      
      inline def setNegotiatePan(value: Boolean): Self = StObject.set(x, "negotiatePan", value.asInstanceOf[js.Any])
      
      inline def setNegotiatePanUndefined: Self = StObject.set(x, "negotiatePan", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseStart(value: () => Unit): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction0(value))
      
      inline def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenStart(value: () => Unit): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction0(value))
      
      inline def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenDrawerOffset(value: (js.Function1[/* viewport */ ScaledSize, Double]) | Double): Self = StObject.set(x, "openDrawerOffset", value.asInstanceOf[js.Any])
      
      inline def setOpenDrawerOffsetFunction1(value: /* viewport */ ScaledSize => Double): Self = StObject.set(x, "openDrawerOffset", js.Any.fromFunction1(value))
      
      inline def setOpenDrawerOffsetUndefined: Self = StObject.set(x, "openDrawerOffset", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPanCloseMask(value: Double): Self = StObject.set(x, "panCloseMask", value.asInstanceOf[js.Any])
      
      inline def setPanCloseMaskUndefined: Self = StObject.set(x, "panCloseMask", js.undefined)
      
      inline def setPanOpenMask(value: Double): Self = StObject.set(x, "panOpenMask", value.asInstanceOf[js.Any])
      
      inline def setPanOpenMaskUndefined: Self = StObject.set(x, "panOpenMask", js.undefined)
      
      inline def setPanThreshold(value: Double): Self = StObject.set(x, "panThreshold", value.asInstanceOf[js.Any])
      
      inline def setPanThresholdUndefined: Self = StObject.set(x, "panThreshold", js.undefined)
      
      inline def setSide(value: left | right | top | bottom): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setStyles(value: DrawerStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTapToClose(value: Boolean): Self = StObject.set(x, "tapToClose", value.asInstanceOf[js.Any])
      
      inline def setTapToCloseUndefined: Self = StObject.set(x, "tapToClose", js.undefined)
      
      inline def setTweenDuration(value: Double): Self = StObject.set(x, "tweenDuration", value.asInstanceOf[js.Any])
      
      inline def setTweenDurationUndefined: Self = StObject.set(x, "tweenDuration", js.undefined)
      
      inline def setTweenEasing(value: TweenFunctions): Self = StObject.set(x, "tweenEasing", value.asInstanceOf[js.Any])
      
      inline def setTweenEasingUndefined: Self = StObject.set(x, "tweenEasing", js.undefined)
      
      inline def setTweenHandler(value: /* ratio */ Double => NestedViewStyles): Self = StObject.set(x, "tweenHandler", js.Any.fromFunction1(value))
      
      inline def setTweenHandlerUndefined: Self = StObject.set(x, "tweenHandler", js.undefined)
      
      inline def setType(value: displace | overlay | static): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseInteractionManager(value: Boolean): Self = StObject.set(x, "useInteractionManager", value.asInstanceOf[js.Any])
      
      inline def setUseInteractionManagerUndefined: Self = StObject.set(x, "useInteractionManager", js.undefined)
    }
  }
  
  trait DrawerStyles
    extends StObject
       with NestedViewStyles {
    
    var drawer: js.UndefOr[ViewStyle] = js.undefined
  }
  object DrawerStyles {
    
    inline def apply(): DrawerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawerStyles] (val x: Self) extends AnyVal {
      
      inline def setDrawer(value: ViewStyle): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      inline def setDrawerUndefined: Self = StObject.set(x, "drawer", js.undefined)
    }
  }
  
  trait NestedViewStyles extends StObject {
    
    var drawerOverlay: js.UndefOr[ViewStyle] = js.undefined
    
    var main: js.UndefOr[ViewStyle] = js.undefined
    
    var mainOverlay: js.UndefOr[ViewStyle] = js.undefined
  }
  object NestedViewStyles {
    
    inline def apply(): NestedViewStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedViewStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NestedViewStyles] (val x: Self) extends AnyVal {
      
      inline def setDrawerOverlay(value: ViewStyle): Self = StObject.set(x, "drawerOverlay", value.asInstanceOf[js.Any])
      
      inline def setDrawerOverlayUndefined: Self = StObject.set(x, "drawerOverlay", js.undefined)
      
      inline def setMain(value: ViewStyle): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainOverlay(value: ViewStyle): Self = StObject.set(x, "mainOverlay", value.asInstanceOf[js.Any])
      
      inline def setMainOverlayUndefined: Self = StObject.set(x, "mainOverlay", js.undefined)
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeDrawer.reactNativeDrawerStrings.linear
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInQuad
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuad
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuad
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInCubic
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutCubic
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCubic
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInQuart
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuart
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuart
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInQuint
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuint
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuint
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInSine
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutSine
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutSine
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInExpo
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutExpo
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutExpo
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInCirc
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutCirc
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCirc
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInElastic
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutElastic
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutElastic
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInBack
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutBack
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBack
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInBounce
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutBounce
    - typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBounce
  */
  trait TweenFunctions extends StObject
  object TweenFunctions {
    
    inline def easeInBack: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInBack = "easeInBack".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInBack]
    
    inline def easeInBounce: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInBounce = "easeInBounce".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInBounce]
    
    inline def easeInCirc: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInCirc = "easeInCirc".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInCirc]
    
    inline def easeInCubic: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInCubic = "easeInCubic".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInCubic]
    
    inline def easeInElastic: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInElastic = "easeInElastic".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInElastic]
    
    inline def easeInExpo: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInExpo = "easeInExpo".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInExpo]
    
    inline def easeInOutBack: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBack = "easeInOutBack".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBack]
    
    inline def easeInOutBounce: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBounce = "easeInOutBounce".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBounce]
    
    inline def easeInOutCirc: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCirc = "easeInOutCirc".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCirc]
    
    inline def easeInOutCubic: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCubic]
    
    inline def easeInOutElastic: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutElastic = "easeInOutElastic".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutElastic]
    
    inline def easeInOutExpo: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutExpo = "easeInOutExpo".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutExpo]
    
    inline def easeInOutQuad: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuad]
    
    inline def easeInOutQuart: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuart]
    
    inline def easeInOutQuint: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuint]
    
    inline def easeInOutSine: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutSine = "easeInOutSine".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInOutSine]
    
    inline def easeInQuad: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInQuad = "easeInQuad".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInQuad]
    
    inline def easeInQuart: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInQuart = "easeInQuart".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInQuart]
    
    inline def easeInQuint: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInQuint = "easeInQuint".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInQuint]
    
    inline def easeInSine: typings.reactNativeDrawer.reactNativeDrawerStrings.easeInSine = "easeInSine".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeInSine]
    
    inline def easeOutBack: typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutBack = "easeOutBack".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutBack]
    
    inline def easeOutBounce: typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutBounce = "easeOutBounce".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutBounce]
    
    inline def easeOutCirc: typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutCirc = "easeOutCirc".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutCirc]
    
    inline def easeOutCubic: typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutCubic]
    
    inline def easeOutElastic: typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutElastic = "easeOutElastic".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutElastic]
    
    inline def easeOutExpo: typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutExpo = "easeOutExpo".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutExpo]
    
    inline def easeOutQuad: typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuad]
    
    inline def easeOutQuart: typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuart]
    
    inline def easeOutQuint: typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuint]
    
    inline def easeOutSine: typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutSine = "easeOutSine".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.easeOutSine]
    
    inline def linear: typings.reactNativeDrawer.reactNativeDrawerStrings.linear = "linear".asInstanceOf[typings.reactNativeDrawer.reactNativeDrawerStrings.linear]
  }
}
