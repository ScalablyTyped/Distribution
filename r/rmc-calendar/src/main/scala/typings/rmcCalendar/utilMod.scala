package typings.rmcCalendar

import typings.rmcCalendar.dataTypesMod.Models.Locale
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rmc-calendar/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDate(date: Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDate(date: Date, format: String, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mergeDateTime(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDateTime")().asInstanceOf[Date]
  inline def mergeDateTime(date: Unit, time: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDateTime")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def mergeDateTime(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDateTime")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  inline def mergeDateTime(date: Date, time: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDateTime")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def shallowEqual(objA: js.Any, objB: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowEqual(objA: js.Any, objB: js.Any, exclude: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
