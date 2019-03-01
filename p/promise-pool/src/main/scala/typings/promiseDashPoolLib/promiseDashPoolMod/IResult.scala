package typings
package promiseDashPoolLib.promiseDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResult extends js.Object {
  var fulfilled: scala.Double
  var rejected: scala.Double
  var total: scala.Double
}

object IResult {
  @scala.inline
  def apply(fulfilled: scala.Double, rejected: scala.Double, total: scala.Double): IResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fulfilled")(fulfilled)
    __obj.updateDynamic("rejected")(rejected)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[IResult]
  }
}

