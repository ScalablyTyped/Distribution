package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionConditionMetadata extends PermissionCondition {
  var metadataKey: String = js.native
  var metadataValue: String = js.native
}

object PermissionConditionMetadata {
  @scala.inline
  def apply(metadataKey: String, metadataValue: String): PermissionConditionMetadata = {
    val __obj = js.Dynamic.literal(metadataKey = metadataKey.asInstanceOf[js.Any], metadataValue = metadataValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionConditionMetadata]
  }
  @scala.inline
  implicit class PermissionConditionMetadataOps[Self <: PermissionConditionMetadata] (val x: Self) extends AnyVal {
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
    def setMetadataKey(value: String): Self = this.set("metadataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataValue(value: String): Self = this.set("metadataValue", value.asInstanceOf[js.Any])
  }
  
}

