package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginArgsInstance extends js.Object {
  var instance: Ractive[Ractive[_]]
  var proto: Ractive[Ractive[_]]
}

object PluginArgsInstance {
  @scala.inline
  def apply(instance: Ractive[Ractive[_]], proto: Ractive[Ractive[_]]): PluginArgsInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginArgsInstance]
  }
}

