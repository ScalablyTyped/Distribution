package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IDataRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QFormatSpec extends StObject {
  
  var qFormatSpec: String
  
  var qPreview: js.Array[IDataRecord]
}
object QFormatSpec {
  
  inline def apply(qFormatSpec: String, qPreview: js.Array[IDataRecord]): QFormatSpec = {
    val __obj = js.Dynamic.literal(qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qPreview = qPreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFormatSpec]
  }
  
  extension [Self <: QFormatSpec](x: Self) {
    
    inline def setQFormatSpec(value: String): Self = StObject.set(x, "qFormatSpec", value.asInstanceOf[js.Any])
    
    inline def setQPreview(value: js.Array[IDataRecord]): Self = StObject.set(x, "qPreview", value.asInstanceOf[js.Any])
    
    inline def setQPreviewVarargs(value: IDataRecord*): Self = StObject.set(x, "qPreview", js.Array(value*))
  }
}
