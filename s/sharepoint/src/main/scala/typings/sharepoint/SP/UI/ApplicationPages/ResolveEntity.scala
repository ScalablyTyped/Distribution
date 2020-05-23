package typings.sharepoint.SP.UI.ApplicationPages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveEntity extends js.Object {
  var accountName: String
  var displayName: String
  var email: String
  var entityType: String
  var id: String
  var isGroup: Boolean
  var members: js.Array[ResolveEntity]
  var needResolve: Boolean
  var tYPE_EVENT: String
  var tYPE_EXCHANGE: String
  var tYPE_RESOURCE: String
  var tYPE_USER: String
  def get_key(): String
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
}

