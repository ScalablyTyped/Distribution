package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxDerivedField...
  */
@js.native
trait INxDerivedField extends js.Object {
  
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
  implicit class INxDerivedFieldOps[Self <: INxDerivedField] (val x: Self) extends AnyVal {
    
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
    def setQExpr(value: String): Self = this.set("qExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQId(value: String): Self = this.set("qId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMethod(value: String): Self = this.set("qMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTagsVarargs(value: String*): Self = this.set("qTags", js.Array(value :_*))
    
    @scala.inline
    def setQTags(value: js.Array[String]): Self = this.set("qTags", value.asInstanceOf[js.Any])
  }
}
