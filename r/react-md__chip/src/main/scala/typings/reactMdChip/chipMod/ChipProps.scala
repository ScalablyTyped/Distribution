package typings.reactMdChip.chipMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactMdChip.reactMdChipStrings.outline
import typings.reactMdChip.reactMdChipStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChipProps extends ButtonAttributes {
  /**
    * An optional className to provide to the `<span>` that surrounds the
    * `children` of the chip.
    *
    * This prop will do nothing if the `disableContentWrap` prop is enabled.
    */
  var contentClassName: js.UndefOr[String] = js.native
  /**
    * An optional style to provide to the `<span>` that surrounds the `children`
    * of the chip.
    *
    * This prop will do nothing if the `disableContentWrap` prop is enabled.
    */
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Boolean if the children should no longer be wrapped in a `<span>` that adds
    * some default styles to ellipsis and truncate the children based on the
    * chip's width.
    */
  var disableContentWrap: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the selected icon should not animate when the `selected` is a
    * boolean. This transition is just a simple "appear" transition with the
    * `max-width` of the icon.
    */
  var disableIconTransition: js.UndefOr[Boolean] = js.native
  /**
    * An optional icon to place to the left of the children. There will
    * automatically be some margin placed between this icon and the children if
    * defined.
    */
  var leftIcon: js.UndefOr[ReactNode] = js.native
  /**
    * Boolean if the chip should gain elevation while the user is pressing the
    * chip with mouse, touch, or keyboard click.
    */
  var raisable: js.UndefOr[Boolean] = js.native
  /**
    * An optional icon to place to the right of the children. There will
    * automatically be some margin placed between this icon and the children if
    * defined.
    */
  var rightIcon: js.UndefOr[ReactNode] = js.native
  /**
    * Boolean if the chip is selected or deselected which is `undefined` by
    * default. Setting this prop to a boolean updates the chip to render a
    * selected icon to the left of the content as well as adding a darker
    * background when set to `true`. The icon will only appear once the state is
    * `true` and will transition in and out when swapped between `true` and
    * `false`.
    *
    * > See the `disableIconTransition` and `selectedIcon` props for more details
    * > about the icon behavior
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * The icon to use as the `leftIcon` when the `selected` prop is a boolean.
    * When this is omitted, it will inherit the `selected` icon from the main
    * `Configuration` / `IconProvider`.
    *
    * If this is set to `null`, no icon will be rendered when the `selected` is set
    * to `"selected"` or `"unselected"`.
    *
    * If the `leftIcon` prop is not `undefined`, the `leftIcon` prop will always
    * be used instead of this prop.
    */
  var selectedIcon: js.UndefOr[ReactNode] = js.native
  /**
    * Boolean if the selection state should use a swatch of the primary color
    * instead of rendering a check icon and the normal background color changes.
    */
  var selectedThemed: js.UndefOr[Boolean] = js.native
  /**
    * The theme for the button.
    */
  var theme: js.UndefOr[outline | solid] = js.native
}

object ChipProps {
  @scala.inline
  def apply(): ChipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipProps]
  }
  @scala.inline
  implicit class ChipPropsOps[Self <: ChipProps] (val x: Self) extends AnyVal {
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
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setDisableContentWrap(value: Boolean): Self = this.set("disableContentWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableContentWrap: Self = this.set("disableContentWrap", js.undefined)
    @scala.inline
    def setDisableIconTransition(value: Boolean): Self = this.set("disableIconTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableIconTransition: Self = this.set("disableIconTransition", js.undefined)
    @scala.inline
    def setLeftIcon(value: ReactNode): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    @scala.inline
    def setRaisable(value: Boolean): Self = this.set("raisable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaisable: Self = this.set("raisable", js.undefined)
    @scala.inline
    def setRightIcon(value: ReactNode): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSelectedIcon(value: ReactNode): Self = this.set("selectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIcon: Self = this.set("selectedIcon", js.undefined)
    @scala.inline
    def setSelectedThemed(value: Boolean): Self = this.set("selectedThemed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedThemed: Self = this.set("selectedThemed", js.undefined)
    @scala.inline
    def setTheme(value: outline | solid): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

