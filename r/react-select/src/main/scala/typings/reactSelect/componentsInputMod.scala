package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.PropsWithStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInputMod {
  
  @JSImport("react-select/src/components/Input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/components/Input", JSImport.Default)
  @js.native
  val default: ComponentType[InputProps] = js.native
  
  @JSImport("react-select/src/components/Input", "Input")
  @js.native
  val Input: ComponentType[InputProps] = js.native
  
  @scala.inline
  def inputCSS(props: InputProps): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("inputCSS")(props.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  @scala.inline
  def inputStyle(isHidden: Boolean): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("inputStyle")(isHidden.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  @js.native
  trait InputProps
    extends StObject
       with PropsWithStyles {
    
    var className: js.UndefOr[String] = js.native
    
    def cx(a: String, b: ClassNamesState, c: String): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState, c: String): String | Unit = js.native
    
    /** Reference to the internal element */
    def innerRef(element: Ref[js.Any]): Unit = js.native
    
    /** Whether the input is disabled */
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    /** Set whether the input should be visible. Does not affect input size. */
    var isHidden: Boolean = js.native
  }
}
