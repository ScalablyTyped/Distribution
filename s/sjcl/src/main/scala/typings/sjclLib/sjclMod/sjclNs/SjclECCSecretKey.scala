package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclECCSecretKey extends js.Object {
  def get(): BitArray
}

object SjclECCSecretKey {
  @scala.inline
  def apply(get: js.Function0[BitArray]): SjclECCSecretKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[SjclECCSecretKey]
  }
}

