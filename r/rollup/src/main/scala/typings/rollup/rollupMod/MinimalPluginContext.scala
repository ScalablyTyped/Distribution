package typings.rollup.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimalPluginContext extends js.Object {
  var meta: PluginContextMeta
}

object MinimalPluginContext {
  @scala.inline
  def apply(meta: PluginContextMeta): MinimalPluginContext = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MinimalPluginContext]
  }
}

