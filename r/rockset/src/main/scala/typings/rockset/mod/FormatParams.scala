package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatParams extends StObject {
  
  var csv: js.UndefOr[CsvParams] = js.undefined
  
  // source data is in json format
  var json: js.UndefOr[Boolean] = js.undefined
  
  var xml: js.UndefOr[XmlParams] = js.undefined
}
object FormatParams {
  
  @scala.inline
  def apply(): FormatParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatParams]
  }
  
  @scala.inline
  implicit class FormatParamsMutableBuilder[Self <: FormatParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsv(value: CsvParams): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    @scala.inline
    def setXml(value: XmlParams): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
