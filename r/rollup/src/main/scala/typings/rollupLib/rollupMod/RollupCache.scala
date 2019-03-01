package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupCache extends js.Object {
  // to be deprecated
  var modules: js.UndefOr[js.Array[ModuleJSON]] = js.undefined
  var plugins: js.UndefOr[stdLib.Record[java.lang.String, SerializablePluginCache]] = js.undefined
}

object RollupCache {
  @scala.inline
  def apply(
    modules: js.Array[ModuleJSON] = null,
    plugins: stdLib.Record[java.lang.String, SerializablePluginCache] = null
  ): RollupCache = {
    val __obj = js.Dynamic.literal()
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[RollupCache]
  }
}

