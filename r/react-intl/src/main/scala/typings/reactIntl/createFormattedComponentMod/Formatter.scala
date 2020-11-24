package typings.reactIntl.createFormattedComponentMod

import typings.formatjsIntl.srcTypesMod.FormatDateOptions
import typings.formatjsIntl.srcTypesMod.FormatDisplayNameOptions
import typings.formatjsIntl.srcTypesMod.FormatListOptions
import typings.formatjsIntl.srcTypesMod.FormatNumberOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatter extends js.Object {
  
  var formatDate: FormatDateOptions = js.native
  
  var formatDisplayName: FormatDisplayNameOptions = js.native
  
  var formatList: FormatListOptions = js.native
  
  var formatNumber: FormatNumberOptions = js.native
  
  var formatTime: FormatDateOptions = js.native
}
object Formatter {
  
  @scala.inline
  def apply(
    formatDate: FormatDateOptions,
    formatDisplayName: FormatDisplayNameOptions,
    formatList: FormatListOptions,
    formatNumber: FormatNumberOptions,
    formatTime: FormatDateOptions
  ): Formatter = {
    val __obj = js.Dynamic.literal(formatDate = formatDate.asInstanceOf[js.Any], formatDisplayName = formatDisplayName.asInstanceOf[js.Any], formatList = formatList.asInstanceOf[js.Any], formatNumber = formatNumber.asInstanceOf[js.Any], formatTime = formatTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatter]
  }
  
  @scala.inline
  implicit class FormatterOps[Self <: Formatter] (val x: Self) extends AnyVal {
    
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
    def setFormatDate(value: FormatDateOptions): Self = this.set("formatDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatDisplayName(value: FormatDisplayNameOptions): Self = this.set("formatDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatList(value: FormatListOptions): Self = this.set("formatList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNumber(value: FormatNumberOptions): Self = this.set("formatNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatTime(value: FormatDateOptions): Self = this.set("formatTime", value.asInstanceOf[js.Any])
  }
}
