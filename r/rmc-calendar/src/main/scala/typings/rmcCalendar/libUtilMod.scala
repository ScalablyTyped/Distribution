package typings.rmcCalendar

import typings.rmcCalendar.libDateDataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMod {
  
  @JSImport("rmc-calendar/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDate(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDate(date: js.Date, format: String, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mergeDateTime(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDateTime")().asInstanceOf[js.Date]
  inline def mergeDateTime(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDateTime")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def mergeDateTime(date: js.Date, time: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDateTime")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def mergeDateTime(date: Unit, time: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDateTime")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def shallowEqual(objA: Any, objB: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowEqual(objA: Any, objB: Any, exclude: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
