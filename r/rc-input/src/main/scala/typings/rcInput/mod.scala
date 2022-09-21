package typings.rcInput

import org.scalablytyped.runtime.Shortcut
import typings.rcInput.interfaceMod.BaseInputProps
import typings.rcInput.interfaceMod.InputProps
import typings.rcInput.interfaceMod.InputRef
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-input", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]] = js.native
  
  @JSImport("rc-input", "BaseInput")
  @js.native
  val BaseInput: FC[BaseInputProps] = js.native
  
  type _To = ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]] = default
}
