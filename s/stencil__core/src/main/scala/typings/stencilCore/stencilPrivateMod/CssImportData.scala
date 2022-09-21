package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssImportData extends StObject {
  
  var altFilePath: js.UndefOr[String] = js.undefined
  
  var filePath: String
  
  var srcImport: String
  
  var styleText: js.UndefOr[String | Null] = js.undefined
  
  var updatedImport: js.UndefOr[String] = js.undefined
  
  var url: String
}
object CssImportData {
  
  inline def apply(filePath: String, srcImport: String, url: String): CssImportData = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], srcImport = srcImport.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssImportData]
  }
  
  extension [Self <: CssImportData](x: Self) {
    
    inline def setAltFilePath(value: String): Self = StObject.set(x, "altFilePath", value.asInstanceOf[js.Any])
    
    inline def setAltFilePathUndefined: Self = StObject.set(x, "altFilePath", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setSrcImport(value: String): Self = StObject.set(x, "srcImport", value.asInstanceOf[js.Any])
    
    inline def setStyleText(value: String): Self = StObject.set(x, "styleText", value.asInstanceOf[js.Any])
    
    inline def setStyleTextNull: Self = StObject.set(x, "styleText", null)
    
    inline def setStyleTextUndefined: Self = StObject.set(x, "styleText", js.undefined)
    
    inline def setUpdatedImport(value: String): Self = StObject.set(x, "updatedImport", value.asInstanceOf[js.Any])
    
    inline def setUpdatedImportUndefined: Self = StObject.set(x, "updatedImport", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
