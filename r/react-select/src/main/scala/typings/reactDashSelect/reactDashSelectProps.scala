package typings.reactDashSelect

import typings.reactDashSelect.srcComponentsContainersMod.ContainerProps
import typings.reactDashSelect.srcComponentsContainersMod.IndicatorContainerProps
import typings.reactDashSelect.srcComponentsIndicatorsMod.IndicatorProps
import typings.reactDashSelect.srcComponentsIndicatorsMod.LoadingIconProps
import typings.reactDashSelect.srcComponentsMenuMod.MenuListComponentProps
import typings.reactDashSelect.srcComponentsMenuMod.NoticeProps
import typings.reactDashSelect.srcSelectMod.Props
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactDashSelectProps {
  type ClearIndicatorProps[OptionType /* <: OptionTypeBase */] = IndicatorProps[OptionType]
  type ControlProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsControlMod.ControlProps[OptionType]
  type DropdownIndicatorProps[OptionType /* <: OptionTypeBase */] = IndicatorProps[OptionType]
  type GroupProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsGroupMod.GroupProps[OptionType]
  type IndicatorSeparatorProps[OptionType /* <: OptionTypeBase */] = IndicatorProps[OptionType]
  type IndicatorsContainerProps[OptionType /* <: OptionTypeBase */] = IndicatorContainerProps[OptionType]
  type InputProps = typings.reactDashSelect.srcComponentsInputMod.InputProps
  type LoadingIndicatorProps[OptionType /* <: OptionTypeBase */] = LoadingIconProps[OptionType]
  type LoadingMessageProps[OptionType /* <: OptionTypeBase */] = NoticeProps[OptionType]
  type MenuProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsMenuMod.MenuProps[OptionType]
  type MenuListProps[OptionType /* <: OptionTypeBase */] = MenuListComponentProps[OptionType]
  type MenuPortalProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsMenuMod.MenuPortalProps[OptionType]
  type MultiValueProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueProps[OptionType]
  @scala.inline
  def MultiValueContainerProps: typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueGenericProps.type = typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueGenericProps
  type MultiValueContainerProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueGenericProps[OptionType]
  @scala.inline
  def MultiValueGenericProps: typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueGenericProps.type = typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueGenericProps
  type MultiValueGenericProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueGenericProps[OptionType]
  @scala.inline
  def MultiValueLabelProps: typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueGenericProps.type = typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueGenericProps
  type MultiValueLabelProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueGenericProps[OptionType]
  type MultiValueRemoveProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueRemoveProps[OptionType]
  type NoOptionsMessageProps[OptionType /* <: OptionTypeBase */] = NoticeProps[OptionType]
  type OptionProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsOptionMod.OptionProps[OptionType]
  type PlaceholderProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsPlaceholderMod.PlaceholderProps[OptionType]
  @scala.inline
  def SelectProps: Props.type = typings.reactDashSelect.srcSelectMod.Props
  type SelectProps[OptionType /* <: OptionTypeBase */] = Props[OptionType]
  type SelectContainerProps[OptionType /* <: OptionTypeBase */] = ContainerProps[OptionType]
  type SingleValueProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsSingleValueMod.SingleValueProps[OptionType]
  type ValueContainerProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsContainersMod.ValueContainerProps[OptionType]
}

