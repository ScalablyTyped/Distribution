package typings.serialport.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var delimiter: String | Buffer | js.Array[Double]
}

object `0` {
  @scala.inline
  def apply(delimiter: String | Buffer | js.Array[Double]): `0` = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

