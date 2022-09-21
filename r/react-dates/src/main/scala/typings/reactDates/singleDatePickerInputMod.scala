package typings.reactDates

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.reactDates.mod.SingleDatePickerInputShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleDatePickerInputMod extends Shortcut {
  
  @JSImport("react-dates/esm/components/SingleDatePickerInput", JSImport.Default)
  @js.native
  val default: FC[SingleDatePickerInputShape] = js.native
  
  type _To = FC[SingleDatePickerInputShape]
  
  /* This means you don't have to write `default`, but can instead just say `singleDatePickerInputMod.foo` */
  override def _to: FC[SingleDatePickerInputShape] = default
}
