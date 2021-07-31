package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericVariableProperties width extend GenericProperties
  */
trait IGenericVariableProperties
  extends StObject
     with IGenericProperties {
  
  /**
    * Comment related to the variable.
    * >> This parameter is optional.
    */
  var qComment: js.UndefOr[String] = js.undefined
  
  /**
    * Definition of the variable.
    */
  var qDefinition: String
  
  /**
    * Set this property to true to update the variable when applying a bookmark.
    * The variable value will be persisted in the bookmark.
    * The value of a variable can affect the state of the selections.
    * Script variables cannot be persisted in the bookmark.
    * >> The default value is false.
    */
  var qIncludeInBookmark: Boolean
  
  /**
    * Name of the variable.
    * The name must be unique.
    * >> This parameter is mandatory.
    */
  var qName: String
  
  /**
    * Defines the format of the value.
    * >> This parameter is optional.
    */
  var qNumberPresentation: js.UndefOr[IFieldAttributes] = js.undefined
}
object IGenericVariableProperties {
  
  @scala.inline
  def apply(qDefinition: String, qIncludeInBookmark: Boolean, qInfo: INxInfo, qName: String): IGenericVariableProperties = {
    val __obj = js.Dynamic.literal(qDefinition = qDefinition.asInstanceOf[js.Any], qIncludeInBookmark = qIncludeInBookmark.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableProperties]
  }
  
  @scala.inline
  implicit class IGenericVariablePropertiesMutableBuilder[Self <: IGenericVariableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQComment(value: String): Self = StObject.set(x, "qComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCommentUndefined: Self = StObject.set(x, "qComment", js.undefined)
    
    @scala.inline
    def setQDefinition(value: String): Self = StObject.set(x, "qDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIncludeInBookmark(value: Boolean): Self = StObject.set(x, "qIncludeInBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumberPresentation(value: IFieldAttributes): Self = StObject.set(x, "qNumberPresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumberPresentationUndefined: Self = StObject.set(x, "qNumberPresentation", js.undefined)
  }
}
