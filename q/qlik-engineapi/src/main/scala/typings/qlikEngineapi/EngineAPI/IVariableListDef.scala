package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the list of variables in an app.
  */
trait IVariableListDef extends StObject {
  
  /**
    * Data Type JSON
    */
  var qData: Any
  
  /**
    * Shows the system variables if set to true.
    */
  var qShowConfig: Boolean
  
  /**
    * Shows the reserved variables if set to true.
    */
  var qShowReserved: Boolean
  
  /**
    * Type of the list.
    */
  var qType: String
}
object IVariableListDef {
  
  inline def apply(qData: Any, qShowConfig: Boolean, qShowReserved: Boolean, qType: String): IVariableListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qShowConfig = qShowConfig.asInstanceOf[js.Any], qShowReserved = qShowReserved.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVariableListDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IVariableListDef] (val x: Self) extends AnyVal {
    
    inline def setQData(value: Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQShowConfig(value: Boolean): Self = StObject.set(x, "qShowConfig", value.asInstanceOf[js.Any])
    
    inline def setQShowReserved(value: Boolean): Self = StObject.set(x, "qShowReserved", value.asInstanceOf[js.Any])
    
    inline def setQType(value: String): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
