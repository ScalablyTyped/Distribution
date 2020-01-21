package typings.serialport

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelimiterArray extends js.Object {
  var delimiter: String | Buffer | js.Array[Double]
}

object AnonDelimiterArray {
  @scala.inline
  def apply(delimiter: String | Buffer | js.Array[Double]): AnonDelimiterArray = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDelimiterArray]
  }
}

