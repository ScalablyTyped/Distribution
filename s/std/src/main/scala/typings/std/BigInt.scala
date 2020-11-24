package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigInt extends js.Object {
  
  def toLocaleString(locales: js.UndefOr[scala.Nothing], options: BigIntToLocaleStringOptions): java.lang.String = js.native
  def toLocaleString(locales: java.lang.String): java.lang.String = js.native
  def toLocaleString(locales: java.lang.String, options: BigIntToLocaleStringOptions): java.lang.String = js.native
  
  def toString(radix: Double): java.lang.String = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.std.stdStrings.BigInt = js.native
}
