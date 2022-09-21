package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatParams extends StObject {
  
  /**
    *
    * @type {CsvParams}
    * @memberof FormatParams
    */
  var csv: js.UndefOr[CsvParams] = js.undefined
  
  /**
    * source data is in json format
    * @type {boolean}
    * @memberof FormatParams
    */
  var json: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * @type {XmlParams}
    * @memberof FormatParams
    */
  var xml: js.UndefOr[XmlParams] = js.undefined
}
object FormatParams {
  
  inline def apply(): FormatParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatParams]
  }
  
  extension [Self <: FormatParams](x: Self) {
    
    inline def setCsv(value: CsvParams): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setXml(value: XmlParams): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
