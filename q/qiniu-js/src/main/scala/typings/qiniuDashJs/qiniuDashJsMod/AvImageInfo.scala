package typings.qiniuDashJs.qiniuDashJsMod

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
    val __obj = js.Dynamic.literal(colorModel = colorModel, format = format, height = height, width = width)
  
    __obj.asInstanceOf[AvImageInfo]
  }
}

