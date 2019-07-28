package typings.qrcodeDashSvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: String
  var mode: Double
  var parsedData: js.Array[Double]
}

object Anon_Data {
  @scala.inline
  def apply(data: String, mode: Double, parsedData: js.Array[Double]): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, mode = mode, parsedData = parsedData)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

