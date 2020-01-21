package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginArgsExtend extends js.Object {
  var instance: Static[Ractive[Ractive[_]]]
  var proto: Static[Ractive[Ractive[_]]]
}

object PluginArgsExtend {
  @scala.inline
  def apply(instance: Static[Ractive[Ractive[_]]], proto: Static[Ractive[Ractive[_]]]): PluginArgsExtend = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginArgsExtend]
  }
}

