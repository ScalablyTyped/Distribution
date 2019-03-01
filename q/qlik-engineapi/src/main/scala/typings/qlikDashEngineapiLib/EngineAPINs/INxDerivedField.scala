package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qExpr: java.lang.String
  /**
    * Identifier of the derived field.
    * >> The identifier is unique.
    */
  var qId: java.lang.String
  /**
    * Method name associated to the derived field.
    */
  var qMethod: java.lang.String
  /**
    * Combination of field name, definition and method.
    * Example:
    * OrderDate.MyDefinition.Year
    */
  var qName: java.lang.String
  /**
    * List of tags.
    */
  var qTags: js.Array[java.lang.String]
}

object INxDerivedField {
  @scala.inline
  def apply(
    qExpr: java.lang.String,
    qId: java.lang.String,
    qMethod: java.lang.String,
    qName: java.lang.String,
    qTags: js.Array[java.lang.String]
  ): INxDerivedField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qExpr")(qExpr)
    __obj.updateDynamic("qId")(qId)
    __obj.updateDynamic("qMethod")(qMethod)
    __obj.updateDynamic("qName")(qName)
    __obj.updateDynamic("qTags")(qTags)
    __obj.asInstanceOf[INxDerivedField]
  }
}

