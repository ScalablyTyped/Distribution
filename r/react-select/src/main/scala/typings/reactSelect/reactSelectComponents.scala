package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.asyncMod.default
import typings.reactSelect.mod.components.Control
import typings.reactSelect.mod.components.CrossIcon
import typings.reactSelect.mod.components.DownChevron
import typings.reactSelect.mod.components.Group
import typings.reactSelect.mod.components.GroupHeading
import typings.reactSelect.mod.components.IndicatorsContainer
import typings.reactSelect.mod.components.Input
import typings.reactSelect.mod.components.LoadingMessage
import typings.reactSelect.mod.components.Menu
import typings.reactSelect.mod.components.MenuList
import typings.reactSelect.mod.components.MenuPortal
import typings.reactSelect.mod.components.MultiValue
import typings.reactSelect.mod.components.MultiValueContainer
import typings.reactSelect.mod.components.MultiValueLabel
import typings.reactSelect.mod.components.MultiValueRemove
import typings.reactSelect.mod.components.NoOptionsMessage
import typings.reactSelect.mod.components.Option
import typings.reactSelect.mod.components.Placeholder
import typings.reactSelect.mod.components.SelectContainer
import typings.reactSelect.mod.components.SingleValue
import typings.reactSelect.mod.components.ValueContainer
import typings.reactSelect.selectMod.Props
import typings.reactSelect.stateManagerMod.StateProps
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactSelectComponents extends reactSelectProps {
  @scala.inline
  def Async[OptionType /* <: OptionTypeBase */]: ComponentType[AsyncProps[OptionType]] = js.constructorOf[default[OptionType]].asInstanceOf[ComponentType[AsyncProps[OptionType]]]
  @scala.inline
  def AsyncCreatable[OptionType /* <: OptionTypeBase */]: ComponentType[AsyncCreatableProps[OptionType]] = js.constructorOf[typings.reactSelect.asyncCreatableMod.default[OptionType]].asInstanceOf[ComponentType[AsyncCreatableProps[OptionType]]]
  @scala.inline
  def Base[OptionType /* <: OptionTypeBase */]: ComponentType[BaseProps[OptionType]] = js.constructorOf[typings.reactSelect.baseMod.default[OptionType]].asInstanceOf[ComponentType[BaseProps[OptionType]]]
  @scala.inline
  def ClearIndicator: ComponentType[ClearIndicatorProps[js.Any]] = js.constructorOf[typings.reactSelect.indicatorsMod.ClearIndicator].asInstanceOf[ComponentType[ClearIndicatorProps[js.Any]]]
  @scala.inline
  def Collapse: ComponentType[CollapseProps] = js.constructorOf[typings.reactSelect.transitionsMod.Collapse].asInstanceOf[ComponentType[CollapseProps]]
  @scala.inline
  def ComponentsControl: ComponentType[ComponentsControlProps[js.Any]] = Control.asInstanceOf[ComponentType[ComponentsControlProps[js.Any]]]
  @scala.inline
  def ComponentsCrossIcon: ComponentType[js.Any] = CrossIcon.asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def ComponentsDownChevron: ComponentType[js.Any] = DownChevron.asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def ComponentsGroup: ComponentType[ComponentsGroupProps[js.Any]] = Group.asInstanceOf[ComponentType[ComponentsGroupProps[js.Any]]]
  @scala.inline
  def ComponentsGroupHeading: ComponentType[js.Any] = GroupHeading.asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def ComponentsIndicatorsContainer: ComponentType[ComponentsIndicatorsContainerProps[js.Any]] = IndicatorsContainer.asInstanceOf[ComponentType[ComponentsIndicatorsContainerProps[js.Any]]]
  @scala.inline
  def ComponentsInput: ComponentType[ComponentsInputProps] = Input.asInstanceOf[ComponentType[ComponentsInputProps]]
  @scala.inline
  def ComponentsLoadingMessage: ComponentType[ComponentsLoadingMessageProps[js.Any]] = LoadingMessage.asInstanceOf[ComponentType[ComponentsLoadingMessageProps[js.Any]]]
  @scala.inline
  def ComponentsMenu: ComponentType[ComponentsMenuProps[js.Any]] = Menu.asInstanceOf[ComponentType[ComponentsMenuProps[js.Any]]]
  @scala.inline
  def ComponentsMenuList: ComponentType[ComponentsMenuListProps[js.Any]] = MenuList.asInstanceOf[ComponentType[ComponentsMenuListProps[js.Any]]]
  @scala.inline
  def ComponentsMenuPortal: ComponentType[ComponentsMenuPortalProps[js.Any]] = MenuPortal.asInstanceOf[ComponentType[ComponentsMenuPortalProps[js.Any]]]
  @scala.inline
  def ComponentsMultiValue: ComponentType[ComponentsMultiValueProps[js.Any]] = MultiValue.asInstanceOf[ComponentType[ComponentsMultiValueProps[js.Any]]]
  @scala.inline
  def ComponentsMultiValueContainer: ComponentType[js.Any] = MultiValueContainer.asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def ComponentsMultiValueLabel: ComponentType[js.Any] = MultiValueLabel.asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def ComponentsMultiValueRemove: ComponentType[js.Any] = MultiValueRemove.asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def ComponentsNoOptionsMessage: ComponentType[ComponentsNoOptionsMessageProps[js.Any]] = NoOptionsMessage.asInstanceOf[ComponentType[ComponentsNoOptionsMessageProps[js.Any]]]
  @scala.inline
  def ComponentsOption: ComponentType[ComponentsOptionProps[js.Any]] = Option.asInstanceOf[ComponentType[ComponentsOptionProps[js.Any]]]
  @scala.inline
  def ComponentsPlaceholder: ComponentType[ComponentsPlaceholderProps[js.Any]] = Placeholder.asInstanceOf[ComponentType[ComponentsPlaceholderProps[js.Any]]]
  @scala.inline
  def ComponentsSelectContainer: ComponentType[ComponentsSelectContainerProps[js.Any]] = SelectContainer.asInstanceOf[ComponentType[ComponentsSelectContainerProps[js.Any]]]
  @scala.inline
  def ComponentsSingleValue: ComponentType[ComponentsSingleValueProps[js.Any]] = SingleValue.asInstanceOf[ComponentType[ComponentsSingleValueProps[js.Any]]]
  @scala.inline
  def ComponentsValueContainer: ComponentType[ComponentsValueContainerProps[js.Any]] = ValueContainer.asInstanceOf[ComponentType[ComponentsValueContainerProps[js.Any]]]
  @scala.inline
  def Control: ComponentType[ControlProps[js.Any]] = js.constructorOf[typings.reactSelect.controlMod.default].asInstanceOf[ComponentType[ControlProps[js.Any]]]
  @scala.inline
  def Creatable[OptionType /* <: OptionTypeBase */]: ComponentType[CreatableProps[OptionType]] = js.constructorOf[typings.reactSelect.creatableMod.default[OptionType]].asInstanceOf[ComponentType[CreatableProps[OptionType]]]
  @scala.inline
  def DropdownIndicator: ComponentType[DropdownIndicatorProps[js.Any]] = js.constructorOf[typings.reactSelect.indicatorsMod.DropdownIndicator].asInstanceOf[ComponentType[DropdownIndicatorProps[js.Any]]]
  @scala.inline
  def Fade: ComponentType[FadeProps] = js.constructorOf[typings.reactSelect.transitionsMod.Fade].asInstanceOf[ComponentType[FadeProps]]
  @scala.inline
  def Group: ComponentType[GroupProps[js.Any]] = js.constructorOf[typings.reactSelect.groupMod.default].asInstanceOf[ComponentType[GroupProps[js.Any]]]
  @scala.inline
  def GroupHeading: ComponentType[js.Any] = js.constructorOf[typings.reactSelect.groupMod.GroupHeading].asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def IndicatorSeparator: ComponentType[IndicatorSeparatorProps[js.Any]] = js.constructorOf[typings.reactSelect.indicatorsMod.IndicatorSeparator].asInstanceOf[ComponentType[IndicatorSeparatorProps[js.Any]]]
  @scala.inline
  def IndicatorsContainer: ComponentType[IndicatorsContainerProps[js.Any]] = js.constructorOf[typings.reactSelect.containersMod.IndicatorsContainer].asInstanceOf[ComponentType[IndicatorsContainerProps[js.Any]]]
  @scala.inline
  def Input: ComponentType[InputProps] = js.constructorOf[typings.reactSelect.componentsInputMod.default].asInstanceOf[ComponentType[InputProps]]
  @scala.inline
  def LoadingIndicator: ComponentType[LoadingIndicatorProps[js.Any]] = js.constructorOf[typings.reactSelect.indicatorsMod.LoadingIndicator].asInstanceOf[ComponentType[LoadingIndicatorProps[js.Any]]]
  @scala.inline
  def LoadingMessage: ComponentType[LoadingMessageProps[js.Any]] = js.constructorOf[typings.reactSelect.menuMod.LoadingMessage].asInstanceOf[ComponentType[LoadingMessageProps[js.Any]]]
  @scala.inline
  def Menu[OptionType /* <: OptionTypeBase */]: ComponentType[MenuProps[OptionType]] = js.constructorOf[typings.reactSelect.menuMod.default[OptionType]].asInstanceOf[ComponentType[MenuProps[OptionType]]]
  @scala.inline
  def MenuList: ComponentType[MenuListProps[js.Any]] = js.constructorOf[typings.reactSelect.menuMod.MenuList].asInstanceOf[ComponentType[MenuListProps[js.Any]]]
  @scala.inline
  def MenuPortal[OptionType /* <: OptionTypeBase */]: ComponentType[MenuPortalProps[OptionType]] = js.constructorOf[typings.reactSelect.menuMod.MenuPortal[OptionType]].asInstanceOf[ComponentType[MenuPortalProps[OptionType]]]
  @scala.inline
  def MultiValue[OptionType /* <: OptionTypeBase */]: ComponentType[MultiValueProps[OptionType]] = js.constructorOf[typings.reactSelect.componentsMultiValueMod.default[OptionType]].asInstanceOf[ComponentType[MultiValueProps[OptionType]]]
  @scala.inline
  def MultiValueContainer: ComponentType[MultiValueContainerProps[js.Any]] = js.constructorOf[typings.reactSelect.componentsMultiValueMod.MultiValueContainer].asInstanceOf[ComponentType[MultiValueContainerProps[js.Any]]]
  @scala.inline
  def MultiValueGeneric: ComponentType[MultiValueGenericProps[js.Any]] = js.constructorOf[typings.reactSelect.componentsMultiValueMod.MultiValueGeneric].asInstanceOf[ComponentType[MultiValueGenericProps[js.Any]]]
  @scala.inline
  def MultiValueLabel: ComponentType[MultiValueLabelProps[js.Any]] = js.constructorOf[typings.reactSelect.componentsMultiValueMod.MultiValueLabel].asInstanceOf[ComponentType[MultiValueLabelProps[js.Any]]]
  @scala.inline
  def MultiValueRemove[OptionType /* <: OptionTypeBase */]: ComponentType[MultiValueRemoveProps[OptionType]] = js.constructorOf[typings.reactSelect.componentsMultiValueMod.MultiValueRemove[OptionType]].asInstanceOf[ComponentType[MultiValueRemoveProps[OptionType]]]
  @scala.inline
  def NoOptionsMessage: ComponentType[NoOptionsMessageProps[js.Any]] = js.constructorOf[typings.reactSelect.menuMod.NoOptionsMessage].asInstanceOf[ComponentType[NoOptionsMessageProps[js.Any]]]
  @scala.inline
  def NonceProvider: ComponentType[NonceProviderProps] = js.constructorOf[typings.reactSelect.mod.NonceProvider].asInstanceOf[ComponentType[NonceProviderProps]]
  @scala.inline
  def Option: ComponentType[OptionProps[js.Any]] = js.constructorOf[typings.reactSelect.optionMod.default].asInstanceOf[ComponentType[OptionProps[js.Any]]]
  @scala.inline
  def Placeholder: ComponentType[PlaceholderProps[js.Any]] = js.constructorOf[typings.reactSelect.componentsPlaceholderMod.default].asInstanceOf[ComponentType[PlaceholderProps[js.Any]]]
  @scala.inline
  def ReactSelect[OptionType /* <: OptionTypeBase */, T /* <: typings.reactSelect.selectMod.default[OptionType] */]: ComponentType[
    StateProps[Props[OptionType]] with typings.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]
  ] = (js.constructorOf[typings.reactSelect.mod.default[OptionType, T]]).asInstanceOf[ComponentType[
    StateProps[Props[OptionType]] with typings.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]
  ]]
  @scala.inline
  def Select[OptionType /* <: OptionTypeBase */]: ComponentType[SelectProps[OptionType]] = js.constructorOf[typings.reactSelect.selectMod.default[OptionType]].asInstanceOf[ComponentType[SelectProps[OptionType]]]
  @scala.inline
  def SelectContainer: ComponentType[SelectContainerProps[js.Any]] = js.constructorOf[typings.reactSelect.containersMod.SelectContainer].asInstanceOf[ComponentType[SelectContainerProps[js.Any]]]
  @scala.inline
  def SingleValue: ComponentType[SingleValueProps[js.Any]] = js.constructorOf[typings.reactSelect.componentsSingleValueMod.default].asInstanceOf[ComponentType[SingleValueProps[js.Any]]]
  @scala.inline
  def StateManager[OptionType /* <: OptionTypeBase */, T /* <: typings.reactSelect.selectMod.default[OptionType] */]: ComponentType[
    StateProps[Props[OptionType]] with typings.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]
  ] = (js.constructorOf[typings.reactSelect.stateManagerMod.StateManager[OptionType, T]]).asInstanceOf[ComponentType[
    StateProps[Props[OptionType]] with typings.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]
  ]]
  @scala.inline
  def ValueContainer: ComponentType[ValueContainerProps[js.Any]] = js.constructorOf[typings.reactSelect.containersMod.ValueContainer].asInstanceOf[ComponentType[ValueContainerProps[js.Any]]]
}

