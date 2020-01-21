package typings.reactRnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeightWidthNumber extends js.Object {
  var height: Double | String
  var width: Double | String
}

object AnonHeightWidthNumber {
  @scala.inline
  def apply(height: Double | String, width: Double | String): AnonHeightWidthNumber = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeightWidthNumber]
  }
}

