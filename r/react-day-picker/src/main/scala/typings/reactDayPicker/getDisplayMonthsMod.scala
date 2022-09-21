package typings.reactDayPicker

import typings.reactDayPicker.anon.NumberOfMonths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDisplayMonthsMod {
  
  @JSImport("react-day-picker/dist/contexts/Navigation/utils/getDisplayMonths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDisplayMonths(month: js.Date, hasReverseMonthsNumberOfMonths: NumberOfMonths): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayMonths")(month.asInstanceOf[js.Any], hasReverseMonthsNumberOfMonths.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
}
