package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclKeyExchange extends js.Object {
  var srp: SecureRemotePassword
}

object SjclKeyExchange {
  @scala.inline
  def apply(srp: SecureRemotePassword): SjclKeyExchange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("srp")(srp)
    __obj.asInstanceOf[SjclKeyExchange]
  }
}

