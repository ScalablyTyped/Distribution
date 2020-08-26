package typings.reactSelect.componentsMod

import typings.react.mod.ComponentType
import typings.reactSelect.componentsInputMod.InputProps
import typings.reactSelect.componentsMultiValueMod.MultiValueProps
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.componentsSingleValueMod.SingleValueProps
import typings.reactSelect.containersMod.ContainerProps
import typings.reactSelect.containersMod.IndicatorContainerProps
import typings.reactSelect.containersMod.ValueContainerProps
import typings.reactSelect.controlMod.ControlProps
import typings.reactSelect.groupMod.GroupProps
import typings.reactSelect.indicatorsMod.LoadingIconProps
import typings.reactSelect.menuMod.MenuListComponentProps
import typings.reactSelect.menuMod.MenuPortalProps
import typings.reactSelect.menuMod.MenuProps
import typings.reactSelect.menuMod.NoticeProps
import typings.reactSelect.optionMod.OptionProps
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectComponents[OptionType /* <: OptionTypeBase */] extends js.Object {
  var ClearIndicator: IndicatorComponentType[OptionType] | Null = js.native
  var Control: ComponentType[ControlProps[OptionType]] = js.native
  var CrossIcon: ComponentType[_] = js.native
  var DownChevron: ComponentType[_] = js.native
  var DropdownIndicator: IndicatorComponentType[OptionType] | Null = js.native
  var Group: ComponentType[GroupProps[OptionType]] = js.native
  var GroupHeading: ComponentType[_] = js.native
  var IndicatorSeparator: IndicatorComponentType[OptionType] | Null = js.native
  var IndicatorsContainer: ComponentType[IndicatorContainerProps[OptionType]] = js.native
  var Input: ComponentType[InputProps] = js.native
  var LoadingIndicator: ComponentType[LoadingIconProps[OptionType]] | Null = js.native
  var LoadingMessage: ComponentType[NoticeProps[OptionType]] = js.native
  var Menu: ComponentType[MenuProps[OptionType]] = js.native
  var MenuList: ComponentType[MenuListComponentProps[OptionType]] = js.native
  var MenuPortal: ComponentType[MenuPortalProps[OptionType]] = js.native
  var MultiValue: ComponentType[MultiValueProps[OptionType]] = js.native
  var MultiValueContainer: ComponentType[_] = js.native
  var MultiValueLabel: ComponentType[_] = js.native
  var MultiValueRemove: ComponentType[_] = js.native
  var NoOptionsMessage: ComponentType[NoticeProps[OptionType]] = js.native
  var Option: ComponentType[OptionProps[OptionType]] = js.native
  var Placeholder: ComponentType[PlaceholderProps[OptionType]] = js.native
  var SelectContainer: ComponentType[ContainerProps[OptionType]] = js.native
  var SingleValue: ComponentType[SingleValueProps[OptionType]] = js.native
  var ValueContainer: ComponentType[ValueContainerProps[OptionType]] = js.native
}

object SelectComponents {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](
    Control: ComponentType[ControlProps[OptionType]],
    CrossIcon: ComponentType[_],
    DownChevron: ComponentType[_],
    Group: ComponentType[GroupProps[OptionType]],
    GroupHeading: ComponentType[_],
    IndicatorsContainer: ComponentType[IndicatorContainerProps[OptionType]],
    Input: ComponentType[InputProps],
    LoadingMessage: ComponentType[NoticeProps[OptionType]],
    Menu: ComponentType[MenuProps[OptionType]],
    MenuList: ComponentType[MenuListComponentProps[OptionType]],
    MenuPortal: ComponentType[MenuPortalProps[OptionType]],
    MultiValue: ComponentType[MultiValueProps[OptionType]],
    MultiValueContainer: ComponentType[_],
    MultiValueLabel: ComponentType[_],
    MultiValueRemove: ComponentType[_],
    NoOptionsMessage: ComponentType[NoticeProps[OptionType]],
    Option: ComponentType[OptionProps[OptionType]],
    Placeholder: ComponentType[PlaceholderProps[OptionType]],
    SelectContainer: ComponentType[ContainerProps[OptionType]],
    SingleValue: ComponentType[SingleValueProps[OptionType]],
    ValueContainer: ComponentType[ValueContainerProps[OptionType]]
  ): SelectComponents[OptionType] = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any], CrossIcon = CrossIcon.asInstanceOf[js.Any], DownChevron = DownChevron.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupHeading = GroupHeading.asInstanceOf[js.Any], IndicatorsContainer = IndicatorsContainer.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuList = MenuList.asInstanceOf[js.Any], MenuPortal = MenuPortal.asInstanceOf[js.Any], MultiValue = MultiValue.asInstanceOf[js.Any], MultiValueContainer = MultiValueContainer.asInstanceOf[js.Any], MultiValueLabel = MultiValueLabel.asInstanceOf[js.Any], MultiValueRemove = MultiValueRemove.asInstanceOf[js.Any], NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Placeholder = Placeholder.asInstanceOf[js.Any], SelectContainer = SelectContainer.asInstanceOf[js.Any], SingleValue = SingleValue.asInstanceOf[js.Any], ValueContainer = ValueContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectComponents[OptionType]]
  }
  @scala.inline
  implicit class SelectComponentsOps[Self <: SelectComponents[_], /* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with SelectComponents[OptionType]) extends AnyVal {
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
    def setControl(value: ComponentType[ControlProps[OptionType]]): Self = this.set("Control", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrossIcon(value: ComponentType[_]): Self = this.set("CrossIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownChevron(value: ComponentType[_]): Self = this.set("DownChevron", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: ComponentType[GroupProps[OptionType]]): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupHeading(value: ComponentType[_]): Self = this.set("GroupHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndicatorsContainer(value: ComponentType[IndicatorContainerProps[OptionType]]): Self = this.set("IndicatorsContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: ComponentType[InputProps]): Self = this.set("Input", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingMessage(value: ComponentType[NoticeProps[OptionType]]): Self = this.set("LoadingMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenu(value: ComponentType[MenuProps[OptionType]]): Self = this.set("Menu", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuList(value: ComponentType[MenuListComponentProps[OptionType]]): Self = this.set("MenuList", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuPortal(value: ComponentType[MenuPortalProps[OptionType]]): Self = this.set("MenuPortal", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiValue(value: ComponentType[MultiValueProps[OptionType]]): Self = this.set("MultiValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiValueContainer(value: ComponentType[_]): Self = this.set("MultiValueContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiValueLabel(value: ComponentType[_]): Self = this.set("MultiValueLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiValueRemove(value: ComponentType[_]): Self = this.set("MultiValueRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoOptionsMessage(value: ComponentType[NoticeProps[OptionType]]): Self = this.set("NoOptionsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setOption(value: ComponentType[OptionProps[OptionType]]): Self = this.set("Option", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: ComponentType[PlaceholderProps[OptionType]]): Self = this.set("Placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectContainer(value: ComponentType[ContainerProps[OptionType]]): Self = this.set("SelectContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingleValue(value: ComponentType[SingleValueProps[OptionType]]): Self = this.set("SingleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueContainer(value: ComponentType[ValueContainerProps[OptionType]]): Self = this.set("ValueContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearIndicator(value: IndicatorComponentType[OptionType]): Self = this.set("ClearIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearIndicatorNull: Self = this.set("ClearIndicator", null)
    @scala.inline
    def setDropdownIndicator(value: IndicatorComponentType[OptionType]): Self = this.set("DropdownIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropdownIndicatorNull: Self = this.set("DropdownIndicator", null)
    @scala.inline
    def setIndicatorSeparator(value: IndicatorComponentType[OptionType]): Self = this.set("IndicatorSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndicatorSeparatorNull: Self = this.set("IndicatorSeparator", null)
    @scala.inline
    def setLoadingIndicator(value: ComponentType[LoadingIconProps[OptionType]]): Self = this.set("LoadingIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingIndicatorNull: Self = this.set("LoadingIndicator", null)
  }
  
}

