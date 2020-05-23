package typings.reactBootstrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BsClass extends js.Object {
  var bsClass: js.UndefOr[js.Any] = js.undefined
}

object BsClass {
  @scala.inline
  def apply(bsClass: js.Any = null): BsClass = {
    val __obj = js.Dynamic.literal()
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[BsClass]
  }
}

