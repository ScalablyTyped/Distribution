package typings
package qunitLib.QUnitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneDetails extends js.Object {
  var failed: scala.Double
  var passed: scala.Double
  var runtime: scala.Double
  var total: scala.Double
}

object DoneDetails {
  @scala.inline
  def apply(failed: scala.Double, passed: scala.Double, runtime: scala.Double, total: scala.Double): DoneDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("passed")(passed)
    __obj.updateDynamic("runtime")(runtime)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[DoneDetails]
  }
}

