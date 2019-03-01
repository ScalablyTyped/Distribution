package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: scala.Double
  var prev: scala.Double
}

object Anon_Next {
  @scala.inline
  def apply(next: scala.Double, prev: scala.Double): Anon_Next = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Anon_Next]
  }
}

