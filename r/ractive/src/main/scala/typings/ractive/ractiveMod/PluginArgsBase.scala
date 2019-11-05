package typings.ractive.ractiveMod

import typings.ractive.Anon_Adaptors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginArgsBase extends js.Object {
  var Ractive: Anon_Adaptors
}

object PluginArgsBase {
  @scala.inline
  def apply(Ractive: Anon_Adaptors): PluginArgsBase = {
    val __obj = js.Dynamic.literal(Ractive = Ractive)
  
    __obj.asInstanceOf[PluginArgsBase]
  }
}

