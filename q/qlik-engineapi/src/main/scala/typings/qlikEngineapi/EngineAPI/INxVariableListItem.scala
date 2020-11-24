package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxVariableListItem...
  */
@js.native
trait INxVariableListItem extends js.Object {
  
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
  implicit class INxVariableListItemOps[Self <: INxVariableListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQData(value: js.Any): Self = this.set("qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDefinition(value: String): Self = this.set("qDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDescription(value: String): Self = this.set("qDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInfo(value: INxInfo): Self = this.set("qInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsScriptCreated(value: Boolean): Self = this.set("qIsScriptCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsConfig(value: Boolean): Self = this.set("qIsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQIsConfig: Self = this.set("qIsConfig", js.undefined)
    
    @scala.inline
    def setQIsReserved(value: Boolean): Self = this.set("qIsReserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQIsReserved: Self = this.set("qIsReserved", js.undefined)
    
    @scala.inline
    def setQMeta(value: INxMeta): Self = this.set("qMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQMeta: Self = this.set("qMeta", js.undefined)
  }
}
