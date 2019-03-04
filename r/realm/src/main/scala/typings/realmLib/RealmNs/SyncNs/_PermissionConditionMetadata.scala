package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PermissionConditionMetadata extends PermissionCondition {
  var metadataKey: java.lang.String
  var metadataValue: java.lang.String
}

object _PermissionConditionMetadata {
  @scala.inline
  def apply(metadataKey: java.lang.String, metadataValue: java.lang.String): _PermissionConditionMetadata = {
    val __obj = js.Dynamic.literal(metadataKey = metadataKey, metadataValue = metadataValue)
  
    __obj.asInstanceOf[_PermissionConditionMetadata]
  }
}

