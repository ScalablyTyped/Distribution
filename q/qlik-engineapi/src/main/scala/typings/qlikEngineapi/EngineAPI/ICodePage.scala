package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CodePage...
  */
trait ICodePage extends StObject {
  
  /**
    * Description of the code page
    */
  var qDescription: String
  
  /**
    * Name of the code page
    */
  var qName: String
  
  /**
    * Number of the code page
    */
  var qNumber: Double
}
object ICodePage {
  
  inline def apply(qDescription: String, qName: String, qNumber: Double): ICodePage = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNumber = qNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodePage]
  }
  
  extension [Self <: ICodePage](x: Self) {
    
    inline def setQDescription(value: String): Self = StObject.set(x, "qDescription", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQNumber(value: Double): Self = StObject.set(x, "qNumber", value.asInstanceOf[js.Any])
  }
}
