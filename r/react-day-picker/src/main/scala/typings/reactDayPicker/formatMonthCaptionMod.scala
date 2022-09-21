package typings.reactDayPicker

import typings.reactDayPicker.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMonthCaptionMod {
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/formatters/formatMonthCaption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatMonthCaption(month: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthCaption")(month.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatMonthCaption(month: js.Date, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthCaption")(month.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
