package typings.reactMdIcon.textIconSpacingMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextIconSpacingProps extends js.Object {
  /**
    * The class name to use for an icon that is placed before above the text.
    * This is used when the `stacked` prop is enabled and the `iconAfter` prop is
    * disabled or omitted.
    */
  var aboveClassName: js.UndefOr[String] = js.native
  /**
    * The class name to use for an icon that is placed after text.
    */
  var afterClassName: js.UndefOr[String] = js.native
  /**
    * The class name to use for an icon that is placed before text.
    */
  var beforeClassName: js.UndefOr[String] = js.native
  /**
    * The class name to use for an icon that is placed before above the text.
    * This is used when the `stacked` prop is enabled and the `iconAfter` prop is
    * enabled.
    */
  var belowClassName: js.UndefOr[String] = js.native
  /**
    * The children to render before or after the provided icon. This is defaulted
    * to `null` so that providing a `null` icon will correctly render without
    * React crashing.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * An optional className to apply to the surroudning `<span>` when the
    * `forceIconWrap` prop is enabled or the icon is not a valid React Element.
    * If the `forceIconWrap` prop is not enabled, it will be cloned into the icon
    * instead.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Boolean if the icon should be forced into a `<span>` with the class names
    * applied instead of attempting to clone into the provided icon.
    */
  var forceIconWrap: js.UndefOr[Boolean] = js.native
  /**
    * An optional icon to display with a text button. This is invalid for icon
    * buttons. If this is a single element, a new class name will be cloned into
    * the element to get correct spacing so if you have a custom icon element,
    * you **must** also pass that class name down. If you are using one of the
    * react-md icon component packages, this is handled automatically.
    *
    * If this is not a valid react element, the icon will be wrapped in a
    * `<span>` instead with the class names applied.
    */
  var icon: js.UndefOr[ReactElement | ReactNode] = js.native
  /**
    * Boolean if the icon should appear after the text instead of before.
    */
  var iconAfter: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the icon and text should be stacked instead of inline. Note:
    * You'll normally want to update the container element to have `display:
    * flex` and `flex-direction: column` for this to work.
    */
  var stacked: js.UndefOr[Boolean] = js.native
}

object TextIconSpacingProps {
  @scala.inline
  def apply(): TextIconSpacingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextIconSpacingProps]
  }
  @scala.inline
  implicit class TextIconSpacingPropsOps[Self <: TextIconSpacingProps] (val x: Self) extends AnyVal {
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
    def setForceIconWrap(value: Boolean): Self = this.set("forceIconWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIconWrap: Self = this.set("forceIconWrap", js.undefined)
    @scala.inline
    def setIcon(value: ReactElement | ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
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
  }
  
}

