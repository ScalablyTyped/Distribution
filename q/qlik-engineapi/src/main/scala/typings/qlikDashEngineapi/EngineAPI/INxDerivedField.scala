package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDerivedField...
  */
trait INxDerivedField extends js.Object {
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
  @scala.inline
  def apply(qExpr: String, qId: String, qMethod: String, qName: String, qTags: js.Array[String]): INxDerivedField = {
    val __obj = js.Dynamic.literal(qExpr = qExpr, qId = qId, qMethod = qMethod, qName = qName, qTags = qTags)
  
    __obj.asInstanceOf[INxDerivedField]
  }
}

