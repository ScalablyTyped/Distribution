package typings.reactDatetimePicker

import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedDateFormatterMod {
  
  @JSImport("react-datetime-picker/dist/cjs/shared/dateFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDate(locale: String, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDate(locale: Unit, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getFormatter(options: DateTimeFormatOptions): js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]]
  
  inline def getNumberFormatter(options: NumberFormatOptions): js.Function2[/* locale */ js.UndefOr[String], /* number */ Double, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberFormatter")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* locale */ js.UndefOr[String], /* number */ Double, Any]]
}
