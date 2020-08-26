package typings.rcPicker.useValueTextsMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueTextConfig[DateType] extends js.Object {
  var formatList: js.Array[String] = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var locale: Locale = js.native
}

object ValueTextConfig {
  @scala.inline
  def apply[DateType](formatList: js.Array[String], generateConfig: GenerateConfig[DateType], locale: Locale): ValueTextConfig[DateType] = {
    val __obj = js.Dynamic.literal(formatList = formatList.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTextConfig[DateType]]
  }
  @scala.inline
  implicit class ValueTextConfigOps[Self <: ValueTextConfig[_], DateType] (val x: Self with ValueTextConfig[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormatListVarargs(value: String*): Self = this.set("formatList", js.Array(value :_*))
    @scala.inline
    def setFormatList(value: js.Array[String]): Self = this.set("formatList", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerateConfig(value: GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
  }
  
}

