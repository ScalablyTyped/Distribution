package typings.reduxTestkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThunkTestkit extends js.Object {
  def execute(args: js.Any*): js.Any
}

object ThunkTestkit {
  @scala.inline
  def apply(execute: /* repeated */ js.Any => js.Any): ThunkTestkit = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
  
    __obj.asInstanceOf[ThunkTestkit]
  }
}

