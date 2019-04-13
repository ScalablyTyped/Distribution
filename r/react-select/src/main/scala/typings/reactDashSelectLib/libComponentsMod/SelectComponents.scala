package typings
package reactDashSelectLib.libComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectComponents[OptionType] extends js.Object {
  var ClearIndicator: IndicatorComponentType[OptionType] | scala.Null
  var Control: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsControlMod.ControlProps[OptionType]]
  var CrossIcon: reactLib.reactMod.ComponentType[_]
  var DownChevron: reactLib.reactMod.ComponentType[_]
  var DropdownIndicator: IndicatorComponentType[OptionType] | scala.Null
  var Group: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsGroupMod.GroupProps[OptionType]]
  var GroupHeading: reactLib.reactMod.ComponentType[_]
  var IndicatorSeparator: IndicatorComponentType[OptionType] | scala.Null
  var IndicatorsContainer: reactLib.reactMod.ComponentType[
    reactDashSelectLib.libComponentsContainersMod.IndicatorContainerProps[OptionType]
  ]
  var Input: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsInputMod.InputProps]
  var LoadingIndicator: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsIndicatorsMod.LoadingIconProps[OptionType]] | scala.Null
  var LoadingMessage: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMenuMod.NoticeProps[OptionType]]
  var Menu: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuProps[OptionType]]
  var MenuList: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuListComponentProps[OptionType]]
  var MenuPortal: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuPortalProps[OptionType]]
  var MultiValue: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMultiValueMod.MultiValueProps[OptionType]]
  var MultiValueContainer: reactLib.reactMod.ComponentType[_]
  var MultiValueLabel: reactLib.reactMod.ComponentType[_]
  var MultiValueRemove: reactLib.reactMod.ComponentType[_]
  var NoOptionsMessage: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMenuMod.NoticeProps[OptionType]]
  var Option: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsOptionMod.OptionProps[OptionType]]
  var Placeholder: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsPlaceholderMod.PlaceholderProps[OptionType]]
  var SelectContainer: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsContainersMod.ContainerProps[OptionType]]
  var SingleValue: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsSingleValueMod.SingleValueProps[OptionType]]
  var ValueContainer: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsContainersMod.ValueContainerProps[OptionType]]
}

object SelectComponents {
  @scala.inline
  def apply[OptionType](
    Control: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsControlMod.ControlProps[OptionType]],
    CrossIcon: reactLib.reactMod.ComponentType[_],
    DownChevron: reactLib.reactMod.ComponentType[_],
    Group: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsGroupMod.GroupProps[OptionType]],
    GroupHeading: reactLib.reactMod.ComponentType[_],
    IndicatorsContainer: reactLib.reactMod.ComponentType[
      reactDashSelectLib.libComponentsContainersMod.IndicatorContainerProps[OptionType]
    ],
    Input: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsInputMod.InputProps],
    LoadingMessage: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMenuMod.NoticeProps[OptionType]],
    Menu: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuProps[OptionType]],
    MenuList: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuListComponentProps[OptionType]],
    MenuPortal: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMenuMod.MenuPortalProps[OptionType]],
    MultiValue: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMultiValueMod.MultiValueProps[OptionType]],
    MultiValueContainer: reactLib.reactMod.ComponentType[_],
    MultiValueLabel: reactLib.reactMod.ComponentType[_],
    MultiValueRemove: reactLib.reactMod.ComponentType[_],
    NoOptionsMessage: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMenuMod.NoticeProps[OptionType]],
    Option: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsOptionMod.OptionProps[OptionType]],
    Placeholder: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsPlaceholderMod.PlaceholderProps[OptionType]],
    SelectContainer: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsContainersMod.ContainerProps[OptionType]],
    SingleValue: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsSingleValueMod.SingleValueProps[OptionType]],
    ValueContainer: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsContainersMod.ValueContainerProps[OptionType]],
    ClearIndicator: IndicatorComponentType[OptionType] = null,
    DropdownIndicator: IndicatorComponentType[OptionType] = null,
    IndicatorSeparator: IndicatorComponentType[OptionType] = null,
    LoadingIndicator: reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsIndicatorsMod.LoadingIconProps[OptionType]] = null
  ): SelectComponents[OptionType] = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any], CrossIcon = CrossIcon.asInstanceOf[js.Any], DownChevron = DownChevron.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupHeading = GroupHeading.asInstanceOf[js.Any], IndicatorsContainer = IndicatorsContainer.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuList = MenuList.asInstanceOf[js.Any], MenuPortal = MenuPortal.asInstanceOf[js.Any], MultiValue = MultiValue.asInstanceOf[js.Any], MultiValueContainer = MultiValueContainer.asInstanceOf[js.Any], MultiValueLabel = MultiValueLabel.asInstanceOf[js.Any], MultiValueRemove = MultiValueRemove.asInstanceOf[js.Any], NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Placeholder = Placeholder.asInstanceOf[js.Any], SelectContainer = SelectContainer.asInstanceOf[js.Any], SingleValue = SingleValue.asInstanceOf[js.Any], ValueContainer = ValueContainer.asInstanceOf[js.Any])
    if (ClearIndicator != null) __obj.updateDynamic("ClearIndicator")(ClearIndicator.asInstanceOf[js.Any])
    if (DropdownIndicator != null) __obj.updateDynamic("DropdownIndicator")(DropdownIndicator.asInstanceOf[js.Any])
    if (IndicatorSeparator != null) __obj.updateDynamic("IndicatorSeparator")(IndicatorSeparator.asInstanceOf[js.Any])
    if (LoadingIndicator != null) __obj.updateDynamic("LoadingIndicator")(LoadingIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectComponents[OptionType]]
  }
}

