package typings.ractive.mod

import typings.ractive.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginArgsBase extends js.Object {
  var Ractive: Instantiable
}

object PluginArgsBase {
  @scala.inline
  def apply(Ractive: Instantiable): PluginArgsBase = {
    val __obj = js.Dynamic.literal(Ractive = Ractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginArgsBase]
  }
}

