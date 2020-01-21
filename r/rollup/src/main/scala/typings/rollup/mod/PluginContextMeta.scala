package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginContextMeta extends js.Object {
  var rollupVersion: String
}

object PluginContextMeta {
  @scala.inline
  def apply(rollupVersion: String): PluginContextMeta = {
    val __obj = js.Dynamic.literal(rollupVersion = rollupVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginContextMeta]
  }
}

