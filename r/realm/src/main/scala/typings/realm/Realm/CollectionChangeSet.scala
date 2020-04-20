package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionChangeSet extends js.Object {
  var deletions: js.Array[Double]
  var insertions: js.Array[Double]
  var modifications: js.Array[Double]
  var newModifications: js.Array[Double]
  var oldModifications: js.Array[Double]
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
}

