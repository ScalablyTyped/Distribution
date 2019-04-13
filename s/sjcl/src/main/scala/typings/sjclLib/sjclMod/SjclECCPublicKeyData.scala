package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclECCPublicKeyData extends js.Object {
  var x: BitArray
  var y: BitArray
}

object SjclECCPublicKeyData {
  @scala.inline
  def apply(x: BitArray, y: BitArray): SjclECCPublicKeyData = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[SjclECCPublicKeyData]
  }
}

