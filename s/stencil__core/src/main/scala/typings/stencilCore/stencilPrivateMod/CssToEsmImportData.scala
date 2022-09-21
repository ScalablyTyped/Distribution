package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssToEsmImportData extends StObject {
  
  var filePath: String
  
  var srcImportText: String
  
  var url: String
  
  var varName: String
}
object CssToEsmImportData {
  
  inline def apply(filePath: String, srcImportText: String, url: String, varName: String): CssToEsmImportData = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], srcImportText = srcImportText.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], varName = varName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssToEsmImportData]
  }
  
  extension [Self <: CssToEsmImportData](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setSrcImportText(value: String): Self = StObject.set(x, "srcImportText", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVarName(value: String): Self = StObject.set(x, "varName", value.asInstanceOf[js.Any])
  }
}
