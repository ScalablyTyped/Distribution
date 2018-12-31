package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ChangeEvent
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.ChangeEvent.html }
  */
trait ChangeEvent extends js.Object {
  val changes: org.scalablytyped.runtime.StringDictionary[realmLib.RealmNs.CollectionChangeSet]
  val oldRealm: realmLib.Realm
  val path: java.lang.String
  val realm: realmLib.Realm
}

