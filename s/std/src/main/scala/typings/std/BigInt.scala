package typings.std

import typings.std.Intl.LocalesArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigInt extends StObject {
  
  def toLocaleString(locales: Unit, options: BigIntToLocaleStringOptions): java.lang.String = js.native
  def toLocaleString(locales: LocalesArgument): java.lang.String = js.native
  def toLocaleString(locales: LocalesArgument, options: BigIntToLocaleStringOptions): java.lang.String = js.native
  
  def toString(radix: Double): java.lang.String = js.native
  
  /* standard es2020.bigint */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.std.stdStrings.BigInt = js.native
}
