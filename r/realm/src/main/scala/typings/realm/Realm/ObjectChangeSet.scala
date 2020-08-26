package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectChangeSet extends js.Object {
  var changedProperties: js.Array[String] = js.native
  var deleted: Boolean = js.native
}

object ObjectChangeSet {
  @scala.inline
  def apply(changedProperties: js.Array[String], deleted: Boolean): ObjectChangeSet = {
    val __obj = js.Dynamic.literal(changedProperties = changedProperties.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectChangeSet]
  }
  @scala.inline
  implicit class ObjectChangeSetOps[Self <: ObjectChangeSet] (val x: Self) extends AnyVal {
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
    def setChangedPropertiesVarargs(value: String*): Self = this.set("changedProperties", js.Array(value :_*))
    @scala.inline
    def setChangedProperties(value: js.Array[String]): Self = this.set("changedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
  }
  
}

