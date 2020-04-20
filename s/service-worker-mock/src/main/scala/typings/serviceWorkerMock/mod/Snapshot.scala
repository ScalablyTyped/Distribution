package typings.serviceWorkerMock.mod

import typings.std.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  /**
    * A key/value map of current cache contents.
    */
  var caches: Caches
  /**
    * A list of active clients.
    */
  var clients: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ _
  ]
  /**
    * A list of active notifications.
    */
  var notifications: js.Array[Notification]
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
}

