package typings.reactDayPicker

import typings.reactDayPicker.anon.DisableNavigation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNextMonthMod {
  
  @JSImport("react-day-picker/dist/contexts/Navigation/utils/getNextMonth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNextMonth(startingMonth: js.Date, options: DisableNavigation): js.UndefOr[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextMonth")(startingMonth.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Date]]
}
