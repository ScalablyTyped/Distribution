package typings.sjcl.sjclMod

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
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SjclECCPublicKeyData]
  }
}

