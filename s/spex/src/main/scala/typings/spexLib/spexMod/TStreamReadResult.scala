package typings
package spexLib.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TStreamReadResult extends js.Object {
  var calls: scala.Double
  var duration: scala.Double
  var length: scala.Double
  var reads: scala.Double
}

object TStreamReadResult {
  @scala.inline
  def apply(calls: scala.Double, duration: scala.Double, length: scala.Double, reads: scala.Double): TStreamReadResult = {
    val __obj = js.Dynamic.literal(calls = calls, duration = duration, length = length, reads = reads)
  
    __obj.asInstanceOf[TStreamReadResult]
  }
}

