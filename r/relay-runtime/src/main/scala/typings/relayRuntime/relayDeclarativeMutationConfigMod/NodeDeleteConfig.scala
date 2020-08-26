package typings.relayRuntime.relayDeclarativeMutationConfigMod

import typings.relayRuntime.relayRuntimeStrings.NODE_DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeDeleteConfig extends DeclarativeMutationConfig {
  var connectionName: js.UndefOr[String] = js.native
  var deletedIDFieldName: String = js.native
  var parentID: js.UndefOr[String] = js.native
  var parentName: js.UndefOr[String] = js.native
  var `type`: NODE_DELETE = js.native
}

object NodeDeleteConfig {
  @scala.inline
  def apply(deletedIDFieldName: String, `type`: NODE_DELETE): NodeDeleteConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDeleteConfig]
  }
  @scala.inline
  implicit class NodeDeleteConfigOps[Self <: NodeDeleteConfig] (val x: Self) extends AnyVal {
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
    def setDeletedIDFieldName(value: String): Self = this.set("deletedIDFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NODE_DELETE): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionName(value: String): Self = this.set("connectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionName: Self = this.set("connectionName", js.undefined)
    @scala.inline
    def setParentID(value: String): Self = this.set("parentID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentID: Self = this.set("parentID", js.undefined)
    @scala.inline
    def setParentName(value: String): Self = this.set("parentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentName: Self = this.set("parentName", js.undefined)
  }
  
}

