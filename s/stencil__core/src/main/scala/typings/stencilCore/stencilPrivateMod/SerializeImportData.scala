package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializeImportData
  extends StObject
     with ImportData {
  
  var importeePath: String
  
  var importerPath: js.UndefOr[String] = js.undefined
}
object SerializeImportData {
  
  inline def apply(importeePath: String): SerializeImportData = {
    val __obj = js.Dynamic.literal(importeePath = importeePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeImportData]
  }
  
  extension [Self <: SerializeImportData](x: Self) {
    
    inline def setImporteePath(value: String): Self = StObject.set(x, "importeePath", value.asInstanceOf[js.Any])
    
    inline def setImporterPath(value: String): Self = StObject.set(x, "importerPath", value.asInstanceOf[js.Any])
    
    inline def setImporterPathUndefined: Self = StObject.set(x, "importerPath", js.undefined)
  }
}
