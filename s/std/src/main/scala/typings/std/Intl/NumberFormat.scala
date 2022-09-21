package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormat extends StObject {
  
  def format(value: js.BigInt): String = js.native
  /* standard es2020.bigint */
  def format(value: Double): String = js.native
  
  def formatRange(start: js.BigInt, end: js.BigInt): String = js.native
  def formatRange(start: js.BigInt, end: Double): String = js.native
  def formatRange(start: Double, end: js.BigInt): String = js.native
  /* standard esnext.intl */
  def formatRange(start: Double, end: Double): String = js.native
  
  def formatRangeToParts(start: js.BigInt, end: js.BigInt): js.Array[NumberRangeFormatPart] = js.native
  def formatRangeToParts(start: js.BigInt, end: Double): js.Array[NumberRangeFormatPart] = js.native
  def formatRangeToParts(start: Double, end: js.BigInt): js.Array[NumberRangeFormatPart] = js.native
  /* standard esnext.intl */
  def formatRangeToParts(start: Double, end: Double): js.Array[NumberRangeFormatPart] = js.native
  
  /* standard es2018.intl */
  def formatToParts(): js.Array[NumberFormatPart] = js.native
  def formatToParts(number: js.BigInt): js.Array[NumberFormatPart] = js.native
  def formatToParts(number: Double): js.Array[NumberFormatPart] = js.native
  
  /* standard es2020.bigint */
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}
