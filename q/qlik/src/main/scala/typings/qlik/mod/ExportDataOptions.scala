package typings.qlik.mod

import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.CSV_C
import typings.qlik.qlikStrings.CSV_T
import typings.qlik.qlikStrings.OOXML
import typings.qlik.qlikStrings.P
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDataOptions extends StObject {
  
  var download: Boolean
  
  var filename: js.UndefOr[String] = js.undefined
  
  var format: OOXML | CSV_C | CSV_T
  
  var state: A | P
}
object ExportDataOptions {
  
  @scala.inline
  def apply(download: Boolean, format: OOXML | CSV_C | CSV_T, state: A | P): ExportDataOptions = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDataOptions]
  }
  
  @scala.inline
  implicit class ExportDataOptionsMutableBuilder[Self <: ExportDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setFormat(value: OOXML | CSV_C | CSV_T): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: A | P): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
