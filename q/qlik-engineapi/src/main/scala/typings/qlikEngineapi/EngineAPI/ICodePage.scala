package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CodePage...
  */
@js.native
trait ICodePage extends StObject {
  
  /**
    * Description of the code page
    */
  var qDescription: String = js.native
  
  /**
    * Name of the code page
    */
  var qName: String = js.native
  
  /**
    * Number of the code page
    */
  var qNumber: Double = js.native
}
object ICodePage {
  
  @scala.inline
  def apply(qDescription: String, qName: String, qNumber: Double): ICodePage = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNumber = qNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodePage]
  }
  
  @scala.inline
  implicit class ICodePageMutableBuilder[Self <: ICodePage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDescription(value: String): Self = StObject.set(x, "qDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumber(value: Double): Self = StObject.set(x, "qNumber", value.asInstanceOf[js.Any])
  }
}
