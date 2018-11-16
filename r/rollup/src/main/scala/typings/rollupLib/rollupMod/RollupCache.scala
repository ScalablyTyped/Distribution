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

