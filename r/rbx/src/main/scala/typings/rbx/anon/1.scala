package typings.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var `data-badge`: js.UndefOr[String | Double] = js.undefined
}

object `1` {
  @scala.inline
  def apply(`data-badge`: String | Double = null): `1` = {
    val __obj = js.Dynamic.literal()
    if (`data-badge` != null) __obj.updateDynamic("data-badge")(`data-badge`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

