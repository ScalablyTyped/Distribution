package typings.reactDatePicker

import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedDateFormatterMod {
  
  @JSImport("react-date-picker/dist/cjs/shared/dateFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatMonth(locale: String, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonth")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatMonth(locale: Unit, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonth")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatShortMonth(locale: String, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatShortMonth")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatShortMonth(locale: Unit, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatShortMonth")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getFormatter(options: DateTimeFormatOptions): js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]]
}
