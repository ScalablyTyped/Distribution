package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxDerivedField...
  */
@js.native
trait INxDerivedField extends StObject {
  
  /**
    * Expression of the derived field.
    * Example:
    * If qName is OrderDate.MyDefinition.Year,
    * the expression is as follows:
    *
    * =${Mydefinition(OrderDate).Year}
    */
  var qExpr: String = js.native
  
  /**
    * Identifier of the derived field.
    * >> The identifier is unique.
    */
  var qId: String = js.native
  
  /**
    * Method name associated to the derived field.
    */
  var qMethod: String = js.native
  
  /**
    * Combination of field name, definition and method.
    * Example:
    * OrderDate.MyDefinition.Year
    */
  var qName: String = js.native
  
  /**
    * List of tags.
    */
  var qTags: js.Array[String] = js.native
}
object INxDerivedField {
  
  @scala.inline
  def apply(qExpr: String, qId: String, qMethod: String, qName: String, qTags: js.Array[String]): INxDerivedField = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any], qMethod = qMethod.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedField]
  }
  
  @scala.inline
  implicit class INxDerivedFieldMutableBuilder[Self <: INxDerivedField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQExpr(value: String): Self = StObject.set(x, "qExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQId(value: String): Self = StObject.set(x, "qId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMethod(value: String): Self = StObject.set(x, "qMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value :_*))
  }
}
