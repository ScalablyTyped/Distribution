package typings.rcPicker.anon

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.PickerMode
import typings.rcPicker.interfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultDates[DateType] extends js.Object {
  var defaultDates: js.UndefOr[RangeValue[DateType]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var picker: PickerMode
  var values: RangeValue[DateType]
}

object DefaultDates {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    picker: PickerMode,
    defaultDates: js.UndefOr[Null | RangeValue[DateType]] = js.undefined,
    values: RangeValue[DateType] = null
  ): DefaultDates[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultDates)) __obj.updateDynamic("defaultDates")(defaultDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDates[DateType]]
  }
}

