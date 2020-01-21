package typings.simplSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndPointsOnly extends js.Object {
  var endPointsOnly: Boolean
}

object AnonEndPointsOnly {
  @scala.inline
  def apply(endPointsOnly: Boolean): AnonEndPointsOnly = {
    val __obj = js.Dynamic.literal(endPointsOnly = endPointsOnly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndPointsOnly]
  }
}

