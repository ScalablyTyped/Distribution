package typings.rbx

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon7[TAsComponent /* <: ElementType[_] */] extends js.Object {
  var as: js.UndefOr[TAsComponent] = js.undefined
}

object Anon7 {
  @scala.inline
  def apply[TAsComponent /* <: ElementType[_] */](as: TAsComponent = null): Anon7[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon7[TAsComponent]]
  }
}

