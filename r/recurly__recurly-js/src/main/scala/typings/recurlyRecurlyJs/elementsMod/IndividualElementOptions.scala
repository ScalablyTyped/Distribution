package typings.recurlyRecurlyJs.elementsMod

import typings.recurlyRecurlyJs.anon.CommonElementStyleinvalidFontColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndividualElementOptions extends js.Object {
  var format: js.UndefOr[Boolean] = js.undefined
  var inputType: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CommonElementStyleinvalidFontColor] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
}

object IndividualElementOptions {
  @scala.inline
  def apply(
    format: js.UndefOr[Boolean] = js.undefined,
    inputType: String = null,
    style: CommonElementStyleinvalidFontColor = null,
    tabIndex: String = null
  ): IndividualElementOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndividualElementOptions]
  }
}

