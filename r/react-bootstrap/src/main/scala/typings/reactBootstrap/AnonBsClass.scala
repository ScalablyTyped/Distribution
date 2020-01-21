package typings.reactBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBsClass extends js.Object {
  var bsClass: js.UndefOr[js.Any] = js.undefined
}

object AnonBsClass {
  @scala.inline
  def apply(bsClass: js.Any = null): AnonBsClass = {
    val __obj = js.Dynamic.literal()
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBsClass]
  }
}

