package typings
package radix64Lib.radix64Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radix extends js.Object {
  var methods: MethodsEnum = js.native
  def ascii64(number: scala.Double): java.lang.String = js.native
  def ascii64(number: scala.Double, pad: scala.Double): java.lang.String = js.native
  def radix64(number: scala.Double): java.lang.String = js.native
  def radix64(number: scala.Double, method: radix64Lib.MethodsString): java.lang.String = js.native
}

