package typings.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQEndIndex extends js.Object {
  var qEndIndex: Double
  var qStartIndex: Double
}

object AnonQEndIndex {
  @scala.inline
  def apply(qEndIndex: Double, qStartIndex: Double): AnonQEndIndex = {
    val __obj = js.Dynamic.literal(qEndIndex = qEndIndex.asInstanceOf[js.Any], qStartIndex = qStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQEndIndex]
  }
}

