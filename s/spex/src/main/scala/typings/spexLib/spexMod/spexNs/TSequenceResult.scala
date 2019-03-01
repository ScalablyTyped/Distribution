package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSequenceResult extends js.Object {
  var duration: scala.Double
  var total: scala.Double
}

object TSequenceResult {
  @scala.inline
  def apply(duration: scala.Double, total: scala.Double): TSequenceResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[TSequenceResult]
  }
}

