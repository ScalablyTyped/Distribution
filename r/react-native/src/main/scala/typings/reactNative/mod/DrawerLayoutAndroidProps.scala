package typings.reactNative.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.reactNativeStrings.Dragging
import typings.reactNative.reactNativeStrings.Idle
import typings.reactNative.reactNativeStrings.Settling
import typings.reactNative.reactNativeStrings.`locked-closed`
import typings.reactNative.reactNativeStrings.`locked-open`
import typings.reactNative.reactNativeStrings.`on-drag`
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.unlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerLayoutAndroidProps extends ViewProps {
  /**
    * Specifies the background color of the drawer. The default value
    * is white. If you want to set the opacity of the drawer, use rgba.
    * Example:
    * return (
    *   <DrawerLayoutAndroid drawerBackgroundColor="rgba(0,0,0,0.5)">
    *   </DrawerLayoutAndroid>
    *);
    */
  var drawerBackgroundColor: js.UndefOr[ColorValue] = js.native
  /**
    * Specifies the lock mode of the drawer. The drawer can be locked
    * in 3 states:
    *
    * - unlocked (default), meaning that the drawer will respond
    *   (open/close) to touch gestures.
    *
    * - locked-closed, meaning that the drawer will stay closed and not
    *   respond to gestures.
    *
    * - locked-open, meaning that the drawer will stay opened and
    *   not respond to gestures. The drawer may still be opened and
    *   closed programmatically (openDrawer/closeDrawer).
    */
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.native
  /**
    * Specifies the side of the screen from which the drawer will slide in.
    * enum(DrawerLayoutAndroid.positions.Left, DrawerLayoutAndroid.positions.Right)
    */
  var drawerPosition: js.UndefOr[Double] = js.native
  /**
    * Specifies the width of the drawer, more precisely the width of the
    * view that be pulled in from the edge of the window.
    */
  var drawerWidth: js.UndefOr[Double] = js.native
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    * - 'none' (the default), drags do not dismiss the keyboard.
    * - 'on-drag', the keyboard is dismissed when a drag begins.
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.native
  /**
    * Function called whenever the navigation view has been closed.
    */
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function called whenever the navigation view has been opened.
    */
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function called whenever there is an interaction with the navigation view.
    */
  var onDrawerSlide: js.UndefOr[js.Function1[/* event */ DrawerSlideEvent, Unit]] = js.native
  /**
    * Function called when the drawer state has changed.
    * The drawer can be in 3 states:
    * - idle, meaning there is no interaction with the navigation
    *   view happening at the time
    * - dragging, meaning there is currently an interaction with the
    *   navigation view
    * - settling, meaning that there was an interaction with the
    *   navigation view, and the navigation view is now finishing
    *   it's closing or opening animation
    */
  var onDrawerStateChanged: js.UndefOr[js.Function1[/* event */ Idle | Dragging | Settling, Unit]] = js.native
  /**
    * Make the drawer take the entire screen and draw the background of
    * the status bar to allow it to open over the status bar. It will
    * only have an effect on API 21+.
    */
  var statusBarBackgroundColor: js.UndefOr[ColorValue] = js.native
  /**
    * The navigation view that will be rendered to the side of the
    * screen and can be pulled in.
    */
  def renderNavigationView(): Element = js.native
}

object DrawerLayoutAndroidProps {
  @scala.inline
  def apply(renderNavigationView: () => Element): DrawerLayoutAndroidProps = {
    val __obj = js.Dynamic.literal(renderNavigationView = js.Any.fromFunction0(renderNavigationView))
    __obj.asInstanceOf[DrawerLayoutAndroidProps]
  }
  @scala.inline
  implicit class DrawerLayoutAndroidPropsOps[Self <: DrawerLayoutAndroidProps] (val x: Self) extends AnyVal {
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
    def setRenderNavigationView(value: () => Element): Self = this.set("renderNavigationView", js.Any.fromFunction0(value))
    @scala.inline
    def setDrawerBackgroundColor(value: ColorValue): Self = this.set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerBackgroundColor: Self = this.set("drawerBackgroundColor", js.undefined)
    @scala.inline
    def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = this.set("drawerLockMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerLockMode: Self = this.set("drawerLockMode", js.undefined)
    @scala.inline
    def setDrawerPosition(value: Double): Self = this.set("drawerPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerPosition: Self = this.set("drawerPosition", js.undefined)
    @scala.inline
    def setDrawerWidth(value: Double): Self = this.set("drawerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerWidth: Self = this.set("drawerWidth", js.undefined)
    @scala.inline
    def setKeyboardDismissMode(value: none | `on-drag`): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardDismissMode: Self = this.set("keyboardDismissMode", js.undefined)
    @scala.inline
    def setOnDrawerClose(value: () => Unit): Self = this.set("onDrawerClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDrawerClose: Self = this.set("onDrawerClose", js.undefined)
    @scala.inline
    def setOnDrawerOpen(value: () => Unit): Self = this.set("onDrawerOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDrawerOpen: Self = this.set("onDrawerOpen", js.undefined)
    @scala.inline
    def setOnDrawerSlide(value: /* event */ DrawerSlideEvent => Unit): Self = this.set("onDrawerSlide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrawerSlide: Self = this.set("onDrawerSlide", js.undefined)
    @scala.inline
    def setOnDrawerStateChanged(value: /* event */ Idle | Dragging | Settling => Unit): Self = this.set("onDrawerStateChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrawerStateChanged: Self = this.set("onDrawerStateChanged", js.undefined)
    @scala.inline
    def setStatusBarBackgroundColor(value: ColorValue): Self = this.set("statusBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarBackgroundColor: Self = this.set("statusBarBackgroundColor", js.undefined)
  }
  
}

