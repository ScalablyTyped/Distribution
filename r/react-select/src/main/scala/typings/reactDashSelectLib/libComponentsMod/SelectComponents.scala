package typings
package reactDashSelectLib.libComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectComponents[OptionType] extends js.Object {
  var ClearIndicator: IndicatorComponentType[OptionType] | scala.Null
  var Control: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsControlMod.ControlProps[OptionType]]
  var CrossIcon: reactLib.reactMod.ReactNs.ComponentType[_]
  var DownChevron: reactLib.reactMod.ReactNs.ComponentType[_]
  var DropdownIndicator: IndicatorComponentType[OptionType] | scala.Null
  var Group: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsGroupMod.GroupProps[OptionType]]
  var GroupHeading: reactLib.reactMod.ReactNs.ComponentType[_]
  var IndicatorSeparator: IndicatorComponentType[OptionType] | scala.Null
  var IndicatorsContainer: reactLib.reactMod.ReactNs.ComponentType[
    reactDashSelectLib.libComponentsContainersMod.IndicatorContainerProps[OptionType]
  ]
  var Input: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsInputMod.InputProps]
  var LoadingIndicator: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsIndicatorsMod.LoadingIconProps[OptionType]] | scala.Null
  var LoadingMessage: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMenuMod.NoticeProps[OptionType]]
  var Menu: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuProps[OptionType]]
  var MenuList: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuListComponentProps[OptionType]]
  var MenuPortal: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuPortalProps[OptionType]]
  var MultiValue: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMultiValueMod.MultiValueProps[OptionType]]
  var MultiValueContainer: reactLib.reactMod.ReactNs.ComponentType[_]
  var MultiValueLabel: reactLib.reactMod.ReactNs.ComponentType[_]
  var MultiValueRemove: reactLib.reactMod.ReactNs.ComponentType[_]
  var NoOptionsMessage: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMenuMod.NoticeProps[OptionType]]
  var Option: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsOptionMod.OptionProps[OptionType]]
  var Placeholder: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsPlaceholderMod.PlaceholderProps[OptionType]]
  var SelectContainer: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsContainersMod.ContainerProps[OptionType]]
  var SingleValue: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsSingleValueMod.SingleValueProps[OptionType]]
  var ValueContainer: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsContainersMod.ValueContainerProps[OptionType]]
}

object SelectComponents {
  @scala.inline
  def apply[OptionType](
    Control: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsControlMod.ControlProps[OptionType]],
    CrossIcon: reactLib.reactMod.ReactNs.ComponentType[_],
    DownChevron: reactLib.reactMod.ReactNs.ComponentType[_],
    Group: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsGroupMod.GroupProps[OptionType]],
    GroupHeading: reactLib.reactMod.ReactNs.ComponentType[_],
    IndicatorsContainer: reactLib.reactMod.ReactNs.ComponentType[
      reactDashSelectLib.libComponentsContainersMod.IndicatorContainerProps[OptionType]
    ],
    Input: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsInputMod.InputProps],
    LoadingMessage: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMenuMod.NoticeProps[OptionType]],
    Menu: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuProps[OptionType]],
    MenuList: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuListComponentProps[OptionType]],
    MenuPortal: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuPortalProps[OptionType]],
    MultiValue: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMultiValueMod.MultiValueProps[OptionType]],
    MultiValueContainer: reactLib.reactMod.ReactNs.ComponentType[_],
    MultiValueLabel: reactLib.reactMod.ReactNs.ComponentType[_],
    MultiValueRemove: reactLib.reactMod.ReactNs.ComponentType[_],
    NoOptionsMessage: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsMenuMod.NoticeProps[OptionType]],
    Option: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsOptionMod.OptionProps[OptionType]],
    Placeholder: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsPlaceholderMod.PlaceholderProps[OptionType]],
    SelectContainer: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsContainersMod.ContainerProps[OptionType]],
    SingleValue: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsSingleValueMod.SingleValueProps[OptionType]],
    ValueContainer: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsContainersMod.ValueContainerProps[OptionType]],
    ClearIndicator: IndicatorComponentType[OptionType] = null,
    DropdownIndicator: IndicatorComponentType[OptionType] = null,
    IndicatorSeparator: IndicatorComponentType[OptionType] = null,
    LoadingIndicator: reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsIndicatorsMod.LoadingIconProps[OptionType]] = null
  ): SelectComponents[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Control")(Control.asInstanceOf[js.Any])
    __obj.updateDynamic("CrossIcon")(CrossIcon.asInstanceOf[js.Any])
    __obj.updateDynamic("DownChevron")(DownChevron.asInstanceOf[js.Any])
    __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    __obj.updateDynamic("GroupHeading")(GroupHeading.asInstanceOf[js.Any])
    __obj.updateDynamic("IndicatorsContainer")(IndicatorsContainer.asInstanceOf[js.Any])
    __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    __obj.updateDynamic("LoadingMessage")(LoadingMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("Menu")(Menu.asInstanceOf[js.Any])
    __obj.updateDynamic("MenuList")(MenuList.asInstanceOf[js.Any])
    __obj.updateDynamic("MenuPortal")(MenuPortal.asInstanceOf[js.Any])
    __obj.updateDynamic("MultiValue")(MultiValue.asInstanceOf[js.Any])
    __obj.updateDynamic("MultiValueContainer")(MultiValueContainer.asInstanceOf[js.Any])
    __obj.updateDynamic("MultiValueLabel")(MultiValueLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("MultiValueRemove")(MultiValueRemove.asInstanceOf[js.Any])
    __obj.updateDynamic("NoOptionsMessage")(NoOptionsMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("Option")(Option.asInstanceOf[js.Any])
    __obj.updateDynamic("Placeholder")(Placeholder.asInstanceOf[js.Any])
    __obj.updateDynamic("SelectContainer")(SelectContainer.asInstanceOf[js.Any])
    __obj.updateDynamic("SingleValue")(SingleValue.asInstanceOf[js.Any])
    __obj.updateDynamic("ValueContainer")(ValueContainer.asInstanceOf[js.Any])
    if (ClearIndicator != null) __obj.updateDynamic("ClearIndicator")(ClearIndicator.asInstanceOf[js.Any])
    if (DropdownIndicator != null) __obj.updateDynamic("DropdownIndicator")(DropdownIndicator.asInstanceOf[js.Any])
    if (IndicatorSeparator != null) __obj.updateDynamic("IndicatorSeparator")(IndicatorSeparator.asInstanceOf[js.Any])
    if (LoadingIndicator != null) __obj.updateDynamic("LoadingIndicator")(LoadingIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectComponents[OptionType]]
  }
}

