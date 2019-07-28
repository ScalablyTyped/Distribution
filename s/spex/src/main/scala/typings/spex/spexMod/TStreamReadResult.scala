package typings.spex.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TStreamReadResult extends js.Object {
  var calls: Double
  var duration: Double
  var length: Double
  var reads: Double
}

object TStreamReadResult {
  @scala.inline
  def apply(calls: Double, duration: Double, length: Double, reads: Double): TStreamReadResult = {
    val __obj = js.Dynamic.literal(calls = calls, duration = duration, length = length, reads = reads)
  
    __obj.asInstanceOf[TStreamReadResult]
  }
}

