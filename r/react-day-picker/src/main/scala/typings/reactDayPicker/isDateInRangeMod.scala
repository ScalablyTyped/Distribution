package typings.reactDayPicker

import typings.reactDayPicker.matchersMod.DateRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDateInRangeMod {
  
  @JSImport("react-day-picker/dist/contexts/Modifiers/utils/isDateInRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDateInRange(date: js.Date, range: DateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDateInRange")(date.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
