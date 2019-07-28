package typings.realm.RealmNs.SyncNs

import typings.realm.Realm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocalRealm
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.LocalRealm.html }
  */
trait LocalRealm extends js.Object {
  val path: String
  def realm(): Realm
}

object LocalRealm {
  @scala.inline
  def apply(path: String, realm: () => Realm): LocalRealm = {
    val __obj = js.Dynamic.literal(path = path, realm = js.Any.fromFunction0(realm))
  
    __obj.asInstanceOf[LocalRealm]
  }
}

