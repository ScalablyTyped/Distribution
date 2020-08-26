package typings.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import typings.realm.Realm
import typings.realm.Realm.ObjectChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ChangeEvent
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.ChangeEvent.html }
  */
@js.native
trait ChangeEvent extends js.Object {
  val changes: StringDictionary[ObjectChanges] = js.native
  val oldRealm: Realm = js.native
  val path: String = js.native
  val realm: Realm = js.native
}

object ChangeEvent {
  @scala.inline
  def apply(changes: StringDictionary[ObjectChanges], oldRealm: Realm, path: String, realm: Realm): ChangeEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], oldRealm = oldRealm.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  @scala.inline
  implicit class ChangeEventOps[Self <: ChangeEvent] (val x: Self) extends AnyVal {
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
    def setChanges(value: StringDictionary[ObjectChanges]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldRealm(value: Realm): Self = this.set("oldRealm", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealm(value: Realm): Self = this.set("realm", value.asInstanceOf[js.Any])
  }
  
}

