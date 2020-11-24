package typings.reactNativeDrawer.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ScaledSize
import typings.reactNativeDrawer.reactNativeDrawerStrings.bottom
import typings.reactNativeDrawer.reactNativeDrawerStrings.closed
import typings.reactNativeDrawer.reactNativeDrawerStrings.displace
import typings.reactNativeDrawer.reactNativeDrawerStrings.left
import typings.reactNativeDrawer.reactNativeDrawerStrings.open
import typings.reactNativeDrawer.reactNativeDrawerStrings.overlay
import typings.reactNativeDrawer.reactNativeDrawerStrings.right
import typings.reactNativeDrawer.reactNativeDrawerStrings.static
import typings.reactNativeDrawer.reactNativeDrawerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerProperties extends js.Object {
  
  /**
    * Toggle drawer when double tap occurs within pan mask?
    */
  var acceptDoubleTap: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow for drawer pan (on touch drag). Set to false to effectively
    * disable the drawer while still allowing programmatic control
    */
  var acceptPan: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow Pan when drawer is 'open'
    */
  var acceptPanOnDrawer: js.UndefOr[Boolean] = js.native
  
  /**
    * Toggle drawer when any tap occurs within pan mask?
    */
  var acceptTap: js.UndefOr[Boolean] = js.native
  
  // Gestures
  /**
    * If true, will capture all gestures inside of the pan mask. If 'open' will
    * only capture when drawer is open
    */
  var captureGestures: js.UndefOr[Boolean | open | closed] = js.native
  
  /**
    * Same as openDrawerOffset, except defines left hand margin when drawer is closed
    */
  var closedDrawerOffset: js.UndefOr[js.Function0[Double] | Double] = js.native
  
  // Important
  /**
    * Menu component
    */
  var content: js.UndefOr[ReactNode] = js.native
  
  /**
    * If true the drawer can not be opened and will not respond to pans
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Android-only) Sets the elevation of the drawer using Android's underlying elevation API
    */
  var elevation: js.UndefOr[Double] = js.native
  
  /**
    * Initialize with drawer open
    */
  var initializeOpen: js.UndefOr[Double] = js.native
  
  /**
    * If true, attempts to handle only horizontal swipes, making it play well with a child ScrollView
    */
  var negotiatePan: js.UndefOr[Boolean] = js.native
  
  /**
    * Will be called immediately after the drawer has entered the closed state
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Ccallback fired at the start of a close animation
    */
  var onCloseStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback fired when a drag gesture starts.
    */
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  // Event Handlers
  /**
    * Will be called immediately after the drawer has entered the open state
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback fired at the start of an open animation
    */
  var onOpenStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * If true will trigger drawer open, if false will trigger close.
    */
  var open: js.UndefOr[Boolean] = js.native
  
  /**
    * Can either be a integer (pixel value) or decimal (ratio of screen width). Defines the right hand margin when
    * the drawer is open. Or, can be function which returns offset
    */
  var openDrawerOffset: js.UndefOr[(js.Function1[/* viewport */ ScaledSize, Double]) | Double] = js.native
  
  /**
    * Ratio of screen width that is valid for the start of a pan close action. If null -> defaults to max(.05, openDrawerOffset)
    */
  var panCloseMask: js.UndefOr[Double] = js.native
  
  /**
    * Ratio of screen width that is valid for the start of a pan open action. If null -> defaults to max(.05, closedDrawerOffset)
    */
  var panOpenMask: js.UndefOr[Double] = js.native
  
  // Additional Configurations
  /**
    * Ratio of screen width that must be travelled to trigger a drawer open/close
    */
  var panThreshold: js.UndefOr[Double] = js.native
  
  /**
    * which side the drawer should be on.
    */
  var side: js.UndefOr[left | right | top | bottom] = js.native
  
  /**
    * Styles for the drawer, main, drawerOverlay and mainOverlay container Views
    */
  var styles: js.UndefOr[DrawerStyles] = js.native
  
  /**
    * Same as acceptTap, except only for close
    */
  var tapToClose: js.UndefOr[Boolean] = js.native
  
  /**
    * The duration of the open/close animation
    */
  var tweenDuration: js.UndefOr[Double] = js.native
  
  /**
    *  A easing type supported by tween-functions
    */
  var tweenEasing: js.UndefOr[TweenFunctions] = js.native
  
  // Animation / Tween
  /**
    * Takes in the pan ratio (decimal 0 to 1) that represents the tween percent. Returns an object of
    * native props to be set on the constituent views
    */
  var tweenHandler: js.UndefOr[js.Function1[/* ratio */ Double, NestedViewStyles]] = js.native
  
  /**
    * Type of drawer
    */
  var `type`: js.UndefOr[displace | overlay | static] = js.native
  
  /**
    * if true will run InteractionManager for open/close animations.
    */
  var useInteractionManager: js.UndefOr[Boolean] = js.native
}
object DrawerProperties {
  
  @scala.inline
  def apply(): DrawerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerProperties]
  }
  
  @scala.inline
  implicit class DrawerPropertiesOps[Self <: DrawerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptDoubleTap(value: Boolean): Self = this.set("acceptDoubleTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptDoubleTap: Self = this.set("acceptDoubleTap", js.undefined)
    
    @scala.inline
    def setAcceptPan(value: Boolean): Self = this.set("acceptPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptPan: Self = this.set("acceptPan", js.undefined)
    
    @scala.inline
    def setAcceptPanOnDrawer(value: Boolean): Self = this.set("acceptPanOnDrawer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptPanOnDrawer: Self = this.set("acceptPanOnDrawer", js.undefined)
    
    @scala.inline
    def setAcceptTap(value: Boolean): Self = this.set("acceptTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptTap: Self = this.set("acceptTap", js.undefined)
    
    @scala.inline
    def setCaptureGestures(value: Boolean | open | closed): Self = this.set("captureGestures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureGestures: Self = this.set("captureGestures", js.undefined)
    
    @scala.inline
    def setClosedDrawerOffsetFunction0(value: () => Double): Self = this.set("closedDrawerOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosedDrawerOffset(value: js.Function0[Double] | Double): Self = this.set("closedDrawerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosedDrawerOffset: Self = this.set("closedDrawerOffset", js.undefined)
    
    @scala.inline
    def setContent(value: ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    
    @scala.inline
    def setInitializeOpen(value: Double): Self = this.set("initializeOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitializeOpen: Self = this.set("initializeOpen", js.undefined)
    
    @scala.inline
    def setNegotiatePan(value: Boolean): Self = this.set("negotiatePan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegotiatePan: Self = this.set("negotiatePan", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnCloseStart(value: () => Unit): Self = this.set("onCloseStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCloseStart: Self = this.set("onCloseStart", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: () => Unit): Self = this.set("onDragStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnOpenStart(value: () => Unit): Self = this.set("onOpenStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpenStart: Self = this.set("onOpenStart", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOpenDrawerOffsetFunction1(value: /* viewport */ ScaledSize => Double): Self = this.set("openDrawerOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenDrawerOffset(value: (js.Function1[/* viewport */ ScaledSize, Double]) | Double): Self = this.set("openDrawerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenDrawerOffset: Self = this.set("openDrawerOffset", js.undefined)
    
    @scala.inline
    def setPanCloseMask(value: Double): Self = this.set("panCloseMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanCloseMask: Self = this.set("panCloseMask", js.undefined)
    
    @scala.inline
    def setPanOpenMask(value: Double): Self = this.set("panOpenMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanOpenMask: Self = this.set("panOpenMask", js.undefined)
    
    @scala.inline
    def setPanThreshold(value: Double): Self = this.set("panThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanThreshold: Self = this.set("panThreshold", js.undefined)
    
    @scala.inline
    def setSide(value: left | right | top | bottom): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    
    @scala.inline
    def setStyles(value: DrawerStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTapToClose(value: Boolean): Self = this.set("tapToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapToClose: Self = this.set("tapToClose", js.undefined)
    
    @scala.inline
    def setTweenDuration(value: Double): Self = this.set("tweenDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTweenDuration: Self = this.set("tweenDuration", js.undefined)
    
    @scala.inline
    def setTweenEasing(value: TweenFunctions): Self = this.set("tweenEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTweenEasing: Self = this.set("tweenEasing", js.undefined)
    
    @scala.inline
    def setTweenHandler(value: /* ratio */ Double => NestedViewStyles): Self = this.set("tweenHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTweenHandler: Self = this.set("tweenHandler", js.undefined)
    
    @scala.inline
    def setType(value: displace | overlay | static): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseInteractionManager(value: Boolean): Self = this.set("useInteractionManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseInteractionManager: Self = this.set("useInteractionManager", js.undefined)
  }
}
