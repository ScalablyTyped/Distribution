package typings.ractive.mod

import typings.ractive.AnonAdaptors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginArgsBase extends js.Object {
  var Ractive: AnonAdaptors
}

object PluginArgsBase {
  @scala.inline
  def apply(Ractive: AnonAdaptors): PluginArgsBase = {
    val __obj = js.Dynamic.literal(Ractive = Ractive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginArgsBase]
  }
}

