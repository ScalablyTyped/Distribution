package typings.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: String
  var height: Double
  var width: Double
}

object AnonFormat {
  @scala.inline
  def apply(format: String, height: Double, width: Double): AnonFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}

