package typings.printer.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintFileOptions extends js.Object {
  
  var error: js.UndefOr[PrintOnErrorFunction] = js.native
  
  var filename: String = js.native
  
  var printer: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[PrintOnSuccessFunction] = js.native
}
object PrintFileOptions {
  
  @scala.inline
  def apply(filename: String): PrintFileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintFileOptions]
  }
  
  @scala.inline
  implicit class PrintFileOptionsOps[Self <: PrintFileOptions] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: /* err */ Error => js.Any): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setPrinter(value: String): Self = this.set("printer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrinter: Self = this.set("printer", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* jobId */ String => js.Any): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
