package typings.siesta.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @abstract
  */
trait IAction extends js.Object {
  var desc: js.UndefOr[String] = js.undefined
}

object IAction {
  @scala.inline
  def apply(desc: String = null): IAction = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc)
    __obj.asInstanceOf[IAction]
  }
}

