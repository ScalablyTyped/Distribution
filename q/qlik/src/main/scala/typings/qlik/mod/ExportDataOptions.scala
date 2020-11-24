package typings.qlik.mod

import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.CSV_C
import typings.qlik.qlikStrings.CSV_T
import typings.qlik.qlikStrings.OOXML
import typings.qlik.qlikStrings.P
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDataOptions extends js.Object {
  
  var download: Boolean = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var format: OOXML | CSV_C | CSV_T = js.native
  
  var state: A | P = js.native
}
object ExportDataOptions {
  
  @scala.inline
  def apply(download: Boolean, format: OOXML | CSV_C | CSV_T, state: A | P): ExportDataOptions = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDataOptions]
  }
  
  @scala.inline
  implicit class ExportDataOptionsOps[Self <: ExportDataOptions] (val x: Self) extends AnyVal {
    
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
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: OOXML | CSV_C | CSV_T): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: A | P): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
  }
}
