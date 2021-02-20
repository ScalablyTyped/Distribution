package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormat extends StObject {
  
  def format(value: js.BigInt): String = js.native
  def format(value: Double): String = js.native
  
  def formatToParts(): js.Array[NumberFormatPart] = js.native
  def formatToParts(number: Double): js.Array[NumberFormatPart] = js.native
  
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}
