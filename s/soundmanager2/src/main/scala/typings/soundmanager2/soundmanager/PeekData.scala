package typings.soundmanager2.soundmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeekData extends js.Object {
  var left: Double
  var right: Double
}

object PeekData {
  @scala.inline
  def apply(left: Double, right: Double): PeekData = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PeekData]
  }
}

