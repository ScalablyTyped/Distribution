package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclECCKeyPairData extends js.Object {
  var curve: String
  var point: String
  var secretKey: Boolean
  var `type`: String
}

object SjclECCKeyPairData {
  @scala.inline
  def apply(curve: String, point: String, secretKey: Boolean, `type`: String): SjclECCKeyPairData = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECCKeyPairData]
  }
}

