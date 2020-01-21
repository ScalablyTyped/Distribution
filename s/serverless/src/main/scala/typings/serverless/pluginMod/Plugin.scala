package typings.serverless.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var commands: js.UndefOr[Commands] = js.undefined
  var hooks: Hooks
}

object Plugin {
  @scala.inline
  def apply(hooks: Hooks, commands: Commands = null): Plugin = {
    val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
}

