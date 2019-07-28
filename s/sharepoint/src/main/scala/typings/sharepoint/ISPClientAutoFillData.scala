package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISPClientAutoFillData extends js.Object {
  var AutoFillDisplayText: js.UndefOr[String] = js.undefined
  var AutoFillKey: js.UndefOr[js.Any] = js.undefined
  var AutoFillMenuOptionType: js.UndefOr[Double] = js.undefined
  var AutoFillSubDisplayText: js.UndefOr[String] = js.undefined
  var AutoFillTitleText: js.UndefOr[String] = js.undefined
}

object ISPClientAutoFillData {
  @scala.inline
  def apply(
    AutoFillDisplayText: String = null,
    AutoFillKey: js.Any = null,
    AutoFillMenuOptionType: Int | Double = null,
    AutoFillSubDisplayText: String = null,
    AutoFillTitleText: String = null
  ): ISPClientAutoFillData = {
    val __obj = js.Dynamic.literal()
    if (AutoFillDisplayText != null) __obj.updateDynamic("AutoFillDisplayText")(AutoFillDisplayText)
    if (AutoFillKey != null) __obj.updateDynamic("AutoFillKey")(AutoFillKey)
    if (AutoFillMenuOptionType != null) __obj.updateDynamic("AutoFillMenuOptionType")(AutoFillMenuOptionType.asInstanceOf[js.Any])
    if (AutoFillSubDisplayText != null) __obj.updateDynamic("AutoFillSubDisplayText")(AutoFillSubDisplayText)
    if (AutoFillTitleText != null) __obj.updateDynamic("AutoFillTitleText")(AutoFillTitleText)
    __obj.asInstanceOf[ISPClientAutoFillData]
  }
}

