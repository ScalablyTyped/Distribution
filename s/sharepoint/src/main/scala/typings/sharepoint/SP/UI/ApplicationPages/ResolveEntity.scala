package typings.sharepoint.SP.UI.ApplicationPages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveEntity extends js.Object {
  var accountName: String = js.native
  var displayName: String = js.native
  var email: String = js.native
  var entityType: String = js.native
  var id: String = js.native
  var isGroup: Boolean = js.native
  var members: js.Array[ResolveEntity] = js.native
  var needResolve: Boolean = js.native
  var tYPE_EVENT: String = js.native
  var tYPE_EXCHANGE: String = js.native
  var tYPE_RESOURCE: String = js.native
  var tYPE_USER: String = js.native
  def get_key(): String = js.native
}

object ResolveEntity {
  @scala.inline
  def apply(
    accountName: String,
    displayName: String,
    email: String,
    entityType: String,
    get_key: () => String,
    id: String,
    isGroup: Boolean,
    members: js.Array[ResolveEntity],
    needResolve: Boolean,
    tYPE_EVENT: String,
    tYPE_EXCHANGE: String,
    tYPE_RESOURCE: String,
    tYPE_USER: String
  ): ResolveEntity = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], get_key = js.Any.fromFunction0(get_key), id = id.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], needResolve = needResolve.asInstanceOf[js.Any], tYPE_EVENT = tYPE_EVENT.asInstanceOf[js.Any], tYPE_EXCHANGE = tYPE_EXCHANGE.asInstanceOf[js.Any], tYPE_RESOURCE = tYPE_RESOURCE.asInstanceOf[js.Any], tYPE_USER = tYPE_USER.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveEntity]
  }
  @scala.inline
  implicit class ResolveEntityOps[Self <: ResolveEntity] (val x: Self) extends AnyVal {
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityType(value: String): Self = this.set("entityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet_key(value: () => String): Self = this.set("get_key", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGroup(value: Boolean): Self = this.set("isGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setMembersVarargs(value: ResolveEntity*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[ResolveEntity]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedResolve(value: Boolean): Self = this.set("needResolve", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE_EVENT(value: String): Self = this.set("tYPE_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE_EXCHANGE(value: String): Self = this.set("tYPE_EXCHANGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE_RESOURCE(value: String): Self = this.set("tYPE_RESOURCE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE_USER(value: String): Self = this.set("tYPE_USER", value.asInstanceOf[js.Any])
  }
  
}

