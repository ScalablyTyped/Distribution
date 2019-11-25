package typings.rollup.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof rollup.rollup.PluginHooks ]:? rollup.rollup.PluginHooks[P]}
- Dropped {[ P in keyof rollup.rollup.OutputPluginValueHooks ]:? rollup.rollup.OutputPluginValueHooks[P]} */ trait Plugin extends js.Object {
  var name: String
}

object Plugin {
  @scala.inline
  def apply(name: String): Plugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Plugin]
  }
}

