package typings.rmcCalendar

import typings.rmcCalendar.dataTypesMod.Models.Locale
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rmc-calendar/lib/util", "formatDate")
  @js.native
  def formatDate(date: Date, format: String): String = js.native
  @JSImport("rmc-calendar/lib/util", "formatDate")
  @js.native
  def formatDate(date: Date, format: String, locale: Locale): String = js.native
  
  @JSImport("rmc-calendar/lib/util", "mergeDateTime")
  @js.native
  def mergeDateTime(): Date = js.native
  @JSImport("rmc-calendar/lib/util", "mergeDateTime")
  @js.native
  def mergeDateTime(date: js.UndefOr[scala.Nothing], time: Date): Date = js.native
  @JSImport("rmc-calendar/lib/util", "mergeDateTime")
  @js.native
  def mergeDateTime(date: Date): Date = js.native
  @JSImport("rmc-calendar/lib/util", "mergeDateTime")
  @js.native
  def mergeDateTime(date: Date, time: Date): Date = js.native
  
  @JSImport("rmc-calendar/lib/util", "shallowEqual")
  @js.native
  def shallowEqual(objA: js.Any, objB: js.Any): Boolean = js.native
  @JSImport("rmc-calendar/lib/util", "shallowEqual")
  @js.native
  def shallowEqual(objA: js.Any, objB: js.Any, exclude: js.Array[String]): Boolean = js.native
}
