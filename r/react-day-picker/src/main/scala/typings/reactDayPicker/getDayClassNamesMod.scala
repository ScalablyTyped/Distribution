package typings.reactDayPicker

import typings.reactDayPicker.anon.PickDayPickerContextValue
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDayClassNamesMod {
  
  @JSImport("react-day-picker/dist/hooks/useDayRender/utils/getDayClassNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDayClassNames(dayPicker: PickDayPickerContextValue, activeModifiers: ActiveModifiers): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayClassNames")(dayPicker.asInstanceOf[js.Any], activeModifiers.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
