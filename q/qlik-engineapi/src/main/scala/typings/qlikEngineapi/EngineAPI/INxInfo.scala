package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxInfo...
  */
trait INxInfo extends StObject {
  
  /**
    * Identifier of the object.
    * If the chosen identifier is already in use, the engine automatically sets another one.
    * This parameter is optional. If an identifier is not set, the engine automatically sets one.
    */
  var qId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the object.
    * >> This parameter is mandatory.
    */
  var qType: String
}
object INxInfo {
  
  inline def apply(qType: String): INxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxInfo] (val x: Self) extends AnyVal {
    
    inline def setQId(value: String): Self = StObject.set(x, "qId", value.asInstanceOf[js.Any])
    
    inline def setQIdUndefined: Self = StObject.set(x, "qId", js.undefined)
    
    inline def setQType(value: String): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
