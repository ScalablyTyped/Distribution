package typings.rollup.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof rollup.rollup.OutputPluginHooks ]:? rollup.rollup.OutputPluginHooks[P]}
- Dropped {[ P in keyof rollup.rollup.OutputPluginValueHooks ]:? rollup.rollup.OutputPluginValueHooks[P]} */ trait OutputPlugin extends js.Object {
  var name: String
}

object OutputPlugin {
  @scala.inline
  def apply(name: String): OutputPlugin = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[OutputPlugin]
  }
}

