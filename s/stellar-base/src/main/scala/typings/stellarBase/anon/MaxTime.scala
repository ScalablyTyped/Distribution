package typings.stellarBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxTime extends js.Object {
  var maxTime: String
  var minTime: String
}

object MaxTime {
  @scala.inline
  def apply(maxTime: String, minTime: String): MaxTime = {
    val __obj = js.Dynamic.literal(maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxTime]
  }
}

