package typings.realm.Realm.Sync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionOffer extends js.Object {
  var createdAt: Date = js.native
  var expiresAt: js.UndefOr[Date] = js.native
  var id: String = js.native
  var mayManage: js.UndefOr[Boolean] = js.native
  var mayRead: js.UndefOr[Boolean] = js.native
  var mayWrite: js.UndefOr[Boolean] = js.native
  var realmUrl: String = js.native
  var statusCode: js.UndefOr[Double] = js.native
  var statusMessage: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
  var updatedAt: Date = js.native
}

object PermissionOffer {
  @scala.inline
  def apply(createdAt: Date, id: String, realmUrl: String, updatedAt: Date): PermissionOffer = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], realmUrl = realmUrl.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionOffer]
  }
  @scala.inline
  implicit class PermissionOfferOps[Self <: PermissionOffer] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealmUrl(value: String): Self = this.set("realmUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: Date): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiresAt(value: Date): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresAt: Self = this.set("expiresAt", js.undefined)
    @scala.inline
    def setMayManage(value: Boolean): Self = this.set("mayManage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMayManage: Self = this.set("mayManage", js.undefined)
    @scala.inline
    def setMayRead(value: Boolean): Self = this.set("mayRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMayRead: Self = this.set("mayRead", js.undefined)
    @scala.inline
    def setMayWrite(value: Boolean): Self = this.set("mayWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMayWrite: Self = this.set("mayWrite", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

