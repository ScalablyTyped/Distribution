package typings.reactSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/Placeholder", JSImport.Namespace)
@js.native
object placeholderMod extends js.Object {
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
    def cx(): String = js.native
    def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
    def cx(state: ClassNamesState): String = js.native
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

