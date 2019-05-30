package typings
package reactDashAceLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommand extends js.Object {
  var bindKey: ICommandBindKey
  var name: java.lang.String
  def exec(): js.Any
}

object ICommand {
  @scala.inline
  def apply(bindKey: ICommandBindKey, exec: () => js.Any, name: java.lang.String): ICommand = {
    val __obj = js.Dynamic.literal(bindKey = bindKey, exec = js.Any.fromFunction0(exec), name = name)
  
    __obj.asInstanceOf[ICommand]
  }
}

