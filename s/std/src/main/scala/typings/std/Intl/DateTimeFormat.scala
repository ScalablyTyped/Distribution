package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormat extends StObject {
  
  /* standard es5 */
  def format(): String = js.native
  def format(date: js.Date): String = js.native
  def format(date: Double): String = js.native
  
  def formatRange(startDate: js.BigInt, endDate: js.BigInt): String = js.native
  def formatRange(startDate: js.BigInt, endDate: js.Date): String = js.native
  def formatRange(startDate: js.BigInt, endDate: Double): String = js.native
  def formatRange(startDate: js.Date, endDate: js.BigInt): String = js.native
  /* standard es2021.intl */
  def formatRange(startDate: js.Date, endDate: js.Date): String = js.native
  def formatRange(startDate: js.Date, endDate: Double): String = js.native
  def formatRange(startDate: Double, endDate: js.BigInt): String = js.native
  def formatRange(startDate: Double, endDate: js.Date): String = js.native
  def formatRange(startDate: Double, endDate: Double): String = js.native
  
  def formatRangeToParts(startDate: js.BigInt, endDate: js.BigInt): js.Array[DateTimeRangeFormatPart] = js.native
  def formatRangeToParts(startDate: js.BigInt, endDate: js.Date): js.Array[DateTimeRangeFormatPart] = js.native
  def formatRangeToParts(startDate: js.BigInt, endDate: Double): js.Array[DateTimeRangeFormatPart] = js.native
  def formatRangeToParts(startDate: js.Date, endDate: js.BigInt): js.Array[DateTimeRangeFormatPart] = js.native
  /* standard es2021.intl */
  def formatRangeToParts(startDate: js.Date, endDate: js.Date): js.Array[DateTimeRangeFormatPart] = js.native
  def formatRangeToParts(startDate: js.Date, endDate: Double): js.Array[DateTimeRangeFormatPart] = js.native
  def formatRangeToParts(startDate: Double, endDate: js.BigInt): js.Array[DateTimeRangeFormatPart] = js.native
  def formatRangeToParts(startDate: Double, endDate: js.Date): js.Array[DateTimeRangeFormatPart] = js.native
  def formatRangeToParts(startDate: Double, endDate: Double): js.Array[DateTimeRangeFormatPart] = js.native
  
  /* standard es2017.intl */
  def formatToParts(): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: js.Date): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: Double): js.Array[DateTimeFormatPart] = js.native
  
  /* standard es5 */
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}
