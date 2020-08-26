package typings.reactMdTabs.tabPanelsMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabPanelsProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Boolean if this component should no longer automatically reset the scrolling
    * to the top when the panel changes.
    */
  var disableScrollFix: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the swiping transition should be disabled. If you want to add
    * a custom transition, you'll need to wrap the `TabPanel`'s children in a
    * custom component that does appear and exit animations.
    */
  var disableTransition: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the conditional rendering for the active tab panel only should
    * be disabled. This means that all the children will be visible in the DOM
    * instead of mounting and unmounting when their active state changes. The
    * panels will also be updated to ensure that inactive panels can not be
    * tab focusable.
    */
  var persistent: js.UndefOr[Boolean] = js.native
}

object TabPanelsProps {
  @scala.inline
  def apply(): TabPanelsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabPanelsProps]
  }
  @scala.inline
  implicit class TabPanelsPropsOps[Self <: TabPanelsProps] (val x: Self) extends AnyVal {
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
    def setDisableScrollFix(value: Boolean): Self = this.set("disableScrollFix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScrollFix: Self = this.set("disableScrollFix", js.undefined)
    @scala.inline
    def setDisableTransition(value: Boolean): Self = this.set("disableTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTransition: Self = this.set("disableTransition", js.undefined)
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
  }
  
}

