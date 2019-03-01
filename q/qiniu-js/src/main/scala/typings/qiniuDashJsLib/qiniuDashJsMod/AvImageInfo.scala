package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvImageInfo extends js.Object {
  var colorModel: java.lang.String
  var format: java.lang.String
  var height: scala.Double
  var width: scala.Double
}

object AvImageInfo {
  @scala.inline
  def apply(colorModel: java.lang.String, format: java.lang.String, height: scala.Double, width: scala.Double): AvImageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colorModel")(colorModel)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[AvImageInfo]
  }
}

