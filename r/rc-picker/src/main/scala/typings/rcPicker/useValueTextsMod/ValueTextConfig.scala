package typings.rcPicker.useValueTextsMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueTextConfig[DateType] extends js.Object {
  var formatList: js.Array[String]
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
}

object ValueTextConfig {
  @scala.inline
  def apply[DateType](formatList: js.Array[String], generateConfig: GenerateConfig[DateType], locale: Locale): ValueTextConfig[DateType] = {
    val __obj = js.Dynamic.literal(formatList = formatList.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTextConfig[DateType]]
  }
}

