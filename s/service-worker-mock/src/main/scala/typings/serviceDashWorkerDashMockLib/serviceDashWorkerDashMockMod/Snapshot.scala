package typings
package serviceDashWorkerDashMockLib.serviceDashWorkerDashMockMod

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
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Client */ _
  ]
  /**
    * A list of active notifications.
    */
  var notifications: js.Array[stdLib.Notification]
}

object Snapshot {
  @scala.inline
  def apply(
    caches: Caches,
    clients: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Client */ _
    ],
    notifications: js.Array[stdLib.Notification]
  ): Snapshot = {
    val __obj = js.Dynamic.literal(caches = caches, clients = clients, notifications = notifications)
  
    __obj.asInstanceOf[Snapshot]
  }
}

