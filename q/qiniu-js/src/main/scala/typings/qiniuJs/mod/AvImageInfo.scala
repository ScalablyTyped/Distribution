package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvImageInfo extends js.Object {
  var colorModel: String
  var format: String
  var height: Double
  var width: Double
}

object AvImageInfo {
  @scala.inline
  def apply(colorModel: String, format: String, height: Double, width: Double): AvImageInfo = {
    val __obj = js.Dynamic.literal(colorModel = colorModel.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AvImageInfo]
  }
}

