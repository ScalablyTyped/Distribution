package typings.serialport

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var delimiter: String | Buffer | js.Array[Double]
}

object Anon0 {
  @scala.inline
  def apply(delimiter: String | Buffer | js.Array[Double]): Anon0 = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0]
  }
}

