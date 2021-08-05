package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxVariableListItem...
  */
trait INxVariableListItem extends StObject {
  
  /**
    * Data.
    */
  var qData: js.Any
  
  /**
    * Definition of the variable. It can be a value or an expression.
    */
  var qDefinition: String
  
  /**
    * Description of the variable.
    */
  var qDescription: String
  
  /**
    * Identifier and type of the object.
    * >> This parameter is mandatory.
    */
  var qInfo: INxInfo
  
  /**
    * If set to true, it means that the variable is a system variable.
    * A system variable provides information about the system and is set by the engine.
    * The content cannot be changed by the user.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qIsConfig: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, it means that the variable is reserved.
    * >> This parameter is optional.
    * >> The default value is false.
    *
    * Examples:
    * - ScriptError is a reserved variable, set by the engine.
    * - DayNames is a reserved variable, set by the user.
    */
  var qIsReserved: js.UndefOr[Boolean] = js.undefined
  
  // ? nicht dokumentiert
  /**
    * If set to true, it means that the variable was defined via script.
    */
  var qIsScriptCreated: Boolean
  
  /**
    * Information about publishing and permissions.
    * >> This parameter is optional.
    */
  var qMeta: js.UndefOr[INxMeta] = js.undefined
  
  /**
    * Name of the variable.
    */
  var qName: String
}
object INxVariableListItem {
  
  inline def apply(
    qData: js.Any,
    qDefinition: String,
    qDescription: String,
    qInfo: INxInfo,
    qIsScriptCreated: Boolean,
    qName: String
  ): INxVariableListItem = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qDefinition = qDefinition.asInstanceOf[js.Any], qDescription = qDescription.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qIsScriptCreated = qIsScriptCreated.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxVariableListItem]
  }
  
  extension [Self <: INxVariableListItem](x: Self) {
    
    inline def setQData(value: js.Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQDefinition(value: String): Self = StObject.set(x, "qDefinition", value.asInstanceOf[js.Any])
    
    inline def setQDescription(value: String): Self = StObject.set(x, "qDescription", value.asInstanceOf[js.Any])
    
    inline def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    inline def setQIsConfig(value: Boolean): Self = StObject.set(x, "qIsConfig", value.asInstanceOf[js.Any])
    
    inline def setQIsConfigUndefined: Self = StObject.set(x, "qIsConfig", js.undefined)
    
    inline def setQIsReserved(value: Boolean): Self = StObject.set(x, "qIsReserved", value.asInstanceOf[js.Any])
    
    inline def setQIsReservedUndefined: Self = StObject.set(x, "qIsReserved", js.undefined)
    
    inline def setQIsScriptCreated(value: Boolean): Self = StObject.set(x, "qIsScriptCreated", value.asInstanceOf[js.Any])
    
    inline def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
    
    inline def setQMetaUndefined: Self = StObject.set(x, "qMeta", js.undefined)
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
