package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionConditionMetadata extends PermissionCondition {
  var metadataKey: String
  var metadataValue: String
}

object PermissionConditionMetadata {
  @scala.inline
  def apply(metadataKey: String, metadataValue: String): PermissionConditionMetadata = {
    val __obj = js.Dynamic.literal(metadataKey = metadataKey.asInstanceOf[js.Any], metadataValue = metadataValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionConditionMetadata]
  }
}

