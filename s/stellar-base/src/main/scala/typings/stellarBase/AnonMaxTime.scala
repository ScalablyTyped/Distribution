package typings.stellarBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxTime extends js.Object {
  var maxTime: String
  var minTime: String
}

object AnonMaxTime {
  @scala.inline
  def apply(maxTime: String, minTime: String): AnonMaxTime = {
    val __obj = js.Dynamic.literal(maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaxTime]
  }
}

