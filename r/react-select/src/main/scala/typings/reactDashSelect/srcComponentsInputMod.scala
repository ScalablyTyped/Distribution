package typings.reactDashSelect

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Ref
import typings.reactDashSelect.srcTypesMod.ClassNamesState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Input", JSImport.Namespace)
@js.native
object srcComponentsInputMod extends js.Object {
  @js.native
  class Input protected ()
    extends Component[InputProps, ComponentState, js.Any] {
    def this(props: InputProps) = this()
    def this(props: InputProps, context: js.Any) = this()
  }
  
  /* Inlined react-select.react-select/src/types.PropsWithStyles & {cx (a : string | null, b : react-select.react-select/src/types.ClassNamesState, c : string): string | void, innerRef (element : react.react.Ref<any>): void,   isHidden  :boolean,   isDisabled ? :boolean,   className ? :string} */
  @js.native
  trait InputProps extends js.Object {
    var className: js.UndefOr[String] = js.native
    /** Whether the input is disabled */
    var isDisabled: js.UndefOr[Boolean] = js.native
    /** Set whether the input should be visible. Does not affect input size. */
    var isHidden: Boolean = js.native
    def cx(a: String, b: ClassNamesState, c: String): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState, c: String): String | Unit = js.native
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    /** Reference to the internal element */
    def innerRef(element: Ref[_]): Unit = js.native
  }
  
  @js.native
  class default protected ()
    extends Component[InputProps, ComponentState, js.Any] {
    def this(props: InputProps) = this()
    def this(props: InputProps, context: js.Any) = this()
  }
  
  def inputCSS(props: InputProps): CSSProperties = js.native
  def inputStyle(isHidden: Boolean): CSSProperties = js.native
  @js.native
  object Input extends TopLevel[ComponentType[InputProps]]
  
  @js.native
  object default extends TopLevel[ComponentType[InputProps]]
  
}

