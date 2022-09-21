package typings.reactDayPicker

import typings.reactDayPicker.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatYearCaptionMod {
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/formatters/formatYearCaption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatYearCaption(year: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatYearCaption")(year.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatYearCaption(year: js.Date, options: `1`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatYearCaption")(year.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
