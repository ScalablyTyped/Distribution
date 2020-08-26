package typings.reactMdTabs.tabsManagerMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @react-md/tabs.@react-md/tabs/types/types.TabConfig & std.Required<std.Pick<@react-md/tabs.@react-md/tabs/types/types.TabConfig, 'id'>> */
@js.native
trait InitializedTabConfig extends js.Object {
  /**
    * The children to display in the tab. This is required and should normally
    * just be text or an icon.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * An optional className to apply to the tab.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * An optional className to apply to the `<span>` surrounding the `children`
    * of the `Tab`. You _probably_ won't need to use this.
    */
  var contentClassName: js.UndefOr[String] = js.native
  /**
    * An optional style to apply to the `<span>` surrounding the `children` of
    * the `Tab`. You _probably_ won't need to use this.
    */
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Boolean if the tab should be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * An optional icon to render in the `Tab` along with the normal text. If you
    * want to have an icon only tab, you should not use this prop and instead
    * just provide the icon as the tab's children.
    */
  var icon: js.UndefOr[ReactNode] = js.native
  /**
    * Boolean if the icon should appear after the text instead of before. When
    * the `stacked` prop is also enabled, it will cause the icon to appear below
    * the text instead of above.
    */
  var iconAfter: js.UndefOr[Boolean] = js.native
  /**
    * An optional id to use for the tab if the default generated ids are not to
    * your liking.
    */
  var id: js.UndefOr[String] with String = js.native
  /**
    * Boolean if the icon and text should be stacked instead of rendered inline.
    * This is only valid when the `icon` prop has been provided.
    */
  var stacked: js.UndefOr[Boolean] = js.native
  /**
    * An optional style to apply to the tab.
    */
  var style: js.UndefOr[CSSProperties] = js.native
}

object InitializedTabConfig {
  @scala.inline
  def apply(id: js.UndefOr[String] with String): InitializedTabConfig = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializedTabConfig]
  }
  @scala.inline
  implicit class InitializedTabConfigOps[Self <: InitializedTabConfig] (val x: Self) extends AnyVal {
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
    def setId(value: js.UndefOr[String] with String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconAfter(value: Boolean): Self = this.set("iconAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconAfter: Self = this.set("iconAfter", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

