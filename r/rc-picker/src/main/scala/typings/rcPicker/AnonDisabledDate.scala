package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabledDate[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  def disabledDate(date: DateType): Boolean
}

object AnonDisabledDate {
  @scala.inline
  def apply[DateType](disabledDate: DateType => Boolean, generateConfig: GenerateConfig[DateType], locale: Locale): AnonDisabledDate[DateType] = {
    val __obj = js.Dynamic.literal(disabledDate = js.Any.fromFunction1(disabledDate), generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabledDate[DateType]]
  }
}

