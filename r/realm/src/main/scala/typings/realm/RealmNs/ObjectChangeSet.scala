package typings.realm.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectChangeSet extends js.Object {
  var changedProperties: js.Array[String]
  var deleted: Boolean
}

object ObjectChangeSet {
  @scala.inline
  def apply(changedProperties: js.Array[String], deleted: Boolean): ObjectChangeSet = {
    val __obj = js.Dynamic.literal(changedProperties = changedProperties, deleted = deleted)
  
    __obj.asInstanceOf[ObjectChangeSet]
  }
}

