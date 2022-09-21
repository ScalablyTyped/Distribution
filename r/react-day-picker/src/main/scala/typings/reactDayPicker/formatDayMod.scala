package typings.reactDayPicker

import typings.reactDayPicker.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDayMod {
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/formatters/formatDay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDay(day: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(day.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDay(day: js.Date, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
