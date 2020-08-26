package typings.reactMdUtils.focusContainerMod

import typings.reactMdUtils.reactMdUtilsStrings.first
import typings.reactMdUtils.reactMdUtilsStrings.last
import typings.reactMdUtils.usePreviousFocusMod.FocusFallback
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusContainerOptionsProps extends js.Object {
  /**
    * This is the element that should be focused by default when the component is
    * mounted.  This can either be the first or last focusable item or a query
    * selector string that is run against this component to focus.
    */
  var defaultFocus: js.UndefOr[first | last | String] = js.native
  /**
    * By default, the focus container will try to maintain a cache of the
    * focusable elements that is updated only when this component re-renders. If
    * the children are extremely dynamic and focusable elements can be
    * removed/added without this component updating, you should disable the cache
    * so that the focusable elements are updated each time the tab key is
    * pressed. Disabling the cache will be slightly slower for larger focusable
    * areas, but it might not be too bad.
    *
    * NOTE: The only important elements are the *first* and *last* elements in
    * this list.  So if your children aren't changing the first and last
    * elements, there's no need to disable the cache.
    */
  var disableFocusCache: js.UndefOr[Boolean] = js.native
  /**
    * The default behavior for the focus container is to focus an element once it
    * is mounted and the `disabled` prop is not enabled. This behavior can be
    * disabled if this is not wanted for some reason.
    */
  var disableFocusOnMount: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the element that gets focused on mount should try to not scroll
    * the focused element into view which is the default behavior. This should
    * normally remain `false`, but it is useful to set to `true` if the
    * `FocusContainer` is within a transition that appears offscreen.
    */
  var disableFocusOnMountScroll: js.UndefOr[Boolean] = js.native
  /**
    * The default behavior for the focus container is to attempt to focus the
    * element that was focused before the focus container was mounted since it is
    * generally used for temporary material. If there are cases where this
    * behavior is not wanted, you can enable this prop.
    */
  var disableFocusOnUnmount: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the focus behavior should be disabled. This should really be
    * used if you are using nested focus containers for temporary material (such
    * as dialogs or menus).
    */
  var disableTabFocusWrap: js.UndefOr[Boolean] = js.native
  /**
    * When the focus container unmounts, it will attempt to re-focus the element
    * that was focused before the focus container was mounted unless the
    * `disableFocusOnUnmount` prop is enabled. There might be cases where
    * unmounting the focus container causes the page to re-render and the
    * previous element no longer exists. When this happens keyboard users _might_
    * have a problem navigating through the page again depending on how the
    * browser implemented the native tab behavior so this prop allows you to
    * ensure that a specific element is focused in these cases.
    *
    * This can either be a query selector string, a specific HTMLElement, or a
    * function that finds a specific HTMLElement to focus.
    */
  var unmountFocusFallback: js.UndefOr[FocusFallback] = js.native
}

object FocusContainerOptionsProps {
  @scala.inline
  def apply(): FocusContainerOptionsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusContainerOptionsProps]
  }
  @scala.inline
  implicit class FocusContainerOptionsPropsOps[Self <: FocusContainerOptionsProps] (val x: Self) extends AnyVal {
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
    def setDefaultFocus(value: first | last | String): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFocus: Self = this.set("defaultFocus", js.undefined)
    @scala.inline
    def setDisableFocusCache(value: Boolean): Self = this.set("disableFocusCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFocusCache: Self = this.set("disableFocusCache", js.undefined)
    @scala.inline
    def setDisableFocusOnMount(value: Boolean): Self = this.set("disableFocusOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFocusOnMount: Self = this.set("disableFocusOnMount", js.undefined)
    @scala.inline
    def setDisableFocusOnMountScroll(value: Boolean): Self = this.set("disableFocusOnMountScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFocusOnMountScroll: Self = this.set("disableFocusOnMountScroll", js.undefined)
    @scala.inline
    def setDisableFocusOnUnmount(value: Boolean): Self = this.set("disableFocusOnUnmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFocusOnUnmount: Self = this.set("disableFocusOnUnmount", js.undefined)
    @scala.inline
    def setDisableTabFocusWrap(value: Boolean): Self = this.set("disableTabFocusWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTabFocusWrap: Self = this.set("disableTabFocusWrap", js.undefined)
    @scala.inline
    def setUnmountFocusFallbackFunction0(value: () => HTMLElement | Null): Self = this.set("unmountFocusFallback", js.Any.fromFunction0(value))
    @scala.inline
    def setUnmountFocusFallback(value: FocusFallback): Self = this.set("unmountFocusFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmountFocusFallback: Self = this.set("unmountFocusFallback", js.undefined)
    @scala.inline
    def setUnmountFocusFallbackNull: Self = this.set("unmountFocusFallback", null)
  }
  
}

