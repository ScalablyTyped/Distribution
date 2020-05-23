package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QEndIndex extends js.Object {
  var qEndIndex: Double
  var qStartIndex: Double
}

object QEndIndex {
  @scala.inline
  def apply(qEndIndex: Double, qStartIndex: Double): QEndIndex = {
    val __obj = js.Dynamic.literal(qEndIndex = qEndIndex.asInstanceOf[js.Any], qStartIndex = qStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QEndIndex]
  }
}

