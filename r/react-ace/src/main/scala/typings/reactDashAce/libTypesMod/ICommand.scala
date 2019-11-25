package typings.reactDashAce.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommand extends js.Object {
  var bindKey: ICommandBindKey
  var name: String
  def exec(): js.Any
}

object ICommand {
  @scala.inline
  def apply(bindKey: ICommandBindKey, exec: () => js.Any, name: String): ICommand = {
    val __obj = js.Dynamic.literal(bindKey = bindKey.asInstanceOf[js.Any], exec = js.Any.fromFunction0(exec), name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICommand]
  }
}

