package typings.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamReadResult extends js.Object {
  var calls: Double
  var duration: Double
  var length: Double
  var reads: Double
}

object IStreamReadResult {
  @scala.inline
  def apply(calls: Double, duration: Double, length: Double, reads: Double): IStreamReadResult = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamReadResult]
  }
}

