package typings.reactDashAce.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandManager extends js.Object {
  var bindKey: js.UndefOr[js.Function2[/* bindKey */ js.Any, /* command */ js.Any, Unit]] = js.undefined
  var byName: js.Any
  var commands: js.Any
  var platform: String
  def addCommand(command: js.Any): Unit
  def addCommands(commands: js.Array[_]): Unit
  def exec(name: String, editor: js.Any, args: js.Any): Unit
}

object ICommandManager {
  @scala.inline
  def apply(
    addCommand: js.Any => Unit,
    addCommands: js.Array[_] => Unit,
    byName: js.Any,
    commands: js.Any,
    exec: (String, js.Any, js.Any) => Unit,
    platform: String,
    bindKey: (/* bindKey */ js.Any, /* command */ js.Any) => Unit = null
  ): ICommandManager = {
    val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), addCommands = js.Any.fromFunction1(addCommands), byName = byName, commands = commands, exec = js.Any.fromFunction3(exec), platform = platform)
    if (bindKey != null) __obj.updateDynamic("bindKey")(js.Any.fromFunction2(bindKey))
    __obj.asInstanceOf[ICommandManager]
  }
}

