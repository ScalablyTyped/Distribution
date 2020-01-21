package typings.reactSelect

import typings.reactSelect.containersMod.ContainerProps
import typings.reactSelect.containersMod.IndicatorContainerProps
import typings.reactSelect.indicatorsMod.IndicatorProps
import typings.reactSelect.indicatorsMod.LoadingIconProps
import typings.reactSelect.menuMod.MenuListComponentProps
import typings.reactSelect.menuMod.NoticeProps
import typings.reactSelect.srcAsyncMod.Props
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactSelectProps {
  type AsyncProps[OptionType /* <: OptionTypeBase */] = Props[OptionType]
  type AsyncCreatableProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.srcAsyncCreatableMod.Props[OptionType]
  @scala.inline
  def BaseProps: typings.reactSelect.selectMod.Props.type = typings.reactSelect.selectMod.Props
  type BaseProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.selectMod.Props[OptionType]
  type ClearIndicatorProps[OptionType /* <: OptionTypeBase */] = IndicatorProps[OptionType]
  @scala.inline
  def CollapseProps: typings.reactSelect.transitionsMod.CollapseProps.type = typings.reactSelect.transitionsMod.CollapseProps
  type CollapseProps = typings.reactSelect.transitionsMod.CollapseProps
  type ComponentsControlProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.controlMod.ControlProps[OptionType]
  type ComponentsGroupProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.groupMod.GroupProps[OptionType]
  type ComponentsIndicatorsContainerProps[OptionType /* <: OptionTypeBase */] = IndicatorContainerProps[OptionType]
  type ComponentsInputProps = typings.reactSelect.componentsInputMod.InputProps
  type ComponentsLoadingMessageProps[OptionType /* <: OptionTypeBase */] = NoticeProps[OptionType]
  type ComponentsMenuProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.menuMod.MenuProps[OptionType]
  type ComponentsMenuListProps[OptionType /* <: OptionTypeBase */] = MenuListComponentProps[OptionType]
  type ComponentsMenuPortalProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.menuMod.MenuPortalProps[OptionType]
  type ComponentsMultiValueProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.componentsMultiValueMod.MultiValueProps[OptionType]
  type ComponentsNoOptionsMessageProps[OptionType /* <: OptionTypeBase */] = NoticeProps[OptionType]
  type ComponentsOptionProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.optionMod.OptionProps[OptionType]
  type ComponentsPlaceholderProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.componentsPlaceholderMod.PlaceholderProps[OptionType]
  type ComponentsSelectContainerProps[OptionType /* <: OptionTypeBase */] = ContainerProps[OptionType]
  type ComponentsSingleValueProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.componentsSingleValueMod.SingleValueProps[OptionType]
  type ComponentsValueContainerProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.containersMod.ValueContainerProps[OptionType]
  type ControlProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.controlMod.ControlProps[OptionType]
  type CreatableProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.srcCreatableMod.Props[OptionType]
  type DropdownIndicatorProps[OptionType /* <: OptionTypeBase */] = IndicatorProps[OptionType]
  @scala.inline
  def FadeProps: typings.reactSelect.transitionsMod.FadeProps.type = typings.reactSelect.transitionsMod.FadeProps
  type FadeProps = typings.reactSelect.transitionsMod.FadeProps
  type GroupProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.groupMod.GroupProps[OptionType]
  type IndicatorSeparatorProps[OptionType /* <: OptionTypeBase */] = IndicatorProps[OptionType]
  type IndicatorsContainerProps[OptionType /* <: OptionTypeBase */] = IndicatorContainerProps[OptionType]
  type InputProps = typings.reactSelect.componentsInputMod.InputProps
  type LoadingIndicatorProps[OptionType /* <: OptionTypeBase */] = LoadingIconProps[OptionType]
  type LoadingMessageProps[OptionType /* <: OptionTypeBase */] = NoticeProps[OptionType]
  type MenuProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.menuMod.MenuProps[OptionType]
  type MenuListProps[OptionType /* <: OptionTypeBase */] = MenuListComponentProps[OptionType]
  type MenuPortalProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.menuMod.MenuPortalProps[OptionType]
  type MultiValueProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.componentsMultiValueMod.MultiValueProps[OptionType]
  @scala.inline
  def MultiValueContainerProps: typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps.type = typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps
  type MultiValueContainerProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps[OptionType]
  @scala.inline
  def MultiValueGenericProps: typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps.type = typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps
  type MultiValueGenericProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps[OptionType]
  @scala.inline
  def MultiValueLabelProps: typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps.type = typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps
  type MultiValueLabelProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps[OptionType]
  type MultiValueRemoveProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.componentsMultiValueMod.MultiValueRemoveProps[OptionType]
  type NoOptionsMessageProps[OptionType /* <: OptionTypeBase */] = NoticeProps[OptionType]
  @scala.inline
  def NonceProviderProps: typings.reactSelect.nonceProviderMod.NonceProviderProps.type = typings.reactSelect.nonceProviderMod.NonceProviderProps
  type NonceProviderProps = typings.reactSelect.nonceProviderMod.NonceProviderProps
  type OptionProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.optionMod.OptionProps[OptionType]
  type PlaceholderProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.componentsPlaceholderMod.PlaceholderProps[OptionType]
  @scala.inline
  def SelectProps: typings.reactSelect.selectMod.Props.type = typings.reactSelect.selectMod.Props
  type SelectProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.selectMod.Props[OptionType]
  type SelectContainerProps[OptionType /* <: OptionTypeBase */] = ContainerProps[OptionType]
  type SingleValueProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.componentsSingleValueMod.SingleValueProps[OptionType]
  type ValueContainerProps[OptionType /* <: OptionTypeBase */] = typings.reactSelect.containersMod.ValueContainerProps[OptionType]
}

