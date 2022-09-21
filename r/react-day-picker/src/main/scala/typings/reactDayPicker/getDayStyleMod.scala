package typings.reactDayPicker

import typings.react.mod.CSSProperties
import typings.reactDayPicker.anon.PickDayPickerContextValueModifiersStyles
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDayStyleMod {
  
  @JSImport("react-day-picker/dist/hooks/useDayRender/utils/getDayStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDayStyle(dayPicker: PickDayPickerContextValueModifiersStyles, activeModifiers: ActiveModifiers): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayStyle")(dayPicker.asInstanceOf[js.Any], activeModifiers.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
}
