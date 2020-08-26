package typings.realm.Realm.Sync

import typings.realm.Realm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocalRealm
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.LocalRealm.html }
  */
@js.native
trait LocalRealm extends js.Object {
  val path: String = js.native
  def realm(): Realm = js.native
}

object LocalRealm {
  @scala.inline
  def apply(path: String, realm: () => Realm): LocalRealm = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], realm = js.Any.fromFunction0(realm))
    __obj.asInstanceOf[LocalRealm]
  }
  @scala.inline
  implicit class LocalRealmOps[Self <: LocalRealm] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealm(value: () => Realm): Self = this.set("realm", js.Any.fromFunction0(value))
  }
  
}

