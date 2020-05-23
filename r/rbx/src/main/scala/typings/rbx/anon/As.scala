package typings.rbx.anon

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait As[TAsComponent /* <: ReactType[_] */] extends js.Object {
  var as: js.UndefOr[TAsComponent] = js.undefined
}

object As {
  @scala.inline
  def apply[TAsComponent](as: TAsComponent = null): As[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[As[TAsComponent]]
  }
}

