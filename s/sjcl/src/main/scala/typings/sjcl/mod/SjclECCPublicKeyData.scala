package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclECCPublicKeyData extends js.Object {
  var x: BitArray_
  var y: BitArray_
}

object SjclECCPublicKeyData {
  @scala.inline
  def apply(x: BitArray_, y: BitArray_): SjclECCPublicKeyData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SjclECCPublicKeyData]
  }
}

