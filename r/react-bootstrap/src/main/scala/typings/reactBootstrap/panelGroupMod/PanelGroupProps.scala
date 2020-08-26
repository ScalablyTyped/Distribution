package typings.reactBootstrap.panelGroupMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelGroupProps
  extends AllHTMLAttributes[PanelGroup]
     with ClassAttributes[PanelGroup] {
  var accordion: js.UndefOr[Boolean] = js.native
  var activeKey: js.UndefOr[js.Any] = js.native
  var defaultActiveKey: js.UndefOr[js.Any] = js.native
  var generateChildId: js.UndefOr[js.Function] = js.native
  @JSName("onSelect")
  var onSelect_PanelGroupProps: js.UndefOr[SelectCallback] = js.native
}

object PanelGroupProps {
  @scala.inline
  def apply(): PanelGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelGroupProps]
  }
  @scala.inline
  implicit class PanelGroupPropsOps[Self <: PanelGroupProps] (val x: Self) extends AnyVal {
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
    def setAccordion(value: Boolean): Self = this.set("accordion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccordion: Self = this.set("accordion", js.undefined)
    @scala.inline
    def setActiveKey(value: js.Any): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    @scala.inline
    def setDefaultActiveKey(value: js.Any): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    @scala.inline
    def setGenerateChildId(value: js.Function): Self = this.set("generateChildId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateChildId: Self = this.set("generateChildId", js.undefined)
    @scala.inline
    def setOnSelect(value: SelectCallback): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
  }
  
}

