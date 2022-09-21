package typings.reactDayPicker

import typings.reactDayPicker.useInputUseInputMod.UseInputOptions
import typings.reactDayPicker.useInputUseInputMod.UseInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useInputMod {
  
  @JSImport("react-day-picker/dist/hooks/useInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useInput(): UseInputValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")().asInstanceOf[UseInputValue]
  inline def useInput(options: UseInputOptions): UseInputValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")(options.asInstanceOf[js.Any]).asInstanceOf[UseInputValue]
}
