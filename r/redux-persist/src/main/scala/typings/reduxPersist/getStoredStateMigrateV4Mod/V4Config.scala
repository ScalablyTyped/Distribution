package typings.reduxPersist.getStoredStateMigrateV4Mod

import typings.reduxPersist.typesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V4Config extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var keyPrefix: js.UndefOr[String] = js.undefined
  var storage: js.UndefOr[V4Storage] = js.undefined
  var transforms: js.UndefOr[js.Array[Transform[_, _, _, _]]] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object V4Config {
  @scala.inline
  def apply(
    blacklist: js.Array[String] = null,
    keyPrefix: String = null,
    storage: V4Storage = null,
    transforms: js.Array[Transform[_, _, _, _]] = null,
    whitelist: js.Array[String] = null
  ): V4Config = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[V4Config]
  }
}

