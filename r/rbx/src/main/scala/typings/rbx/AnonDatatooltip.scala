package typings.rbx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatatooltip extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var `data-badge`: js.UndefOr[String | Double] = js.undefined
  var `data-tooltip`: js.UndefOr[String | Double] = js.undefined
}

object AnonDatatooltip {
  @scala.inline
  def apply(
    className: String = null,
    `data-badge`: String | Double = null,
    `data-tooltip`: String | Double = null
  ): AnonDatatooltip = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (`data-badge` != null) __obj.updateDynamic("data-badge")(`data-badge`.asInstanceOf[js.Any])
    if (`data-tooltip` != null) __obj.updateDynamic("data-tooltip")(`data-tooltip`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatatooltip]
  }
}

