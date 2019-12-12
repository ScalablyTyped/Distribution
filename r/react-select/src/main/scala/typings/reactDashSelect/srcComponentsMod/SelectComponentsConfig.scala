package typings.reactDashSelect.srcComponentsMod

import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcComponentsContainersMod.ContainerProps
import typings.reactDashSelect.srcComponentsContainersMod.IndicatorContainerProps
import typings.reactDashSelect.srcComponentsContainersMod.ValueContainerProps
import typings.reactDashSelect.srcComponentsControlMod.ControlProps
import typings.reactDashSelect.srcComponentsGroupMod.GroupProps
import typings.reactDashSelect.srcComponentsIndicatorsMod.LoadingIconProps
import typings.reactDashSelect.srcComponentsInputMod.InputProps
import typings.reactDashSelect.srcComponentsMenuMod.MenuListComponentProps
import typings.reactDashSelect.srcComponentsMenuMod.MenuPortalProps
import typings.reactDashSelect.srcComponentsMenuMod.MenuProps
import typings.reactDashSelect.srcComponentsMenuMod.NoticeProps
import typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueProps
import typings.reactDashSelect.srcComponentsOptionMod.OptionProps
import typings.reactDashSelect.srcComponentsPlaceholderMod.PlaceholderProps
import typings.reactDashSelect.srcComponentsSingleValueMod.SingleValueProps
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-select.react-select/src/components.SelectComponents<OptionType>> */
trait SelectComponentsConfig[OptionType /* <: OptionTypeBase */] extends js.Object {
  var ClearIndicator: js.UndefOr[IndicatorComponentType[OptionType]] = js.undefined
  var Control: js.UndefOr[ComponentType[ControlProps[OptionType]]] = js.undefined
  var CrossIcon: js.UndefOr[ComponentType[_]] = js.undefined
  var DownChevron: js.UndefOr[ComponentType[_]] = js.undefined
  var DropdownIndicator: js.UndefOr[IndicatorComponentType[OptionType]] = js.undefined
  var Group: js.UndefOr[ComponentType[GroupProps[OptionType]]] = js.undefined
  var GroupHeading: js.UndefOr[ComponentType[_]] = js.undefined
  var IndicatorSeparator: js.UndefOr[IndicatorComponentType[OptionType]] = js.undefined
  var IndicatorsContainer: js.UndefOr[ComponentType[IndicatorContainerProps[OptionType]]] = js.undefined
  var Input: js.UndefOr[ComponentType[InputProps]] = js.undefined
  var LoadingIndicator: js.UndefOr[ComponentType[LoadingIconProps[OptionType]]] = js.undefined
  var LoadingMessage: js.UndefOr[ComponentType[NoticeProps[OptionType]]] = js.undefined
  var Menu: js.UndefOr[ComponentType[MenuProps[OptionType]]] = js.undefined
  var MenuList: js.UndefOr[ComponentType[MenuListComponentProps[OptionType]]] = js.undefined
  var MenuPortal: js.UndefOr[ComponentType[MenuPortalProps[OptionType]]] = js.undefined
  var MultiValue: js.UndefOr[ComponentType[MultiValueProps[OptionType]]] = js.undefined
  var MultiValueContainer: js.UndefOr[ComponentType[_]] = js.undefined
  var MultiValueLabel: js.UndefOr[ComponentType[_]] = js.undefined
  var MultiValueRemove: js.UndefOr[ComponentType[_]] = js.undefined
  var NoOptionsMessage: js.UndefOr[ComponentType[NoticeProps[OptionType]]] = js.undefined
  var Option: js.UndefOr[ComponentType[OptionProps[OptionType]]] = js.undefined
  var Placeholder: js.UndefOr[ComponentType[PlaceholderProps[OptionType]]] = js.undefined
  var SelectContainer: js.UndefOr[ComponentType[ContainerProps[OptionType]]] = js.undefined
  var SingleValue: js.UndefOr[ComponentType[SingleValueProps[OptionType]]] = js.undefined
  var ValueContainer: js.UndefOr[ComponentType[ValueContainerProps[OptionType]]] = js.undefined
}

object SelectComponentsConfig {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    ClearIndicator: IndicatorComponentType[OptionType] = null,
    Control: ComponentType[ControlProps[OptionType]] = null,
    CrossIcon: ComponentType[_] = null,
    DownChevron: ComponentType[_] = null,
    DropdownIndicator: IndicatorComponentType[OptionType] = null,
    Group: ComponentType[GroupProps[OptionType]] = null,
    GroupHeading: ComponentType[_] = null,
    IndicatorSeparator: IndicatorComponentType[OptionType] = null,
    IndicatorsContainer: ComponentType[IndicatorContainerProps[OptionType]] = null,
    Input: ComponentType[InputProps] = null,
    LoadingIndicator: ComponentType[LoadingIconProps[OptionType]] = null,
    LoadingMessage: ComponentType[NoticeProps[OptionType]] = null,
    Menu: ComponentType[MenuProps[OptionType]] = null,
    MenuList: ComponentType[MenuListComponentProps[OptionType]] = null,
    MenuPortal: ComponentType[MenuPortalProps[OptionType]] = null,
    MultiValue: ComponentType[MultiValueProps[OptionType]] = null,
    MultiValueContainer: ComponentType[_] = null,
    MultiValueLabel: ComponentType[_] = null,
    MultiValueRemove: ComponentType[_] = null,
    NoOptionsMessage: ComponentType[NoticeProps[OptionType]] = null,
    Option: ComponentType[OptionProps[OptionType]] = null,
    Placeholder: ComponentType[PlaceholderProps[OptionType]] = null,
    SelectContainer: ComponentType[ContainerProps[OptionType]] = null,
    SingleValue: ComponentType[SingleValueProps[OptionType]] = null,
    ValueContainer: ComponentType[ValueContainerProps[OptionType]] = null
  ): SelectComponentsConfig[OptionType] = {
    val __obj = js.Dynamic.literal()
    if (ClearIndicator != null) __obj.updateDynamic("ClearIndicator")(ClearIndicator.asInstanceOf[js.Any])
    if (Control != null) __obj.updateDynamic("Control")(Control.asInstanceOf[js.Any])
    if (CrossIcon != null) __obj.updateDynamic("CrossIcon")(CrossIcon.asInstanceOf[js.Any])
    if (DownChevron != null) __obj.updateDynamic("DownChevron")(DownChevron.asInstanceOf[js.Any])
    if (DropdownIndicator != null) __obj.updateDynamic("DropdownIndicator")(DropdownIndicator.asInstanceOf[js.Any])
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    if (GroupHeading != null) __obj.updateDynamic("GroupHeading")(GroupHeading.asInstanceOf[js.Any])
    if (IndicatorSeparator != null) __obj.updateDynamic("IndicatorSeparator")(IndicatorSeparator.asInstanceOf[js.Any])
    if (IndicatorsContainer != null) __obj.updateDynamic("IndicatorsContainer")(IndicatorsContainer.asInstanceOf[js.Any])
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (LoadingIndicator != null) __obj.updateDynamic("LoadingIndicator")(LoadingIndicator.asInstanceOf[js.Any])
    if (LoadingMessage != null) __obj.updateDynamic("LoadingMessage")(LoadingMessage.asInstanceOf[js.Any])
    if (Menu != null) __obj.updateDynamic("Menu")(Menu.asInstanceOf[js.Any])
    if (MenuList != null) __obj.updateDynamic("MenuList")(MenuList.asInstanceOf[js.Any])
    if (MenuPortal != null) __obj.updateDynamic("MenuPortal")(MenuPortal.asInstanceOf[js.Any])
    if (MultiValue != null) __obj.updateDynamic("MultiValue")(MultiValue.asInstanceOf[js.Any])
    if (MultiValueContainer != null) __obj.updateDynamic("MultiValueContainer")(MultiValueContainer.asInstanceOf[js.Any])
    if (MultiValueLabel != null) __obj.updateDynamic("MultiValueLabel")(MultiValueLabel.asInstanceOf[js.Any])
    if (MultiValueRemove != null) __obj.updateDynamic("MultiValueRemove")(MultiValueRemove.asInstanceOf[js.Any])
    if (NoOptionsMessage != null) __obj.updateDynamic("NoOptionsMessage")(NoOptionsMessage.asInstanceOf[js.Any])
    if (Option != null) __obj.updateDynamic("Option")(Option.asInstanceOf[js.Any])
    if (Placeholder != null) __obj.updateDynamic("Placeholder")(Placeholder.asInstanceOf[js.Any])
    if (SelectContainer != null) __obj.updateDynamic("SelectContainer")(SelectContainer.asInstanceOf[js.Any])
    if (SingleValue != null) __obj.updateDynamic("SingleValue")(SingleValue.asInstanceOf[js.Any])
    if (ValueContainer != null) __obj.updateDynamic("ValueContainer")(ValueContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectComponentsConfig[OptionType]]
  }
}

