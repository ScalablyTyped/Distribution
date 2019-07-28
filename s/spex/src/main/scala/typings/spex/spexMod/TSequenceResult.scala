package typings.spex.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSequenceResult extends js.Object {
  var duration: Double
  var total: Double
}

object TSequenceResult {
  @scala.inline
  def apply(duration: Double, total: Double): TSequenceResult = {
    val __obj = js.Dynamic.literal(duration = duration, total = total)
  
    __obj.asInstanceOf[TSequenceResult]
  }
}

