package typings.reactToolbox.tabContentMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabContentProps extends Props {
  /**
    * Whether tab is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Tab content.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Current tab index.
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TabContentTheme] = js.native
}

object TabContentProps {
  @scala.inline
  def apply(): TabContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabContentProps]
  }
  @scala.inline
  implicit class TabContentPropsOps[Self <: TabContentProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTheme(value: TabContentTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

