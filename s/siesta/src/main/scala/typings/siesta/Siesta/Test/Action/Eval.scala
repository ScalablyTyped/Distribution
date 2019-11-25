package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.IAction
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
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eval]
  }
}

