package typings
package reduxDashTestkitLib.reduxDashTestkitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThunkTestkit extends js.Object {
  def execute(args: js.Any*): js.Any
}

object ThunkTestkit {
  @scala.inline
  def apply(execute: js.Function1[/* repeated */ js.Any, js.Any]): ThunkTestkit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.asInstanceOf[ThunkTestkit]
  }
}

