package typings.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISequenceResult extends js.Object {
  var duration: Double
  var total: Double
}

object ISequenceResult {
  @scala.inline
  def apply(duration: Double, total: Double): ISequenceResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISequenceResult]
  }
}

