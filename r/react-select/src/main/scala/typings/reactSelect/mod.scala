package typings.reactSelect

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactSelect.componentsInputMod.InputProps
import typings.reactSelect.componentsMod.IndicatorComponentType
import typings.reactSelect.componentsMultiValueMod.MultiValueProps
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.componentsSingleValueMod.SingleValueProps
import typings.reactSelect.containersMod.ContainerProps
import typings.reactSelect.containersMod.IndicatorContainerProps
import typings.reactSelect.containersMod.ValueContainerProps
import typings.reactSelect.controlMod.ControlProps
import typings.reactSelect.filtersMod.Config
import typings.reactSelect.filtersMod.Option
import typings.reactSelect.groupMod.GroupProps
import typings.reactSelect.indicatorsMod.LoadingIconProps
import typings.reactSelect.menuMod.MenuListComponentProps
import typings.reactSelect.menuMod.MenuPortalProps
import typings.reactSelect.menuMod.MenuProps
import typings.reactSelect.menuMod.NoticeProps
import typings.reactSelect.nonceProviderMod.NonceProviderProps
import typings.reactSelect.optionMod.OptionProps
import typings.reactSelect.stateManagerMod.DefaultProps
import typings.reactSelect.stateManagerMod.StateManager
import typings.reactSelect.stylesMod.StylesConfig
import typings.reactSelect.typesMod.OptionTypeBase
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class NonceProvider ()
    extends Component[NonceProviderProps, js.Object, js.Any]
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */, T /* <: typings.reactSelect.selectMod.default[OptionType] */] () extends StateManager[OptionType, T]
  
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
    var Option: NonNullable[ComponentType[OptionProps[_]]] = js.native
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

