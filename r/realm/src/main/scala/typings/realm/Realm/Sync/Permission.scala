package typings.realm.Realm.Sync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  val id: String = js.native
  val mayManage: js.UndefOr[Boolean] = js.native
  val mayRead: js.UndefOr[Boolean] = js.native
  val mayWrite: js.UndefOr[Boolean] = js.native
  val path: String = js.native
  val updatedAt: Date = js.native
  val userId: String = js.native
}

object Permission {
  @scala.inline
  def apply(id: String, path: String, updatedAt: Date, userId: String): Permission = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: Date): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
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
  }
  
}

