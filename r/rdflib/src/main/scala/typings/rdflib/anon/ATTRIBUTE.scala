package typings.rdflib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ATTRIBUTE extends StObject {
  
  var ATTRIBUTE: Double
  
  var CDATA_SECTION: Double
  
  var COMMENT: Double
  
  var DOCUMENT: Double
  
  var DOCUMENT_FRAGMENT: Double
  
  var DOCUMENT_TYPE: Double
  
  var ELEMENT: Double
  
  var ENTITY: Double
  
  var ENTITY_REFERENCE: Double
  
  var NOTATION: Double
  
  var PROCESSING_INSTRUCTION: Double
  
  var TEXT: Double
}
object ATTRIBUTE {
  
  inline def apply(
    ATTRIBUTE: Double,
    CDATA_SECTION: Double,
    COMMENT: Double,
    DOCUMENT: Double,
    DOCUMENT_FRAGMENT: Double,
    DOCUMENT_TYPE: Double,
    ELEMENT: Double,
    ENTITY: Double,
    ENTITY_REFERENCE: Double,
    NOTATION: Double,
    PROCESSING_INSTRUCTION: Double,
    TEXT: Double
  ): ATTRIBUTE = {
    val __obj = js.Dynamic.literal(ATTRIBUTE = ATTRIBUTE.asInstanceOf[js.Any], CDATA_SECTION = CDATA_SECTION.asInstanceOf[js.Any], COMMENT = COMMENT.asInstanceOf[js.Any], DOCUMENT = DOCUMENT.asInstanceOf[js.Any], DOCUMENT_FRAGMENT = DOCUMENT_FRAGMENT.asInstanceOf[js.Any], DOCUMENT_TYPE = DOCUMENT_TYPE.asInstanceOf[js.Any], ELEMENT = ELEMENT.asInstanceOf[js.Any], ENTITY = ENTITY.asInstanceOf[js.Any], ENTITY_REFERENCE = ENTITY_REFERENCE.asInstanceOf[js.Any], NOTATION = NOTATION.asInstanceOf[js.Any], PROCESSING_INSTRUCTION = PROCESSING_INSTRUCTION.asInstanceOf[js.Any], TEXT = TEXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATTRIBUTE]
  }
  
  extension [Self <: ATTRIBUTE](x: Self) {
    
    inline def setATTRIBUTE(value: Double): Self = StObject.set(x, "ATTRIBUTE", value.asInstanceOf[js.Any])
    
    inline def setCDATA_SECTION(value: Double): Self = StObject.set(x, "CDATA_SECTION", value.asInstanceOf[js.Any])
    
    inline def setCOMMENT(value: Double): Self = StObject.set(x, "COMMENT", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT(value: Double): Self = StObject.set(x, "DOCUMENT", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_FRAGMENT(value: Double): Self = StObject.set(x, "DOCUMENT_FRAGMENT", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_TYPE(value: Double): Self = StObject.set(x, "DOCUMENT_TYPE", value.asInstanceOf[js.Any])
    
    inline def setELEMENT(value: Double): Self = StObject.set(x, "ELEMENT", value.asInstanceOf[js.Any])
    
    inline def setENTITY(value: Double): Self = StObject.set(x, "ENTITY", value.asInstanceOf[js.Any])
    
    inline def setENTITY_REFERENCE(value: Double): Self = StObject.set(x, "ENTITY_REFERENCE", value.asInstanceOf[js.Any])
    
    inline def setNOTATION(value: Double): Self = StObject.set(x, "NOTATION", value.asInstanceOf[js.Any])
    
    inline def setPROCESSING_INSTRUCTION(value: Double): Self = StObject.set(x, "PROCESSING_INSTRUCTION", value.asInstanceOf[js.Any])
    
    inline def setTEXT(value: Double): Self = StObject.set(x, "TEXT", value.asInstanceOf[js.Any])
  }
}
