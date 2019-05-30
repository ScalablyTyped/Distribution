package typings
package reactDashAceLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandManager extends js.Object {
  var bindKey: js.UndefOr[js.Function2[/* bindKey */ js.Any, /* command */ js.Any, scala.Unit]] = js.undefined
  var byName: js.Any
  var commands: js.Any
  var platform: java.lang.String
  def addCommand(command: js.Any): scala.Unit
  def addCommands(commands: js.Array[_]): scala.Unit
  def exec(name: java.lang.String, editor: js.Any, args: js.Any): scala.Unit
}

object ICommandManager {
  @scala.inline
  def apply(
    addCommand: js.Any => scala.Unit,
    addCommands: js.Array[_] => scala.Unit,
    byName: js.Any,
    commands: js.Any,
    exec: (java.lang.String, js.Any, js.Any) => scala.Unit,
    platform: java.lang.String,
    bindKey: (/* bindKey */ js.Any, /* command */ js.Any) => scala.Unit = null
  ): ICommandManager = {
    val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), addCommands = js.Any.fromFunction1(addCommands), byName = byName, commands = commands, exec = js.Any.fromFunction3(exec), platform = platform)
    if (bindKey != null) __obj.updateDynamic("bindKey")(js.Any.fromFunction2(bindKey))
    __obj.asInstanceOf[ICommandManager]
  }
}

