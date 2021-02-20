package typings.reactSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInputMod extends Shortcut {
  
  @JSImport("react-select/src/components/Input", JSImport.Default)
  @js.native
  val default: ComponentType[InputProps] = js.native
  
  @JSImport("react-select/src/components/Input", "Input")
  @js.native
  val Input: ComponentType[InputProps] = js.native
  
  @JSImport("react-select/src/components/Input", "inputCSS")
  @js.native
  def inputCSS(props: InputProps): CSSProperties = js.native
  
  @JSImport("react-select/src/components/Input", "inputStyle")
  @js.native
  def inputStyle(isHidden: Boolean): CSSProperties = js.native
  
  /* Inlined react-select.react-select/src/types.PropsWithStyles & {cx (a : string | null, b : react-select.react-select/src/types.ClassNamesState, c : string): string | void, innerRef (element : react.react.Ref<any>): void,   isHidden :boolean,   isDisabled :boolean | undefined,   className :string | undefined} */
  @js.native
  trait InputProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
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
    
    /** Whether the input is disabled */
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    /** Set whether the input should be visible. Does not affect input size. */
    var isHidden: Boolean = js.native
    
    var theme: Theme = js.native
  }
  
  type _To = ComponentType[InputProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsInputMod.foo` */
  override def _to: ComponentType[InputProps] = default
}
