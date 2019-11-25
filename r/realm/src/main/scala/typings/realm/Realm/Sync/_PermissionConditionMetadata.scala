package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PermissionConditionMetadata extends PermissionCondition {
  var metadataKey: String
  var metadataValue: String
}

object _PermissionConditionMetadata {
  @scala.inline
  def apply(metadataKey: String, metadataValue: String): _PermissionConditionMetadata = {
    val __obj = js.Dynamic.literal(metadataKey = metadataKey.asInstanceOf[js.Any], metadataValue = metadataValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_PermissionConditionMetadata]
  }
}

