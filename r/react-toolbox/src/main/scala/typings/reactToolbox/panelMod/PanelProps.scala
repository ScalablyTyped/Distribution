package typings.reactToolbox.panelMod

import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelProps extends Props {
  /**
    * You can set it to true in case you are using a pinned Sidebar so it takes an scrolled `div` instead of using the document scroll.
    */
  var bodyScroll: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[PanelTheme] = js.native
}

object PanelProps {
  @scala.inline
  def apply(): PanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelProps]
  }
  @scala.inline
  implicit class PanelPropsOps[Self <: PanelProps] (val x: Self) extends AnyVal {
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
    def setBodyScroll(value: Boolean): Self = this.set("bodyScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyScroll: Self = this.set("bodyScroll", js.undefined)
    @scala.inline
    def setTheme(value: PanelTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

