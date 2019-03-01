package typings
package reduxDashPersistLib.esIntegrationGetStoredStateMigrateV4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V4Config extends js.Object {
  var blacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var keyPrefix: js.UndefOr[java.lang.String] = js.undefined
  var storage: js.UndefOr[js.Any] = js.undefined
  var transforms: js.UndefOr[js.Array[reduxDashPersistLib.esCreateTransformMod.Transform[_, _]]] = js.undefined
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object V4Config {
  @scala.inline
  def apply(
    blacklist: js.Array[java.lang.String] = null,
    keyPrefix: java.lang.String = null,
    storage: js.Any = null,
    transforms: js.Array[reduxDashPersistLib.esCreateTransformMod.Transform[_, _]] = null,
    whitelist: js.Array[java.lang.String] = null
  ): V4Config = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[V4Config]
  }
}

