package typings.reactRnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeightWidth extends js.Object {
  var height: Double | String
  var width: Double | String
}

object AnonHeightWidth {
  @scala.inline
  def apply(height: Double | String, width: Double | String): AnonHeightWidth = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightWidth]
  }
}

