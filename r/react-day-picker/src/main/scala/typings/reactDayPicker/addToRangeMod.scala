package typings.reactDayPicker

import typings.reactDayPicker.matchersMod.DateRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addToRangeMod {
  
  @JSImport("react-day-picker/dist/contexts/SelectRange/utils/addToRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addToRange(day: js.Date): js.UndefOr[DateRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("addToRange")(day.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DateRange]]
  inline def addToRange(day: js.Date, range: DateRange): js.UndefOr[DateRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRange")(day.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DateRange]]
}
