package typings
package reactDashLazylogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientHeight extends js.Object {
  var clientHeight: scala.Double
  var scrollHeight: scala.Double
  var scrollTop: scala.Double
}

object Anon_ClientHeight {
  @scala.inline
  def apply(clientHeight: scala.Double, scrollHeight: scala.Double, scrollTop: scala.Double): Anon_ClientHeight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientHeight")(clientHeight)
    __obj.updateDynamic("scrollHeight")(scrollHeight)
    __obj.updateDynamic("scrollTop")(scrollTop)
    __obj.asInstanceOf[Anon_ClientHeight]
  }
}

