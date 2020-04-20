package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxGroupTail extends js.Object {
  var qDown: Double
  var qUp: Double
}

object NxGroupTail {
  @scala.inline
  def apply(qDown: Double, qUp: Double): NxGroupTail = {
    val __obj = js.Dynamic.literal(qDown = qDown.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxGroupTail]
  }
}

