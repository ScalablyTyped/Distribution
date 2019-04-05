package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectChangeSet extends js.Object {
  var changedProperties: js.Array[java.lang.String]
  var deleted: scala.Boolean
}

object ObjectChangeSet {
  @scala.inline
  def apply(changedProperties: js.Array[java.lang.String], deleted: scala.Boolean): ObjectChangeSet = {
    val __obj = js.Dynamic.literal(changedProperties = changedProperties, deleted = deleted)
  
    __obj.asInstanceOf[ObjectChangeSet]
  }
}

