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

/* Inlined std.Partial<react-select.react-select/src/components.SelectComponents<OptionType>> */
@js.native
trait SelectComponentsConfig[OptionType /* <: OptionTypeBase */] extends js.Object {
  var ClearIndicator: js.UndefOr[IndicatorComponentType[OptionType] | Null] = js.native
  var Control: js.UndefOr[ComponentType[ControlProps[OptionType]]] = js.native
  var CrossIcon: js.UndefOr[ComponentType[_]] = js.native
  var DownChevron: js.UndefOr[ComponentType[_]] = js.native
  var DropdownIndicator: js.UndefOr[IndicatorComponentType[OptionType] | Null] = js.native
  var Group: js.UndefOr[ComponentType[GroupProps[OptionType]]] = js.native
  var GroupHeading: js.UndefOr[ComponentType[_]] = js.native
  var IndicatorSeparator: js.UndefOr[IndicatorComponentType[OptionType] | Null] = js.native
  var IndicatorsContainer: js.UndefOr[ComponentType[IndicatorContainerProps[OptionType]]] = js.native
  var Input: js.UndefOr[ComponentType[InputProps]] = js.native
  var LoadingIndicator: js.UndefOr[ComponentType[LoadingIconProps[OptionType]] | Null] = js.native
  var LoadingMessage: js.UndefOr[ComponentType[NoticeProps[OptionType]]] = js.native
  var Menu: js.UndefOr[ComponentType[MenuProps[OptionType]]] = js.native
  var MenuList: js.UndefOr[ComponentType[MenuListComponentProps[OptionType]]] = js.native
  var MenuPortal: js.UndefOr[ComponentType[MenuPortalProps[OptionType]]] = js.native
  var MultiValue: js.UndefOr[ComponentType[MultiValueProps[OptionType]]] = js.native
  var MultiValueContainer: js.UndefOr[ComponentType[_]] = js.native
  var MultiValueLabel: js.UndefOr[ComponentType[_]] = js.native
  var MultiValueRemove: js.UndefOr[ComponentType[_]] = js.native
  var NoOptionsMessage: js.UndefOr[ComponentType[NoticeProps[OptionType]]] = js.native
  var Option: js.UndefOr[ComponentType[OptionProps[OptionType]]] = js.native
  var Placeholder: js.UndefOr[ComponentType[PlaceholderProps[OptionType]]] = js.native
  var SelectContainer: js.UndefOr[ComponentType[ContainerProps[OptionType]]] = js.native
  var SingleValue: js.UndefOr[ComponentType[SingleValueProps[OptionType]]] = js.native
  var ValueContainer: js.UndefOr[ComponentType[ValueContainerProps[OptionType]]] = js.native
}

object SelectComponentsConfig {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](): SelectComponentsConfig[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectComponentsConfig[OptionType]]
  }
  @scala.inline
  implicit class SelectComponentsConfigOps[Self <: SelectComponentsConfig[_], /* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with SelectComponentsConfig[OptionType]) extends AnyVal {
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
    def setClearIndicator(value: IndicatorComponentType[OptionType]): Self = this.set("ClearIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIndicator: Self = this.set("ClearIndicator", js.undefined)
    @scala.inline
    def setClearIndicatorNull: Self = this.set("ClearIndicator", null)
    @scala.inline
    def setControl(value: ComponentType[ControlProps[OptionType]]): Self = this.set("Control", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControl: Self = this.set("Control", js.undefined)
    @scala.inline
    def setCrossIcon(value: ComponentType[_]): Self = this.set("CrossIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossIcon: Self = this.set("CrossIcon", js.undefined)
    @scala.inline
    def setDownChevron(value: ComponentType[_]): Self = this.set("DownChevron", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownChevron: Self = this.set("DownChevron", js.undefined)
    @scala.inline
    def setDropdownIndicator(value: IndicatorComponentType[OptionType]): Self = this.set("DropdownIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownIndicator: Self = this.set("DropdownIndicator", js.undefined)
    @scala.inline
    def setDropdownIndicatorNull: Self = this.set("DropdownIndicator", null)
    @scala.inline
    def setGroup(value: ComponentType[GroupProps[OptionType]]): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
    @scala.inline
    def setGroupHeading(value: ComponentType[_]): Self = this.set("GroupHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupHeading: Self = this.set("GroupHeading", js.undefined)
    @scala.inline
    def setIndicatorSeparator(value: IndicatorComponentType[OptionType]): Self = this.set("IndicatorSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorSeparator: Self = this.set("IndicatorSeparator", js.undefined)
    @scala.inline
    def setIndicatorSeparatorNull: Self = this.set("IndicatorSeparator", null)
    @scala.inline
    def setIndicatorsContainer(value: ComponentType[IndicatorContainerProps[OptionType]]): Self = this.set("IndicatorsContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorsContainer: Self = this.set("IndicatorsContainer", js.undefined)
    @scala.inline
    def setInput(value: ComponentType[InputProps]): Self = this.set("Input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    @scala.inline
    def setLoadingIndicator(value: ComponentType[LoadingIconProps[OptionType]]): Self = this.set("LoadingIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingIndicator: Self = this.set("LoadingIndicator", js.undefined)
    @scala.inline
    def setLoadingIndicatorNull: Self = this.set("LoadingIndicator", null)
    @scala.inline
    def setLoadingMessage(value: ComponentType[NoticeProps[OptionType]]): Self = this.set("LoadingMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingMessage: Self = this.set("LoadingMessage", js.undefined)
    @scala.inline
    def setMenu(value: ComponentType[MenuProps[OptionType]]): Self = this.set("Menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("Menu", js.undefined)
    @scala.inline
    def setMenuList(value: ComponentType[MenuListComponentProps[OptionType]]): Self = this.set("MenuList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuList: Self = this.set("MenuList", js.undefined)
    @scala.inline
    def setMenuPortal(value: ComponentType[MenuPortalProps[OptionType]]): Self = this.set("MenuPortal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuPortal: Self = this.set("MenuPortal", js.undefined)
    @scala.inline
    def setMultiValue(value: ComponentType[MultiValueProps[OptionType]]): Self = this.set("MultiValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValue: Self = this.set("MultiValue", js.undefined)
    @scala.inline
    def setMultiValueContainer(value: ComponentType[_]): Self = this.set("MultiValueContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueContainer: Self = this.set("MultiValueContainer", js.undefined)
    @scala.inline
    def setMultiValueLabel(value: ComponentType[_]): Self = this.set("MultiValueLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueLabel: Self = this.set("MultiValueLabel", js.undefined)
    @scala.inline
    def setMultiValueRemove(value: ComponentType[_]): Self = this.set("MultiValueRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueRemove: Self = this.set("MultiValueRemove", js.undefined)
    @scala.inline
    def setNoOptionsMessage(value: ComponentType[NoticeProps[OptionType]]): Self = this.set("NoOptionsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoOptionsMessage: Self = this.set("NoOptionsMessage", js.undefined)
    @scala.inline
    def setOption(value: ComponentType[OptionProps[OptionType]]): Self = this.set("Option", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOption: Self = this.set("Option", js.undefined)
    @scala.inline
    def setPlaceholder(value: ComponentType[PlaceholderProps[OptionType]]): Self = this.set("Placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("Placeholder", js.undefined)
    @scala.inline
    def setSelectContainer(value: ComponentType[ContainerProps[OptionType]]): Self = this.set("SelectContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectContainer: Self = this.set("SelectContainer", js.undefined)
    @scala.inline
    def setSingleValue(value: ComponentType[SingleValueProps[OptionType]]): Self = this.set("SingleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleValue: Self = this.set("SingleValue", js.undefined)
    @scala.inline
    def setValueContainer(value: ComponentType[ValueContainerProps[OptionType]]): Self = this.set("ValueContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueContainer: Self = this.set("ValueContainer", js.undefined)
  }
  
}

