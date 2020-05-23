package typings.rbx.anon

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `7`[TAsComponent /* <: ElementType[_] */] extends js.Object {
  var as: js.UndefOr[TAsComponent] = js.undefined
}

object `7` {
  @scala.inline
  def apply[TAsComponent](as: TAsComponent = null): `7`[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`[TAsComponent]]
  }
}

