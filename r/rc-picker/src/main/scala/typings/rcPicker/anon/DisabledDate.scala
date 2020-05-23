package typings.rcPicker.anon

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledDate[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  def disabledDate(date: DateType): Boolean
}

object DisabledDate {
  @scala.inline
  def apply[DateType](disabledDate: DateType => Boolean, generateConfig: GenerateConfig[DateType], locale: Locale): DisabledDate[DateType] = {
    val __obj = js.Dynamic.literal(disabledDate = js.Any.fromFunction1(disabledDate), generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledDate[DateType]]
  }
}

