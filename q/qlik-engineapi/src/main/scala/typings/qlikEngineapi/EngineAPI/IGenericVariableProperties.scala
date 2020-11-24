package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericVariableProperties width extend GenericProperties
  */
@js.native
trait IGenericVariableProperties extends IGenericProperties {
  
  /**
    * Comment related to the variable.
    * >> This parameter is optional.
    */
  var qComment: js.UndefOr[String] = js.native
  
  /**
    * Definition of the variable.
    */
  var qDefinition: String = js.native
  
  /**
    * Set this property to true to update the variable when applying a bookmark.
    * The variable value will be persisted in the bookmark.
    * The value of a variable can affect the state of the selections.
    * Script variables cannot be persisted in the bookmark.
    * >> The default value is false.
    */
  var qIncludeInBookmark: Boolean = js.native
  
  /**
    * Name of the variable.
    * The name must be unique.
    * >> This parameter is mandatory.
    */
  var qName: String = js.native
  
  /**
    * Defines the format of the value.
    * >> This parameter is optional.
    */
  var qNumberPresentation: js.UndefOr[IFieldAttributes] = js.native
}
object IGenericVariableProperties {
  
  @scala.inline
  def apply(qDefinition: String, qIncludeInBookmark: Boolean, qInfo: INxInfo, qName: String): IGenericVariableProperties = {
    val __obj = js.Dynamic.literal(qDefinition = qDefinition.asInstanceOf[js.Any], qIncludeInBookmark = qIncludeInBookmark.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableProperties]
  }
  
  @scala.inline
  implicit class IGenericVariablePropertiesOps[Self <: IGenericVariableProperties] (val x: Self) extends AnyVal {
    
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
    def setQDefinition(value: String): Self = this.set("qDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIncludeInBookmark(value: Boolean): Self = this.set("qIncludeInBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQComment(value: String): Self = this.set("qComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQComment: Self = this.set("qComment", js.undefined)
    
    @scala.inline
    def setQNumberPresentation(value: IFieldAttributes): Self = this.set("qNumberPresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQNumberPresentation: Self = this.set("qNumberPresentation", js.undefined)
  }
}
