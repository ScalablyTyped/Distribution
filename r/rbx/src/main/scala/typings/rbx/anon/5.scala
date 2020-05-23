package typings.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `5` extends js.Object {
  var `data-tooltip`: js.UndefOr[String | Double] = js.undefined
}

object `5` {
  @scala.inline
  def apply(`data-tooltip`: String | Double = null): `5` = {
    val __obj = js.Dynamic.literal()
    if (`data-tooltip` != null) __obj.updateDynamic("data-tooltip")(`data-tooltip`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
}

