package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclECCPublicKey extends js.Object {
  def get(): SjclECCPublicKeyData
}

object SjclECCPublicKey {
  @scala.inline
  def apply(get: js.Function0[SjclECCPublicKeyData]): SjclECCPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[SjclECCPublicKey]
  }
}

