package typings.reactSelect

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Placeholder", JSImport.Namespace)
@js.native
object componentsPlaceholderMod extends js.Object {
  @js.native
  class Placeholder protected ()
    extends Component[PlaceholderProps[js.Any], ComponentState, js.Any] {
    def this(props: PlaceholderProps[_]) = this()
    def this(props: PlaceholderProps[_], context: js.Any) = this()
  }
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children  :react.react.ReactNode,   innerProps  :{[key: string] : any}} */
  @js.native
  trait PlaceholderProps[OptionType /* <: OptionTypeBase */] extends js.Object {
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
    def cx(a: String, b: ClassNamesState): String | Unit = js.native
    def cx(a: String, b: ClassNamesState, c: String): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState, c: String): String | Unit = js.native
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
  class default protected ()
    extends Component[PlaceholderProps[js.Any], ComponentState, js.Any] {
    def this(props: PlaceholderProps[_]) = this()
    def this(props: PlaceholderProps[_], context: js.Any) = this()
  }
  
  def placeholderCSS(): CSSProperties = js.native
  @js.native
  object Placeholder
    extends TopLevel[ComponentType[PlaceholderProps[js.Any]]]
  
  @js.native
  object default
    extends TopLevel[ComponentType[PlaceholderProps[js.Any]]]
  
}

