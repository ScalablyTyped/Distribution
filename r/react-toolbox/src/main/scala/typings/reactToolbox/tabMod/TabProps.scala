package typings.reactToolbox.tabMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabProps
  extends Props
     with /**
  * Additional properties passed to inner input element.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * If true, the current component is visible.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Additional class name to provide custom styling for the active tab.
    */
  var activeClassName: js.UndefOr[String] = js.native
  /**
    * If true, the current component is not clickable.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * If true, the current component is not visible.
    * @default false
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Icon to be used in inner FontIcon.
    */
  var icon: js.UndefOr[ReactNode] = js.native
  /**
    * Label text for navigation header.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Callback function that is fired when the tab is activated.
    */
  var onActive: js.UndefOr[js.Function] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TabTheme] = js.native
}

object TabProps {
  @scala.inline
  def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  @scala.inline
  implicit class TabPropsOps[Self <: TabProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setActiveClassName(value: String): Self = this.set("activeClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClassName: Self = this.set("activeClassName", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnActive(value: js.Function): Self = this.set("onActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnActive: Self = this.set("onActive", js.undefined)
    @scala.inline
    def setTheme(value: TabTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

