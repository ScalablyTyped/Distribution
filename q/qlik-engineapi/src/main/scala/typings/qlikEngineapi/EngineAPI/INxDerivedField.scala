package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxDerivedField...
  */
trait INxDerivedField extends StObject {
  
  /**
    * Expression of the derived field.
    * Example:
    * If qName is OrderDate.MyDefinition.Year,
    * the expression is as follows:
    *
    * =${Mydefinition(OrderDate).Year}
    */
  var qExpr: String
  
  /**
    * Identifier of the derived field.
    * >> The identifier is unique.
    */
  var qId: String
  
  /**
    * Method name associated to the derived field.
    */
  var qMethod: String
  
  /**
    * Combination of field name, definition and method.
    * Example:
    * OrderDate.MyDefinition.Year
    */
  var qName: String
  
  /**
    * List of tags.
    */
  var qTags: js.Array[String]
}
object INxDerivedField {
  
  inline def apply(qExpr: String, qId: String, qMethod: String, qName: String, qTags: js.Array[String]): INxDerivedField = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any], qMethod = qMethod.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedField]
  }
  
  extension [Self <: INxDerivedField](x: Self) {
    
    inline def setQExpr(value: String): Self = StObject.set(x, "qExpr", value.asInstanceOf[js.Any])
    
    inline def setQId(value: String): Self = StObject.set(x, "qId", value.asInstanceOf[js.Any])
    
    inline def setQMethod(value: String): Self = StObject.set(x, "qMethod", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    inline def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value :_*))
  }
}
