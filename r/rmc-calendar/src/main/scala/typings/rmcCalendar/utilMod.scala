package typings.rmcCalendar

import typings.rmcCalendar.dataTypesMod.Models.Locale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-calendar/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def formatDate(date: Date, format: String): String = js.native
  def formatDate(date: Date, format: String, locale: Locale): String = js.native
  
  def mergeDateTime(): Date = js.native
  def mergeDateTime(date: js.UndefOr[scala.Nothing], time: Date): Date = js.native
  def mergeDateTime(date: Date): Date = js.native
  def mergeDateTime(date: Date, time: Date): Date = js.native
  
  def shallowEqual(objA: js.Any, objB: js.Any): Boolean = js.native
  def shallowEqual(objA: js.Any, objB: js.Any, exclude: js.Array[String]): Boolean = js.native
}
