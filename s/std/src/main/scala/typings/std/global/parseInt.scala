package typings.std.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("parseInt")
@js.native
object parseInt extends js.Object {
  /**
    * Converts a string to an integer.
    * @param s A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in numString.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  def apply(s: java.lang.String): Double = js.native
  def apply(s: java.lang.String, radix: Double): Double = js.native
}

