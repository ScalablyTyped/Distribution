package typings.repeating

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("repeating", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Repeat a string - fast
    *
    * @param count Times the 'string' should be repeated.
    * @param str String to repeat. Default: ' '
    */
  def apply(count: Double): String = js.native
  def apply(count: Double, str: String): String = js.native
}

