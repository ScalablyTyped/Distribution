package typings.qrcodeSvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: String
  var mode: Double
  var parsedData: js.Array[Double]
}

object AnonData {
  @scala.inline
  def apply(data: String, mode: Double, parsedData: js.Array[Double]): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parsedData = parsedData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

