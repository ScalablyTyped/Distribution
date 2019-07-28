package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.Anon_FiltersKey
import typings.relayDashRuntime.relayDashRuntimeStrings.RANGE_DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeDeleteConfig extends DeclarativeMutationConfig {
  var connectionKeys: js.UndefOr[js.Array[Anon_FiltersKey]] = js.undefined
  var connectionName: js.UndefOr[String] = js.undefined
  var deletedIDFieldName: String | js.Array[String]
  var parentID: js.UndefOr[String] = js.undefined
  var parentName: js.UndefOr[String] = js.undefined
  var pathToConnection: js.Array[String]
  var `type`: RANGE_DELETE
}

object RangeDeleteConfig {
  @scala.inline
  def apply(
    deletedIDFieldName: String | js.Array[String],
    pathToConnection: js.Array[String],
    `type`: RANGE_DELETE,
    connectionKeys: js.Array[Anon_FiltersKey] = null,
    connectionName: String = null,
    parentID: String = null,
    parentName: String = null
  ): RangeDeleteConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any], pathToConnection = pathToConnection)
    __obj.updateDynamic("type")(`type`)
    if (connectionKeys != null) __obj.updateDynamic("connectionKeys")(connectionKeys)
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName)
    if (parentID != null) __obj.updateDynamic("parentID")(parentID)
    if (parentName != null) __obj.updateDynamic("parentName")(parentName)
    __obj.asInstanceOf[RangeDeleteConfig]
  }
}

