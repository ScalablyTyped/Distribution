package typings.atStorybookApi.distModulesShortcutsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubState extends js.Object {
  var shortcuts: Shortcuts
}

object SubState {
  @scala.inline
  def apply(shortcuts: Shortcuts): SubState = {
    val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubState]
  }
}

