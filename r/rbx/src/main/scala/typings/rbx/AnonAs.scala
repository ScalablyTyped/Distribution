package typings.rbx

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAs[TAsComponent /* <: ReactType[_] */] extends js.Object {
  var as: js.UndefOr[TAsComponent] = js.undefined
}

object AnonAs {
  @scala.inline
  def apply[TAsComponent /* <: ReactType[_] */](as: TAsComponent = null): AnonAs[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAs[TAsComponent]]
  }
}

