package typings.qrcodeSvg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: String
  var mode: Double
  var parsedData: js.Array[Double]
}

object Data {
  @scala.inline
  def apply(data: String, mode: Double, parsedData: js.Array[Double]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parsedData = parsedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

