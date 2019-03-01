package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISPClientAutoFillData extends js.Object {
  var AutoFillDisplayText: js.UndefOr[java.lang.String] = js.undefined
  var AutoFillKey: js.UndefOr[js.Any] = js.undefined
  var AutoFillMenuOptionType: js.UndefOr[scala.Double] = js.undefined
  var AutoFillSubDisplayText: js.UndefOr[java.lang.String] = js.undefined
  var AutoFillTitleText: js.UndefOr[java.lang.String] = js.undefined
}

object ISPClientAutoFillData {
  @scala.inline
  def apply(
    AutoFillDisplayText: java.lang.String = null,
    AutoFillKey: js.Any = null,
    AutoFillMenuOptionType: scala.Int | scala.Double = null,
    AutoFillSubDisplayText: java.lang.String = null,
    AutoFillTitleText: java.lang.String = null
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

