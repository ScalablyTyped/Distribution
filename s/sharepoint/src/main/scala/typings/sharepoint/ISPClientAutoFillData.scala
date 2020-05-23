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
    AutoFillMenuOptionType: js.UndefOr[Double] = js.undefined,
    AutoFillSubDisplayText: String = null,
    AutoFillTitleText: String = null
  ): ISPClientAutoFillData = {
    val __obj = js.Dynamic.literal()
    if (AutoFillDisplayText != null) __obj.updateDynamic("AutoFillDisplayText")(AutoFillDisplayText.asInstanceOf[js.Any])
    if (AutoFillKey != null) __obj.updateDynamic("AutoFillKey")(AutoFillKey.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoFillMenuOptionType)) __obj.updateDynamic("AutoFillMenuOptionType")(AutoFillMenuOptionType.get.asInstanceOf[js.Any])
    if (AutoFillSubDisplayText != null) __obj.updateDynamic("AutoFillSubDisplayText")(AutoFillSubDisplayText.asInstanceOf[js.Any])
    if (AutoFillTitleText != null) __obj.updateDynamic("AutoFillTitleText")(AutoFillTitleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISPClientAutoFillData]
  }
}

