package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.ValidateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Len extends js.Object {
  var len: js.UndefOr[ValidateMessage] = js.undefined
  var max: js.UndefOr[ValidateMessage] = js.undefined
  var min: js.UndefOr[ValidateMessage] = js.undefined
  var range: js.UndefOr[ValidateMessage] = js.undefined
}

object Len {
  @scala.inline
  def apply(
    len: ValidateMessage = null,
    max: ValidateMessage = null,
    min: ValidateMessage = null,
    range: ValidateMessage = null
  ): Len = {
    val __obj = js.Dynamic.literal()
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Len]
  }
}

