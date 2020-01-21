package typings.reactImageMagnify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Double | String
  var width: Double | String
}

object AnonHeight {
  @scala.inline
  def apply(height: Double | String, width: Double | String): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeight]
  }
}

