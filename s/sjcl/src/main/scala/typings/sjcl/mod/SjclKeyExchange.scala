package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclKeyExchange extends js.Object {
  var srp: SjclSecureRemotePassword
}

object SjclKeyExchange {
  @scala.inline
  def apply(srp: SjclSecureRemotePassword): SjclKeyExchange = {
    val __obj = js.Dynamic.literal(srp = srp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SjclKeyExchange]
  }
}

