package typings.reactRelay.mod

import typings.reactRelay.reactRelayStrings.`network-only`
import typings.reactRelay.reactRelayStrings.`store-or-network`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefetchOptions extends js.Object {
  var fetchPolicy: js.UndefOr[`store-or-network` | `network-only`] = js.native
  var force: js.UndefOr[Boolean] = js.native
}

object RefetchOptions {
  @scala.inline
  def apply(): RefetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefetchOptions]
  }
  @scala.inline
  implicit class RefetchOptionsOps[Self <: RefetchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetchPolicy(value: `store-or-network` | `network-only`): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
  }
  
}

