package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync.addListener")
@js.native
object addListener extends js.Object {
  def apply(
    config: RealmListenerConfiguration,
    eventName: RealmListenerEventName,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, js.Promise[Unit] | Unit]
  ): Unit = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def apply(
    serverURL: String,
    adminUser: User,
    regex: String,
    name: RealmListenerEventName,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, js.Promise[Unit] | Unit]
  ): Unit = js.native
}

