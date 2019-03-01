package typings
package qunitLib.QUnitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginDetails extends js.Object {
  var totalTests: scala.Double
}

object BeginDetails {
  @scala.inline
  def apply(totalTests: scala.Double): BeginDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("totalTests")(totalTests)
    __obj.asInstanceOf[BeginDetails]
  }
}

