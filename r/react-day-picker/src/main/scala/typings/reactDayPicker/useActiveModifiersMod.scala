package typings.reactDayPicker

import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useActiveModifiersMod {
  
  @JSImport("react-day-picker/dist/hooks/useActiveModifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useActiveModifiers(day: js.Date): ActiveModifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveModifiers")(day.asInstanceOf[js.Any]).asInstanceOf[ActiveModifiers]
  inline def useActiveModifiers(
    day: js.Date,
    /**
    * The month where the date is displayed. If not the same as `date`, the day
    * is an "outside day".
    */
  displayMonth: js.Date
  ): ActiveModifiers = (^.asInstanceOf[js.Dynamic].applyDynamic("useActiveModifiers")(day.asInstanceOf[js.Any], displayMonth.asInstanceOf[js.Any])).asInstanceOf[ActiveModifiers]
}
