package typings.sparkMd5.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var buff: Uint8Array
  var hash: js.Array[Double]
  var length: Double
}

object State {
  @scala.inline
  def apply(buff: Uint8Array, hash: js.Array[Double], length: Double): State = {
    val __obj = js.Dynamic.literal(buff = buff.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

