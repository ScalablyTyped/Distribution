package typings.reactDashSelect

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.reactDashSelect.srcAnimatedMultiValueMod.AnimatedMultiValueProps
import typings.reactDashSelect.srcAnimatedTransitionsMod.fn
import typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueProps
import typings.reactDashSelect.srcSelectMod.Props
import typings.reactDashSelect.srcTypesMod.ActionTypes
import typings.reactDashSelect.srcTypesMod.ClassNamesState
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.OptionsType
import typings.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/MultiValue", JSImport.Namespace)
@js.native
object srcAnimatedMultiValueMod extends js.Object {
  /* Inlined {  in  :boolean,   onExited  :react-select.react-select/src/animated/transitions.fn} & react-select.react-select/src/components/MultiValue.MultiValueProps<OptionType> */
  @js.native
  trait AnimatedMultiValueProps[OptionType /* <: OptionTypeBase */] extends js.Object {
    var children: ReactNode = js.native
    var className: js.UndefOr[String] = js.native
    var components: js.Any = js.native
    var cropWithEllipsis: Boolean = js.native
    var data: OptionType = js.native
    var hasValue: Boolean = js.native
    var in: Boolean = js.native
    var innerProps: js.Any = js.native
    var isDisabled: Boolean = js.native
    var isFocused: Boolean = js.native
    var isMulti: Boolean = js.native
    var onExited: fn = js.native
    var options: OptionsType[OptionType] = js.native
    var removeProps: Anon_Event = js.native
    var selectProps: Props[OptionType] = js.native
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
  
  def AnimatedMultiValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[MultiValueProps[OptionType]]): ComponentType[AnimatedMultiValueProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[MultiValueProps[OptionType]]): ComponentType[AnimatedMultiValueProps[OptionType]] = js.native
}

