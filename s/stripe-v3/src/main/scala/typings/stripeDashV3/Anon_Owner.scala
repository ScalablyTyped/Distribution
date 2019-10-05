package typings.stripeDashV3

import typings.stripeDashV3.stripe.OwnerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Owner extends js.Object {
  var owner: js.UndefOr[OwnerInfo] = js.undefined
}

object Anon_Owner {
  @scala.inline
  def apply(owner: OwnerInfo = null): Anon_Owner = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[Anon_Owner]
  }
}

