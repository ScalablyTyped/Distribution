package typings.reactDashSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.reactDashSelect.srcAnimatedPlaceholderMod.AnimatedPlaceholderProps
import typings.reactDashSelect.srcComponentsPlaceholderMod.PlaceholderProps
import typings.reactDashSelect.srcSelectMod.Props
import typings.reactDashSelect.srcTypesMod.ActionTypes
import typings.reactDashSelect.srcTypesMod.ClassNamesState
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.OptionsType
import typings.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/Placeholder", JSImport.Namespace)
@js.native
object srcAnimatedPlaceholderMod extends js.Object {
  /* Inlined react-select.react-select/src/components/Placeholder.PlaceholderProps<OptionType> */
  @js.native
  trait AnimatedPlaceholderProps[OptionType /* <: OptionTypeBase */] extends js.Object {
    /** The children to be rendered. */
    var children: ReactNode = js.native
    var className: js.UndefOr[String] = js.native
    var hasValue: Boolean = js.native
    /** props passed to the wrapping element for the group. */
    var innerProps: StringDictionary[js.Any] = js.native
    var isMulti: Boolean = js.native
    var options: OptionsType[OptionType] = js.native
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
  
  def AnimatedPlaceholder[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[PlaceholderProps[OptionType]]): ComponentType[AnimatedPlaceholderProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[PlaceholderProps[OptionType]]): ComponentType[AnimatedPlaceholderProps[OptionType]] = js.native
}

