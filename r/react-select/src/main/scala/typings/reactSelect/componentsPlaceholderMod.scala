package typings.reactSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.anon.Style
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPlaceholderMod extends Shortcut {
  
  @JSImport("react-select/src/components/Placeholder", JSImport.Default)
  @js.native
  val default: ComponentType[PlaceholderProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Placeholder", "Placeholder")
  @js.native
  val Placeholder: ComponentType[PlaceholderProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Placeholder", "placeholderCSS")
  @js.native
  def placeholderCSS(): CSSProperties = js.native
  
  @js.native
  trait PlaceholderProps[OptionType /* <: OptionTypeBase */] extends CommonProps[OptionType] {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    var innerProps: Style = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
  }
  
  type _To = ComponentType[PlaceholderProps[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `componentsPlaceholderMod.foo` */
  override def _to: ComponentType[PlaceholderProps[js.Any]] = default
}
