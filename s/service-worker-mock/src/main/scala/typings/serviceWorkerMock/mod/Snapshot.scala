package typings.serviceWorkerMock.mod

import typings.std.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snapshot extends js.Object {
  /**
    * A key/value map of current cache contents.
    */
  var caches: Caches = js.native
  /**
    * A list of active clients.
    */
  var clients: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ _
  ] = js.native
  /**
    * A list of active notifications.
    */
  var notifications: js.Array[Notification] = js.native
}

object Snapshot {
  @scala.inline
  def apply(
    caches: Caches,
    clients: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ _
    ],
    notifications: js.Array[Notification]
  ): Snapshot = {
    val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any], clients = clients.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
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
    def setCaches(value: Caches): Self = this.set("caches", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientsVarargs(value: js.Any*): Self = this.set("clients", js.Array(value :_*))
    @scala.inline
    def setClients(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ _
        ]
    ): Self = this.set("clients", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = this.set("notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
  }
  
}

