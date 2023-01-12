package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.INxAxisData
import typings.qlikEngineapi.EngineAPI.INxDataPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QAxisData extends StObject {
  
  var qAxisData: js.Array[INxAxisData]
  
  var qDataPages: js.Array[INxDataPage]
}
object QAxisData {
  
  inline def apply(qAxisData: js.Array[INxAxisData], qDataPages: js.Array[INxDataPage]): QAxisData = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[QAxisData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QAxisData] (val x: Self) extends AnyVal {
    
    inline def setQAxisData(value: js.Array[INxAxisData]): Self = StObject.set(x, "qAxisData", value.asInstanceOf[js.Any])
    
    inline def setQAxisDataVarargs(value: INxAxisData*): Self = StObject.set(x, "qAxisData", js.Array(value*))
    
    inline def setQDataPages(value: js.Array[INxDataPage]): Self = StObject.set(x, "qDataPages", value.asInstanceOf[js.Any])
    
    inline def setQDataPagesVarargs(value: INxDataPage*): Self = StObject.set(x, "qDataPages", js.Array(value*))
  }
}
