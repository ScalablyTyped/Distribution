package typings.reactDashSelect

import typings.reactDashSelect.srcAnimatedInputMod.AnimatedInputProps
import typings.reactDashSelect.srcAnimatedMultiValueMod.AnimatedMultiValueProps
import typings.reactDashSelect.srcAnimatedPlaceholderMod.AnimatedPlaceholderProps
import typings.reactDashSelect.srcAnimatedSingleValueMod.AnimatedSingleValueProps
import typings.reactDashSelect.srcAnimatedValueContainerMod.AnimatedValueContainerProps
import typings.reactDashSelect.srcAsyncMod.Props
import typings.reactDashSelect.srcComponentsContainersMod.ContainerProps
import typings.reactDashSelect.srcComponentsContainersMod.IndicatorContainerProps
import typings.reactDashSelect.srcComponentsIndicatorsMod.IndicatorProps
import typings.reactDashSelect.srcComponentsIndicatorsMod.LoadingIconProps
import typings.reactDashSelect.srcComponentsMenuMod.MenuListComponentProps
import typings.reactDashSelect.srcComponentsMenuMod.NoticeProps
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactDashSelectProps {
  type AsyncProps[OptionType /* <: OptionTypeBase */] = Props[OptionType]
  type AsyncCreatableProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcAsyncCreatableMod.Props[OptionType]
  type AsyncDashCreatableProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcAsyncCreatableMod.Props[OptionType]
  @scala.inline
  def BaseProps: typings.reactDashSelect.srcSelectMod.Props.type = typings.reactDashSelect.srcSelectMod.Props
  type BaseProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcSelectMod.Props[OptionType]
  type ClearIndicatorProps[OptionType /* <: OptionTypeBase */] = IndicatorProps[OptionType]
  @scala.inline
  def CollapseProps: typings.reactDashSelect.srcAnimatedTransitionsMod.CollapseProps.type = typings.reactDashSelect.srcAnimatedTransitionsMod.CollapseProps
  type CollapseProps = typings.reactDashSelect.srcAnimatedTransitionsMod.CollapseProps
  type ControlProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsControlMod.ControlProps[OptionType]
  type CreatableProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcCreatableMod.Props[OptionType]
  type DropdownIndicatorProps[OptionType /* <: OptionTypeBase */] = IndicatorProps[OptionType]
  type FadeProps = typings.reactDashSelect.srcAnimatedTransitionsMod.FadeProps
  type GroupProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsGroupMod.GroupProps[OptionType]
  type IndicatorSeparatorProps[OptionType /* <: OptionTypeBase */] = IndicatorProps[OptionType]
  type IndicatorsContainerProps[OptionType /* <: OptionTypeBase */] = IndicatorContainerProps[OptionType]
  type InputProps = AnimatedInputProps
  type LoadingIndicatorProps[OptionType /* <: OptionTypeBase */] = LoadingIconProps[OptionType]
  type LoadingMessageProps[OptionType /* <: OptionTypeBase */] = NoticeProps[OptionType]
  type MenuProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsMenuMod.MenuProps[OptionType]
  type MenuListProps[OptionType /* <: OptionTypeBase */] = MenuListComponentProps[OptionType]
  type MenuPortalProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcComponentsMenuMod.MenuPortalProps[OptionType]
  type MultiValueProps[OptionType /* <: OptionTypeBase */] = AnimatedMultiValueProps[OptionType]
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
  type PlaceholderProps[OptionType /* <: OptionTypeBase */] = AnimatedPlaceholderProps[OptionType]
  @scala.inline
  def SelectProps: typings.reactDashSelect.srcSelectMod.Props.type = typings.reactDashSelect.srcSelectMod.Props
  type SelectProps[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcSelectMod.Props[OptionType]
  type SelectContainerProps[OptionType /* <: OptionTypeBase */] = ContainerProps[OptionType]
  type SingleValueProps[OptionType /* <: OptionTypeBase */] = AnimatedSingleValueProps[OptionType]
  type ValueContainerProps[OptionType /* <: OptionTypeBase */] = AnimatedValueContainerProps[OptionType]
}

