package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.Dragging
import typings.reactNative.reactNativeStrings.Idle
import typings.reactNative.reactNativeStrings.Settling
import typings.reactNative.reactNativeStrings.`on-drag`
import typings.reactNative.reactNativeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewPagerAndroidProps extends ViewProps {
  /**
    * Index of initial page that should be selected. Use `setPage` method to
    * update the page, and `onPageSelected` to monitor page changes
    */
  var initialPage: js.UndefOr[Double] = js.native
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    *   - 'none' (the default), drags do not dismiss the keyboard.
    *   - 'on-drag', the keyboard is dismissed when a drag begins.
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.native
  /**
    * Executed when transitioning between pages (ether because of animation for
    * the requested page change or when user is swiping/dragging between pages)
    * The `event.nativeEvent` object for this callback will carry following data:
    *  - position - index of first page from the left that is currently visible
    *  - offset - value from range [0,1) describing stage between page transitions.
    *    Value x means that (1 - x) fraction of the page at "position" index is
    *    visible, and x fraction of the next page is visible.
    */
  var onPageScroll: js.UndefOr[
    js.Function1[/* event */ NativeSyntheticEvent[ViewPagerAndroidOnPageScrollEventData], Unit]
  ] = js.native
  /**
    * Function called when the page scrolling state has changed.
    * The page scrolling state can be in 3 states:
    * - idle, meaning there is no interaction with the page scroller happening at the time
    * - dragging, meaning there is currently an interaction with the page scroller
    * - settling, meaning that there was an interaction with the page scroller, and the
    *   page scroller is now finishing it's closing or opening animation
    */
  var onPageScrollStateChanged: js.UndefOr[js.Function1[/* state */ Idle | Dragging | Settling, Unit]] = js.native
  /**
    * This callback will be called once ViewPager finish navigating to selected page
    * (when user swipes between pages). The `event.nativeEvent` object passed to this
    * callback will have following fields:
    *  - position - index of page that has been selected
    */
  var onPageSelected: js.UndefOr[
    js.Function1[/* event */ NativeSyntheticEvent[ViewPagerAndroidOnPageSelectedEventData], Unit]
  ] = js.native
  /**
    * Blank space to show between pages. This is only visible while scrolling, pages are still
    * edge-to-edge.
    */
  var pageMargin: js.UndefOr[Double] = js.native
  /**
    * When false, the content does not scroll.
    * The default value is true.
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.native
}

object ViewPagerAndroidProps {
  @scala.inline
  def apply(): ViewPagerAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPagerAndroidProps]
  }
  @scala.inline
  implicit class ViewPagerAndroidPropsOps[Self <: ViewPagerAndroidProps] (val x: Self) extends AnyVal {
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
    def setInitialPage(value: Double): Self = this.set("initialPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPage: Self = this.set("initialPage", js.undefined)
    @scala.inline
    def setKeyboardDismissMode(value: none | `on-drag`): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardDismissMode: Self = this.set("keyboardDismissMode", js.undefined)
    @scala.inline
    def setOnPageScroll(value: /* event */ NativeSyntheticEvent[ViewPagerAndroidOnPageScrollEventData] => Unit): Self = this.set("onPageScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageScroll: Self = this.set("onPageScroll", js.undefined)
    @scala.inline
    def setOnPageScrollStateChanged(value: /* state */ Idle | Dragging | Settling => Unit): Self = this.set("onPageScrollStateChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageScrollStateChanged: Self = this.set("onPageScrollStateChanged", js.undefined)
    @scala.inline
    def setOnPageSelected(value: /* event */ NativeSyntheticEvent[ViewPagerAndroidOnPageSelectedEventData] => Unit): Self = this.set("onPageSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageSelected: Self = this.set("onPageSelected", js.undefined)
    @scala.inline
    def setPageMargin(value: Double): Self = this.set("pageMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageMargin: Self = this.set("pageMargin", js.undefined)
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
  }
  
}

