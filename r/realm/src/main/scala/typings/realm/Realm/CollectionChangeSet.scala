package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionChangeSet extends js.Object {
  var deletions: js.Array[Double] = js.native
  var insertions: js.Array[Double] = js.native
  var modifications: js.Array[Double] = js.native
  var newModifications: js.Array[Double] = js.native
  var oldModifications: js.Array[Double] = js.native
}

object CollectionChangeSet {
  @scala.inline
  def apply(
    deletions: js.Array[Double],
    insertions: js.Array[Double],
    modifications: js.Array[Double],
    newModifications: js.Array[Double],
    oldModifications: js.Array[Double]
  ): CollectionChangeSet = {
    val __obj = js.Dynamic.literal(deletions = deletions.asInstanceOf[js.Any], insertions = insertions.asInstanceOf[js.Any], modifications = modifications.asInstanceOf[js.Any], newModifications = newModifications.asInstanceOf[js.Any], oldModifications = oldModifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChangeSet]
  }
  @scala.inline
  implicit class CollectionChangeSetOps[Self <: CollectionChangeSet] (val x: Self) extends AnyVal {
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
    def setDeletionsVarargs(value: Double*): Self = this.set("deletions", js.Array(value :_*))
    @scala.inline
    def setDeletions(value: js.Array[Double]): Self = this.set("deletions", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertionsVarargs(value: Double*): Self = this.set("insertions", js.Array(value :_*))
    @scala.inline
    def setInsertions(value: js.Array[Double]): Self = this.set("insertions", value.asInstanceOf[js.Any])
    @scala.inline
    def setModificationsVarargs(value: Double*): Self = this.set("modifications", js.Array(value :_*))
    @scala.inline
    def setModifications(value: js.Array[Double]): Self = this.set("modifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewModificationsVarargs(value: Double*): Self = this.set("newModifications", js.Array(value :_*))
    @scala.inline
    def setNewModifications(value: js.Array[Double]): Self = this.set("newModifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldModificationsVarargs(value: Double*): Self = this.set("oldModifications", js.Array(value :_*))
    @scala.inline
    def setOldModifications(value: js.Array[Double]): Self = this.set("oldModifications", value.asInstanceOf[js.Any])
  }
  
}

