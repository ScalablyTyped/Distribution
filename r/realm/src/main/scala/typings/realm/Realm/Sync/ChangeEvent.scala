package typings.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import typings.realm.Realm
import typings.realm.Realm.CollectionChangeSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ChangeEvent
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.ChangeEvent.html }
  */
trait ChangeEvent extends js.Object {
  val changes: StringDictionary[CollectionChangeSet]
  val oldRealm: Realm
  val path: String
  val realm: Realm
}

object ChangeEvent {
  @scala.inline
  def apply(changes: StringDictionary[CollectionChangeSet], oldRealm: Realm, path: String, realm: Realm): ChangeEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], oldRealm = oldRealm.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
}

