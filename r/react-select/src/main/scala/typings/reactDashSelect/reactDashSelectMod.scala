package typings.reactDashSelect

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.reactDashSelect.reactDashSelectStrings.option
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
import typings.reactDashSelect.srcComponentsMod.IndicatorComponentType
import typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueProps
import typings.reactDashSelect.srcComponentsOptionMod.InnerProps
import typings.reactDashSelect.srcComponentsPlaceholderMod.PlaceholderProps
import typings.reactDashSelect.srcComponentsSingleValueMod.SingleValueProps
import typings.reactDashSelect.srcFiltersMod.Config
import typings.reactDashSelect.srcFiltersMod.Option
import typings.reactDashSelect.srcSelectMod.Props
import typings.reactDashSelect.srcStateManagerMod.DefaultProps
import typings.reactDashSelect.srcStateManagerMod.StateManager
import typings.reactDashSelect.srcStylesMod.StylesConfig
import typings.reactDashSelect.srcTypesMod.ActionTypes
import typings.reactDashSelect.srcTypesMod.ClassNamesState
import typings.reactDashSelect.srcTypesMod.InnerRef
import typings.reactDashSelect.srcTypesMod.MouseEventHandler
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.OptionsType
import typings.reactDashSelect.srcTypesMod.ValueType
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select", JSImport.Namespace)
@js.native
object reactDashSelectMod extends js.Object {
  @js.native
  trait OptionProps[OptionType /* <: OptionTypeBase */] extends js.Object {
    /** The children to be rendered. */
    var children: ReactNode = js.native
    var className: js.UndefOr[String] = js.native
    /* The data of the selected option. */
    var data: js.Any = js.native
    var hasValue: Boolean = js.native
    var id: Double = js.native
    var index: Double = js.native
    /** props passed to the wrapping element for the group. */
    var innerProps: InnerProps = js.native
    /** The inner reference. */
    /** Inner ref to DOM Node */
    var innerRef: Ref[_] with InnerRef = js.native
    /** Whether the option is disabled. */
    var isDisabled: Boolean = js.native
    /** Whether the option is focused. */
    var isFocused: Boolean = js.native
    var isMulti: Boolean = js.native
    /** Whether the option is selected. */
    var isSelected: Boolean = js.native
    /* Text to be displayed representing the option. */
    var label: String = js.native
    var onClick: MouseEventHandler = js.native
    var onMouseOver: MouseEventHandler = js.native
    var options: OptionsType[OptionType] = js.native
    var selectProps: Props[OptionType] = js.native
    /* Type is used by the menu to determine whether this is an option or a group.
      In the case of option this is always `option`. */
    var `type`: option = js.native
    var value: js.Any = js.native
    def clearValue(): Unit = js.native
    def cx(): String | Unit = js.native
    def cx(a: String): String | Unit = js.native
    def cx(a: String, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
    def cx(a: String, b: ClassNamesState): String | Unit = js.native
    def cx(a: Null, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState): String | Unit = js.native
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    def getValue(): ValueType[OptionType] = js.native
    def selectOption(option: OptionType): Unit = js.native
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */, T /* <: typings.reactDashSelect.srcSelectMod.default[OptionType] */] () extends StateManager[OptionType, T]
  
  def createFilter(): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def createFilter(config: Config): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def mergeStyles(source: StylesConfig, target: StylesConfig): StylesConfig = js.native
  @js.native
  object components extends js.Object {
    var ClearIndicator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    var Control: NonNullable[ComponentType[ControlProps[_]]] = js.native
    var CrossIcon: NonNullable[ComponentType[_]] = js.native
    var DownChevron: NonNullable[ComponentType[_]] = js.native
    var DropdownIndicator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    var Group: NonNullable[ComponentType[GroupProps[_]]] = js.native
    var GroupHeading: NonNullable[ComponentType[_]] = js.native
    var IndicatorSeparator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    var IndicatorsContainer: NonNullable[ComponentType[IndicatorContainerProps[_]]] = js.native
    var Input: NonNullable[ComponentType[InputProps]] = js.native
    var LoadingIndicator: NonNullable[ComponentType[LoadingIconProps[_]] | Null] = js.native
    var LoadingMessage: NonNullable[ComponentType[NoticeProps[_]]] = js.native
    var Menu: NonNullable[ComponentType[MenuProps[_]]] = js.native
    var MenuList: NonNullable[ComponentType[MenuListComponentProps[_]]] = js.native
    var MenuPortal: NonNullable[ComponentType[MenuPortalProps[_]]] = js.native
    var MultiValue: NonNullable[ComponentType[MultiValueProps[_]]] = js.native
    var MultiValueContainer: NonNullable[ComponentType[_]] = js.native
    var MultiValueLabel: NonNullable[ComponentType[_]] = js.native
    var MultiValueRemove: NonNullable[ComponentType[_]] = js.native
    var NoOptionsMessage: NonNullable[ComponentType[NoticeProps[_]]] = js.native
    var Option: NonNullable[ComponentType[typings.reactDashSelect.srcComponentsOptionMod.OptionProps[_]]] = js.native
    var Placeholder: NonNullable[ComponentType[PlaceholderProps[_]]] = js.native
    var SelectContainer: NonNullable[ComponentType[ContainerProps[_]]] = js.native
    var SingleValue: NonNullable[ComponentType[SingleValueProps[_]]] = js.native
    var ValueContainer: NonNullable[ComponentType[ValueContainerProps[_]]] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: DefaultProps[_] = js.native
  }
  
}

