package typings
package sparkDashMd5Lib.sparkDashMd5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var buff: stdLib.Uint8Array
  var hash: js.Array[scala.Double]
  var length: scala.Double
}

object State {
  @scala.inline
  def apply(buff: stdLib.Uint8Array, hash: js.Array[scala.Double], length: scala.Double): State = {
    val __obj = js.Dynamic.literal(buff = buff, hash = hash, length = length)
  
    __obj.asInstanceOf[State]
  }
}

