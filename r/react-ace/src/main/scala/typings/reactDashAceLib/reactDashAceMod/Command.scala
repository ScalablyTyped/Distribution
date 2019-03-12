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
  def apply(bindKey: CommandBindKey, exec: js.Any => scala.Unit, name: java.lang.String): Command = {
    val __obj = js.Dynamic.literal(bindKey = bindKey, exec = js.Any.fromFunction1(exec), name = name)
  
    __obj.asInstanceOf[Command]
  }
}

