package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxFieldDescription...
  */
trait INxFieldDescription extends StObject {
  
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * >> The default value is false.
    */
  var qAndMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of distinct field values
    */
  var qCardinal: Double
  
  /**
    * Lists the derived fields if any.
    */
  var qDerivedFieldData: INxDerivedFieldDescriptionList
  
  /**
    * If set to true, it means that the field is a field on the fly.
    */
  var qIsDefinitionOnly: Boolean
  
  /**
    * Is used for Direct Discovery.
    * If set to true, it means that the type of the field is detail.
    */
  var qIsDetail: Boolean
  
  /**
    * If set to true, it means that the field is hidden.
    */
  var qIsHidden: Boolean
  
  /**
    * Is used for Direct Discovery.
    * If set to true, it means that the type of the field is measure.
    */
  var qIsImplicit: Boolean
  
  /**
    * If set to true, it means that the field is a semantic.
    */
  var qIsSemantic: Boolean
  
  /**
    * If set to true, it means that the field is a system field.
    */
  var qIsSystem: Boolean
  
  /**
    * Name of the field
    */
  var qName: String
  
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[String]
}
object INxFieldDescription {
  
  inline def apply(
    qCardinal: Double,
    qDerivedFieldData: INxDerivedFieldDescriptionList,
    qIsDefinitionOnly: Boolean,
    qIsDetail: Boolean,
    qIsHidden: Boolean,
    qIsImplicit: Boolean,
    qIsSemantic: Boolean,
    qIsSystem: Boolean,
    qName: String,
    qTags: js.Array[String]
  ): INxFieldDescription = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qDerivedFieldData = qDerivedFieldData.asInstanceOf[js.Any], qIsDefinitionOnly = qIsDefinitionOnly.asInstanceOf[js.Any], qIsDetail = qIsDetail.asInstanceOf[js.Any], qIsHidden = qIsHidden.asInstanceOf[js.Any], qIsImplicit = qIsImplicit.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qIsSystem = qIsSystem.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxFieldDescription]
  }
  
  extension [Self <: INxFieldDescription](x: Self) {
    
    inline def setQAndMode(value: Boolean): Self = StObject.set(x, "qAndMode", value.asInstanceOf[js.Any])
    
    inline def setQAndModeUndefined: Self = StObject.set(x, "qAndMode", js.undefined)
    
    inline def setQCardinal(value: Double): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    inline def setQDerivedFieldData(value: INxDerivedFieldDescriptionList): Self = StObject.set(x, "qDerivedFieldData", value.asInstanceOf[js.Any])
    
    inline def setQIsDefinitionOnly(value: Boolean): Self = StObject.set(x, "qIsDefinitionOnly", value.asInstanceOf[js.Any])
    
    inline def setQIsDetail(value: Boolean): Self = StObject.set(x, "qIsDetail", value.asInstanceOf[js.Any])
    
    inline def setQIsHidden(value: Boolean): Self = StObject.set(x, "qIsHidden", value.asInstanceOf[js.Any])
    
    inline def setQIsImplicit(value: Boolean): Self = StObject.set(x, "qIsImplicit", value.asInstanceOf[js.Any])
    
    inline def setQIsSemantic(value: Boolean): Self = StObject.set(x, "qIsSemantic", value.asInstanceOf[js.Any])
    
    inline def setQIsSystem(value: Boolean): Self = StObject.set(x, "qIsSystem", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    inline def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value*))
  }
}
