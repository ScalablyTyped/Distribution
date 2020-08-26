package typings.reactToolbox.tabsTabsMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.display
import typings.reactToolbox.reactToolboxStrings.unmounted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Disable the animation below the active tab.
    * @default false
    */
  var disableAnimatedBottomBorder: js.UndefOr[Boolean] = js.native
  /**
    * If True, the tabs will be fixed, covering the whole width.
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * `unmounted` mode will not mount the tab content of inactive tabs.
    * `display` mode will mount but hide inactive tabs.
    * Consider holding state outside of the Tabs component before using `display` mode
    * @default unmounted
    */
  var hideMode: js.UndefOr[display | unmounted] = js.native
  /**
    * Current
    * @default 0
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * If True, the tabs will have an inverse style.
    */
  var inverse: js.UndefOr[Boolean] = js.native
  /**
    * Callback function that is fired when the tab changes.
    */
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TabsTheme] = js.native
}

object TabsProps {
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisableAnimatedBottomBorder(value: Boolean): Self = this.set("disableAnimatedBottomBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAnimatedBottomBorder: Self = this.set("disableAnimatedBottomBorder", js.undefined)
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setHideMode(value: display | unmounted): Self = this.set("hideMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideMode: Self = this.set("hideMode", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setOnChange(value: js.Function): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setTheme(value: TabsTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

