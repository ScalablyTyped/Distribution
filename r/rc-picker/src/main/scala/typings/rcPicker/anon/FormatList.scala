package typings.rcPicker.anon

import typings.rcPicker.interfaceMod.CustomFormat
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatList[DateType] extends js.Object {
  
  var formatList: js.Array[String | CustomFormat[DateType]] = js.native
  
  var generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType] = js.native
  
  var locale: Locale = js.native
}
object FormatList {
  
  @scala.inline
  def apply[DateType](
    formatList: js.Array[String | CustomFormat[DateType]],
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    locale: Locale
  ): FormatList[DateType] = {
    val __obj = js.Dynamic.literal(formatList = formatList.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatList[DateType]]
  }
  
  @scala.inline
  implicit class FormatListOps[Self <: FormatList[_], DateType] (val x: Self with FormatList[DateType]) extends AnyVal {
    
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
    def setFormatListVarargs(value: (String | CustomFormat[DateType])*): Self = this.set("formatList", js.Array(value :_*))
    
    @scala.inline
    def setFormatList(value: js.Array[String | CustomFormat[DateType]]): Self = this.set("formatList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateConfig(value: typings.rcPicker.generateMod.GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
  }
}
