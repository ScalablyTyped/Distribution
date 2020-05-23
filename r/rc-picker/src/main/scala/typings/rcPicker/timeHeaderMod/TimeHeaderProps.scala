package typings.rcPicker.timeHeaderMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeHeaderProps[DateType] extends js.Object {
  var format: String
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var prefixCls: String
  var value: js.UndefOr[DateType | Null] = js.undefined
}

object TimeHeaderProps {
  @scala.inline
  def apply[DateType](
    format: String,
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    prefixCls: String,
    value: js.UndefOr[Null | DateType] = js.undefined
  ): TimeHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeHeaderProps[DateType]]
  }
}

