package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.PickerMode
import typings.rcPicker.interfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultDates[DateType] extends js.Object {
  var defaultDates: js.UndefOr[RangeValue[DateType]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var picker: PickerMode
  var values: RangeValue[DateType]
}

object AnonDefaultDates {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    picker: PickerMode,
    defaultDates: RangeValue[DateType] = null,
    values: RangeValue[DateType] = null
  ): AnonDefaultDates[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    if (defaultDates != null) __obj.updateDynamic("defaultDates")(defaultDates.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultDates[DateType]]
  }
}

