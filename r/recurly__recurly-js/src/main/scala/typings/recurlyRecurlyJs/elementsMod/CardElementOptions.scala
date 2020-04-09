package typings.recurlyRecurlyJs.elementsMod

import typings.recurlyRecurlyJs.CommonElementStyleinvalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardElementOptions extends js.Object {
  var displayIcon: js.UndefOr[Boolean] = js.undefined
  var inputType: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CommonElementStyleinvalid] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
}

object CardElementOptions {
  @scala.inline
  def apply(
    displayIcon: js.UndefOr[Boolean] = js.undefined,
    inputType: String = null,
    style: CommonElementStyleinvalid = null,
    tabIndex: String = null
  ): CardElementOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayIcon)) __obj.updateDynamic("displayIcon")(displayIcon.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardElementOptions]
  }
}

