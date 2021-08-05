package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.anon.Style
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPlaceholderMod {
  
  @JSImport("react-select/src/components/Placeholder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/components/Placeholder", JSImport.Default)
  @js.native
  val default: ComponentType[PlaceholderProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Placeholder", "Placeholder")
  @js.native
  val Placeholder: ComponentType[PlaceholderProps[js.Any]] = js.native
  
  inline def placeholderCSS(): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("placeholderCSS")().asInstanceOf[CSSProperties]
  
  @js.native
  trait PlaceholderProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType] {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    var innerProps: Style = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
  }
}
