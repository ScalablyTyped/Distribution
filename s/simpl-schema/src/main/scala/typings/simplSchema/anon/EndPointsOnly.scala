package typings.simplSchema.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndPointsOnly extends js.Object {
  var endPointsOnly: Boolean
}

object EndPointsOnly {
  @scala.inline
  def apply(endPointsOnly: Boolean): EndPointsOnly = {
    val __obj = js.Dynamic.literal(endPointsOnly = endPointsOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPointsOnly]
  }
}

