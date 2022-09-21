package typings.reactDayPicker

import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import typings.reactDayPicker.typesModifiersMod.Modifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersMod {
  
  @JSImport("react-day-picker/dist/contexts/Modifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActiveModifiers(day: js.Date, /** The modifiers to match for the given date. */
  modifiers: Modifiers): ActiveModifiers = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveModifiers")(day.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[ActiveModifiers]
  inline def getActiveModifiers(
    day: js.Date,
    /** The modifiers to match for the given date. */
  modifiers: Modifiers,
    /** The month where the day is displayed, to add the "outside" modifiers.  */
  displayMonth: js.Date
  ): ActiveModifiers = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveModifiers")(day.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any], displayMonth.asInstanceOf[js.Any])).asInstanceOf[ActiveModifiers]
  
  inline def useModifiers(): Modifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("useModifiers")().asInstanceOf[Modifiers]
}
