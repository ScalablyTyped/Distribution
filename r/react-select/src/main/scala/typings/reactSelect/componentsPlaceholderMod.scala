package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.anon.Style
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/components/Placeholder", JSImport.Namespace)
@js.native
object componentsPlaceholderMod extends js.Object {
  
  val Placeholder: ComponentType[PlaceholderProps[js.Any]] = js.native
  
  val default: ComponentType[PlaceholderProps[js.Any]] = js.native
  
  def placeholderCSS(): CSSProperties = js.native
  
  @js.native
  trait PlaceholderProps[OptionType /* <: OptionTypeBase */] extends CommonProps[OptionType] {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    var innerProps: Style = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
  }
}
