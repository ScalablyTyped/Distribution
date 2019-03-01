package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Owner extends js.Object {
  var owner: js.UndefOr[stripeDashV3Lib.stripeNs.OwnerInfo] = js.undefined
}

object Anon_Owner {
  @scala.inline
  def apply(owner: stripeDashV3Lib.stripeNs.OwnerInfo = null): Anon_Owner = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[Anon_Owner]
  }
}

