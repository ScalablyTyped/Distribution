package typings
package reactDashSelectLib.srcComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectComponents[OptionType] extends js.Object {
  var ClearIndicator: IndicatorComponentType[OptionType] | scala.Null
  var Control: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsControlMod.ControlProps[OptionType]]
  var CrossIcon: reactLib.reactMod.ComponentType[_]
  var DownChevron: reactLib.reactMod.ComponentType[_]
  var DropdownIndicator: IndicatorComponentType[OptionType] | scala.Null
  var Group: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsGroupMod.GroupProps[OptionType]]
  var GroupHeading: reactLib.reactMod.ComponentType[_]
  var IndicatorSeparator: IndicatorComponentType[OptionType] | scala.Null
  var IndicatorsContainer: reactLib.reactMod.ComponentType[
    reactDashSelectLib.srcComponentsContainersMod.IndicatorContainerProps[OptionType]
  ]
  var Input: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsInputMod.InputProps]
  var LoadingIndicator: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsIndicatorsMod.LoadingIconProps[OptionType]] | scala.Null
  var LoadingMessage: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMenuMod.NoticeProps[OptionType]]
  var Menu: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMenuMod.MenuProps[OptionType]]
  var MenuList: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMenuMod.MenuListComponentProps[OptionType]]
  var MenuPortal: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMenuMod.MenuPortalProps[OptionType]]
  var MultiValue: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMultiValueMod.MultiValueProps[OptionType]]
  var MultiValueContainer: reactLib.reactMod.ComponentType[_]
  var MultiValueLabel: reactLib.reactMod.ComponentType[_]
  var MultiValueRemove: reactLib.reactMod.ComponentType[_]
  var NoOptionsMessage: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMenuMod.NoticeProps[OptionType]]
  var Option: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsOptionMod.OptionProps[OptionType]]
  var Placeholder: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsPlaceholderMod.PlaceholderProps[OptionType]]
  var SelectContainer: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsContainersMod.ContainerProps[OptionType]]
  var SingleValue: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsSingleValueMod.SingleValueProps[OptionType]]
  var ValueContainer: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsContainersMod.ValueContainerProps[OptionType]]
}

object SelectComponents {
  @scala.inline
  def apply[OptionType](
    Control: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsControlMod.ControlProps[OptionType]],
    CrossIcon: reactLib.reactMod.ComponentType[_],
    DownChevron: reactLib.reactMod.ComponentType[_],
    Group: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsGroupMod.GroupProps[OptionType]],
    GroupHeading: reactLib.reactMod.ComponentType[_],
    IndicatorsContainer: reactLib.reactMod.ComponentType[
      reactDashSelectLib.srcComponentsContainersMod.IndicatorContainerProps[OptionType]
    ],
    Input: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsInputMod.InputProps],
    LoadingMessage: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMenuMod.NoticeProps[OptionType]],
    Menu: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMenuMod.MenuProps[OptionType]],
    MenuList: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMenuMod.MenuListComponentProps[OptionType]],
    MenuPortal: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMenuMod.MenuPortalProps[OptionType]],
    MultiValue: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMultiValueMod.MultiValueProps[OptionType]],
    MultiValueContainer: reactLib.reactMod.ComponentType[_],
    MultiValueLabel: reactLib.reactMod.ComponentType[_],
    MultiValueRemove: reactLib.reactMod.ComponentType[_],
    NoOptionsMessage: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsMenuMod.NoticeProps[OptionType]],
    Option: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsOptionMod.OptionProps[OptionType]],
    Placeholder: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsPlaceholderMod.PlaceholderProps[OptionType]],
    SelectContainer: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsContainersMod.ContainerProps[OptionType]],
    SingleValue: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsSingleValueMod.SingleValueProps[OptionType]],
    ValueContainer: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsContainersMod.ValueContainerProps[OptionType]],
    ClearIndicator: IndicatorComponentType[OptionType] = null,
    DropdownIndicator: IndicatorComponentType[OptionType] = null,
    IndicatorSeparator: IndicatorComponentType[OptionType] = null,
    LoadingIndicator: reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsIndicatorsMod.LoadingIconProps[OptionType]] = null
  ): SelectComponents[OptionType] = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any], CrossIcon = CrossIcon.asInstanceOf[js.Any], DownChevron = DownChevron.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupHeading = GroupHeading.asInstanceOf[js.Any], IndicatorsContainer = IndicatorsContainer.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuList = MenuList.asInstanceOf[js.Any], MenuPortal = MenuPortal.asInstanceOf[js.Any], MultiValue = MultiValue.asInstanceOf[js.Any], MultiValueContainer = MultiValueContainer.asInstanceOf[js.Any], MultiValueLabel = MultiValueLabel.asInstanceOf[js.Any], MultiValueRemove = MultiValueRemove.asInstanceOf[js.Any], NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Placeholder = Placeholder.asInstanceOf[js.Any], SelectContainer = SelectContainer.asInstanceOf[js.Any], SingleValue = SingleValue.asInstanceOf[js.Any], ValueContainer = ValueContainer.asInstanceOf[js.Any])
    if (ClearIndicator != null) __obj.updateDynamic("ClearIndicator")(ClearIndicator.asInstanceOf[js.Any])
    if (DropdownIndicator != null) __obj.updateDynamic("DropdownIndicator")(DropdownIndicator.asInstanceOf[js.Any])
    if (IndicatorSeparator != null) __obj.updateDynamic("IndicatorSeparator")(IndicatorSeparator.asInstanceOf[js.Any])
    if (LoadingIndicator != null) __obj.updateDynamic("LoadingIndicator")(LoadingIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectComponents[OptionType]]
  }
}

