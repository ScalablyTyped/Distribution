package typings.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object `2` {
  @scala.inline
  def apply(className: String = null): `2` = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

