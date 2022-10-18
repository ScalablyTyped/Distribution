package typings.rcInput

import org.scalablytyped.runtime.Shortcut
import typings.rcInput.esInterfaceMod.BaseInputProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBaseInputMod extends Shortcut {
  
  @JSImport("rc-input/es/BaseInput", JSImport.Default)
  @js.native
  val default: FC[BaseInputProps] = js.native
  
  type _To = FC[BaseInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `esBaseInputMod.foo` */
  override def _to: FC[BaseInputProps] = default
}
