package typings.reactDayPicker

import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import typings.reactDayPicker.useDayEventHandlersUseDayEventHandlersMod.DayEventHandlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDayEventHandlersMod {
  
  @JSImport("react-day-picker/dist/hooks/useDayEventHandlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDayEventHandlers(date: js.Date, activeModifiers: ActiveModifiers): DayEventHandlers = (^.asInstanceOf[js.Dynamic].applyDynamic("useDayEventHandlers")(date.asInstanceOf[js.Any], activeModifiers.asInstanceOf[js.Any])).asInstanceOf[DayEventHandlers]
}
