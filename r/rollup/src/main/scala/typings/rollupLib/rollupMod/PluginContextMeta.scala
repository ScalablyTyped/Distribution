package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginContextMeta extends js.Object {
  var rollupVersion: java.lang.String
}

object PluginContextMeta {
  @scala.inline
  def apply(rollupVersion: java.lang.String): PluginContextMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rollupVersion")(rollupVersion)
    __obj.asInstanceOf[PluginContextMeta]
  }
}

