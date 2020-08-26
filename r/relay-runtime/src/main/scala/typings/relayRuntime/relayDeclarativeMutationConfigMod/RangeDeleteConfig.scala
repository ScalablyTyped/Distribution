package typings.relayRuntime.relayDeclarativeMutationConfigMod

import typings.relayRuntime.anon.Key
import typings.relayRuntime.relayRuntimeStrings.RANGE_DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeDeleteConfig extends DeclarativeMutationConfig {
  var connectionKeys: js.UndefOr[js.Array[Key]] = js.native
  var connectionName: js.UndefOr[String] = js.native
  var deletedIDFieldName: String | js.Array[String] = js.native
  var parentID: js.UndefOr[String] = js.native
  var parentName: js.UndefOr[String] = js.native
  var pathToConnection: js.Array[String] = js.native
  var `type`: RANGE_DELETE = js.native
}

object RangeDeleteConfig {
  @scala.inline
  def apply(
    deletedIDFieldName: String | js.Array[String],
    pathToConnection: js.Array[String],
    `type`: RANGE_DELETE
  ): RangeDeleteConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any], pathToConnection = pathToConnection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeDeleteConfig]
  }
  @scala.inline
  implicit class RangeDeleteConfigOps[Self <: RangeDeleteConfig] (val x: Self) extends AnyVal {
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
    def setDeletedIDFieldNameVarargs(value: String*): Self = this.set("deletedIDFieldName", js.Array(value :_*))
    @scala.inline
    def setDeletedIDFieldName(value: String | js.Array[String]): Self = this.set("deletedIDFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathToConnectionVarargs(value: String*): Self = this.set("pathToConnection", js.Array(value :_*))
    @scala.inline
    def setPathToConnection(value: js.Array[String]): Self = this.set("pathToConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RANGE_DELETE): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionKeysVarargs(value: Key*): Self = this.set("connectionKeys", js.Array(value :_*))
    @scala.inline
    def setConnectionKeys(value: js.Array[Key]): Self = this.set("connectionKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionKeys: Self = this.set("connectionKeys", js.undefined)
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

