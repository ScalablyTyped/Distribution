package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectChanges extends js.Object {
  var deletions: js.Array[Object] = js.native
  var insertions: js.Array[Object] = js.native
  var newModifications: js.Array[Object] = js.native
  var oldModifications: js.Array[Object] = js.native
}

object ObjectChanges {
  @scala.inline
  def apply(
    deletions: js.Array[Object],
    insertions: js.Array[Object],
    newModifications: js.Array[Object],
    oldModifications: js.Array[Object]
  ): ObjectChanges = {
    val __obj = js.Dynamic.literal(deletions = deletions.asInstanceOf[js.Any], insertions = insertions.asInstanceOf[js.Any], newModifications = newModifications.asInstanceOf[js.Any], oldModifications = oldModifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectChanges]
  }
  @scala.inline
  implicit class ObjectChangesOps[Self <: ObjectChanges] (val x: Self) extends AnyVal {
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
    def setDeletionsVarargs(value: Object*): Self = this.set("deletions", js.Array(value :_*))
    @scala.inline
    def setDeletions(value: js.Array[Object]): Self = this.set("deletions", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertionsVarargs(value: Object*): Self = this.set("insertions", js.Array(value :_*))
    @scala.inline
    def setInsertions(value: js.Array[Object]): Self = this.set("insertions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewModificationsVarargs(value: Object*): Self = this.set("newModifications", js.Array(value :_*))
    @scala.inline
    def setNewModifications(value: js.Array[Object]): Self = this.set("newModifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldModificationsVarargs(value: Object*): Self = this.set("oldModifications", js.Array(value :_*))
    @scala.inline
    def setOldModifications(value: js.Array[Object]): Self = this.set("oldModifications", value.asInstanceOf[js.Any])
  }
  
}

