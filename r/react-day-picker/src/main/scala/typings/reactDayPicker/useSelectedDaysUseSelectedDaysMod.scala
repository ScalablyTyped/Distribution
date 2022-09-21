package typings.reactDayPicker

import typings.reactDayPicker.matchersMod.DateRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSelectedDaysUseSelectedDaysMod {
  
  @JSImport("react-day-picker/dist/hooks/useSelectedDays/useSelectedDays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSelectedDays(): SelectedDays = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedDays")().asInstanceOf[SelectedDays]
  
  type SelectedDays = js.UndefOr[js.Date | js.Array[js.Date] | DateRange]
}
