package typings.reactMdList.listItemAddonMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<@react-md/icon.@react-md/icon.TextIconSpacingProps, 'icon' | 'iconAfter' | 'forceIconWrap'> */
@js.native
trait ListItemAddonProps extends js.Object {
  var aboveClassName: js.UndefOr[String] = js.native
  /**
    * The addon that should be rendered.
    */
  var addon: ReactNode | ReactElement = js.native
  /**
    * Boolean if the addon should appear after the `children`.
    */
  var addonAfter: js.UndefOr[Boolean] = js.native
  var afterClassName: js.UndefOr[String] = js.native
  var beforeClassName: js.UndefOr[String] = js.native
  var belowClassName: js.UndefOr[String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  /**
    * Boolean if the addon should be forced into a `<span>` with the class names
    * applied instead of attempting to clone into the provided icon. If the
    * `type` is set to `"media"` or `"large-media"`, this will default to `true`.
    */
  var forceAddonWrap: js.UndefOr[Boolean] = js.native
  /**
    * The vertical position to use for the addon.
    */
  var position: js.UndefOr[ListItemAddonPosition] = js.native
  var stacked: js.UndefOr[Boolean] = js.native
  /**
    * The addon type that is used to adjust the spacing styles.
    */
  var `type`: js.UndefOr[ListItemAddonType] = js.native
}

object ListItemAddonProps {
  @scala.inline
  def apply(): ListItemAddonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemAddonProps]
  }
  @scala.inline
  implicit class ListItemAddonPropsOps[Self <: ListItemAddonProps] (val x: Self) extends AnyVal {
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
    def setAboveClassName(value: String): Self = this.set("aboveClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAboveClassName: Self = this.set("aboveClassName", js.undefined)
    @scala.inline
    def setAddon(value: ReactNode | ReactElement): Self = this.set("addon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddon: Self = this.set("addon", js.undefined)
    @scala.inline
    def setAddonAfter(value: Boolean): Self = this.set("addonAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddonAfter: Self = this.set("addonAfter", js.undefined)
    @scala.inline
    def setAfterClassName(value: String): Self = this.set("afterClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterClassName: Self = this.set("afterClassName", js.undefined)
    @scala.inline
    def setBeforeClassName(value: String): Self = this.set("beforeClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeClassName: Self = this.set("beforeClassName", js.undefined)
    @scala.inline
    def setBelowClassName(value: String): Self = this.set("belowClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBelowClassName: Self = this.set("belowClassName", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setForceAddonWrap(value: Boolean): Self = this.set("forceAddonWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceAddonWrap: Self = this.set("forceAddonWrap", js.undefined)
    @scala.inline
    def setPosition(value: ListItemAddonPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
    @scala.inline
    def setType(value: ListItemAddonType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

