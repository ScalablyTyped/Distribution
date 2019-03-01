package typings
package reactDashAceLib.reactDashAceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var bindKey: CommandBindKey
  var name: java.lang.String
  def exec(editor: js.Any): scala.Unit
}

object Command {
  @scala.inline
  def apply(bindKey: CommandBindKey, exec: js.Function1[js.Any, scala.Unit], name: java.lang.String): Command = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindKey")(bindKey)
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Command]
  }
}

