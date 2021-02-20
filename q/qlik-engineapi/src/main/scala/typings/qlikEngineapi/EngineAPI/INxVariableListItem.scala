package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxVariableListItem...
  */
@js.native
trait INxVariableListItem extends StObject {
  
  /**
    * Data.
    */
  var qData: js.Any = js.native
  
  /**
    * Definition of the variable. It can be a value or an expression.
    */
  var qDefinition: String = js.native
  
  /**
    * Description of the variable.
    */
  var qDescription: String = js.native
  
  /**
    * Identifier and type of the object.
    * >> This parameter is mandatory.
    */
  var qInfo: INxInfo = js.native
  
  /**
    * If set to true, it means that the variable is a system variable.
    * A system variable provides information about the system and is set by the engine.
    * The content cannot be changed by the user.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qIsConfig: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, it means that the variable is reserved.
    * >> This parameter is optional.
    * >> The default value is false.
    *
    * Examples:
    * - ScriptError is a reserved variable, set by the engine.
    * - DayNames is a reserved variable, set by the user.
    */
  var qIsReserved: js.UndefOr[Boolean] = js.native
  
  // ? nicht dokumentiert
  /**
    * If set to true, it means that the variable was defined via script.
    */
  var qIsScriptCreated: Boolean = js.native
  
  /**
    * Information about publishing and permissions.
    * >> This parameter is optional.
    */
  var qMeta: js.UndefOr[INxMeta] = js.native
  
  /**
    * Name of the variable.
    */
  var qName: String = js.native
}
object INxVariableListItem {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class INxVariableListItemMutableBuilder[Self <: INxVariableListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQData(value: js.Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDefinition(value: String): Self = StObject.set(x, "qDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDescription(value: String): Self = StObject.set(x, "qDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsConfig(value: Boolean): Self = StObject.set(x, "qIsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsConfigUndefined: Self = StObject.set(x, "qIsConfig", js.undefined)
    
    @scala.inline
    def setQIsReserved(value: Boolean): Self = StObject.set(x, "qIsReserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsReservedUndefined: Self = StObject.set(x, "qIsReserved", js.undefined)
    
    @scala.inline
    def setQIsScriptCreated(value: Boolean): Self = StObject.set(x, "qIsScriptCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMetaUndefined: Self = StObject.set(x, "qMeta", js.undefined)
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
