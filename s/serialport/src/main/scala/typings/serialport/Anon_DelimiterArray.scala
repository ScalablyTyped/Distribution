package typings.serialport

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelimiterArray extends js.Object {
  var delimiter: String | Buffer | js.Array[Double]
}

object Anon_DelimiterArray {
  @scala.inline
  def apply(delimiter: String | Buffer | js.Array[Double]): Anon_DelimiterArray = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DelimiterArray]
  }
}

