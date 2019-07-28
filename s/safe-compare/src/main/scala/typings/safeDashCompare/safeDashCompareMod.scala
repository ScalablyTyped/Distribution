package typings.safeDashCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("safe-compare", JSImport.Namespace)
@js.native
object safeDashCompareMod extends js.Object {
  /**
    * Do a constant time string comparison. Always compare the complete strings
    * against each other to get a constant time. This method does not short-cut
    * if the two string's length differs.
    */
  def apply(a: String, b: String): Boolean = js.native
}

