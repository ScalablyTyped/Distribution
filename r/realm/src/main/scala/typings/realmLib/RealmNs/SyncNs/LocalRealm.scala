package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocalRealm
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.LocalRealm.html }
  */
trait LocalRealm extends js.Object {
  val path: java.lang.String
  def realm(): realmLib.Realm
}

object LocalRealm {
  @scala.inline
  def apply(path: java.lang.String, realm: () => realmLib.Realm): LocalRealm = {
    val __obj = js.Dynamic.literal(path = path, realm = js.Any.fromFunction0(realm))
  
    __obj.asInstanceOf[LocalRealm]
  }
}

