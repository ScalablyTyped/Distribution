package typings.printer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.printer.printerStrings.AUTO
import typings.printer.printerStrings.COMMAND
import typings.printer.printerStrings.JPEG
import typings.printer.printerStrings.PDF
import typings.printer.printerStrings.POSTSCRIPT
import typings.printer.printerStrings.RAW
import typings.printer.printerStrings.TEXT
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintDirectOptions extends js.Object {
  
  var data: String | Buffer = js.native
  
  var error: js.UndefOr[PrintOnErrorFunction] = js.native
  
  var options: js.UndefOr[StringDictionary[String]] = js.native
  
  var printer: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[PrintOnSuccessFunction] = js.native
  
  var `type`: js.UndefOr[RAW | TEXT | PDF | JPEG | POSTSCRIPT | COMMAND | AUTO] = js.native
}
object PrintDirectOptions {
  
  @scala.inline
  def apply(data: String | Buffer): PrintDirectOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintDirectOptions]
  }
  
  @scala.inline
  implicit class PrintDirectOptionsOps[Self <: PrintDirectOptions] (val x: Self) extends AnyVal {
    
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
    def setData(value: String | Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: /* err */ Error => js.Any): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPrinter(value: String): Self = this.set("printer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrinter: Self = this.set("printer", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* jobId */ String => js.Any): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setType(value: RAW | TEXT | PDF | JPEG | POSTSCRIPT | COMMAND | AUTO): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
