package typings.siesta.SiestaNs.TestNs.ActionNs

import typings.siesta.SiestaNs.TestNs.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait Eval extends IAction {
  var options: js.UndefOr[js.Any] = js.undefined
}

object Eval {
  @scala.inline
  def apply(desc: String = null, options: js.Any = null): Eval = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Eval]
  }
}

