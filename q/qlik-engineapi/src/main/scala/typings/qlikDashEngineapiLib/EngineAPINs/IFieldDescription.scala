package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldDescription...
  */
trait IFieldDescription extends js.Object {
  /**
    * If set to true, it means that the field has one and only one selection (not 0 and not more than 1).
    * If this property is set to true, the field cannot be cleared anymore and no more selections can be
    * performed in that field.
    * >> The default value is false.
    */
  var qAlwaysOneSelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * >> The default value is false.
    */
  var qAndMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of distinct field values.
    */
  var qCardinal: scala.Double
  /**
    * Field comment.
    */
  var qComment: java.lang.String
  /**
    * If set to true, only distinct field values are shown.
    * >> The default value is false.
    */
  var qDistinctOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Internal number of the field.
    */
  var qInternalNumber: scala.Double
  /**
    * If set to true, it means that the field is a field on the fly.
    * >> The default value is false.
    */
  var qIsDefinitionOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, it means that the field is hidden.
    * >> The default value is false.
    */
  var qIsHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, it means that the field is locked.
    * >> The default value is false.
    */
  var qIsLocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Is set to true if the value is a numeric.
    * >> The default value is false.
    */
  var qIsNumeric: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, it means that the field is a semantic.
    * >> The default value is false.
    */
  var qIsSemantic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, it means that the field is a system field.
    * >> The default value is false.
    */
  var qIsSystem: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of the field.
    */
  var qName: java.lang.String
  /**
    * List of table names.
    */
  var qSrcTables: js.Array[java.lang.String]
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[java.lang.String]
  /**
    * Total number of field values.
    */
  var qTotalCount: scala.Double
}

object IFieldDescription {
  @scala.inline
  def apply(
    qCardinal: scala.Double,
    qComment: java.lang.String,
    qInternalNumber: scala.Double,
    qName: java.lang.String,
    qSrcTables: js.Array[java.lang.String],
    qTags: js.Array[java.lang.String],
    qTotalCount: scala.Double,
    qAlwaysOneSelected: js.UndefOr[scala.Boolean] = js.undefined,
    qAndMode: js.UndefOr[scala.Boolean] = js.undefined,
    qDistinctOnly: js.UndefOr[scala.Boolean] = js.undefined,
    qIsDefinitionOnly: js.UndefOr[scala.Boolean] = js.undefined,
    qIsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    qIsLocked: js.UndefOr[scala.Boolean] = js.undefined,
    qIsNumeric: js.UndefOr[scala.Boolean] = js.undefined,
    qIsSemantic: js.UndefOr[scala.Boolean] = js.undefined,
    qIsSystem: js.UndefOr[scala.Boolean] = js.undefined
  ): IFieldDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qCardinal")(qCardinal)
    __obj.updateDynamic("qComment")(qComment)
    __obj.updateDynamic("qInternalNumber")(qInternalNumber)
    __obj.updateDynamic("qName")(qName)
    __obj.updateDynamic("qSrcTables")(qSrcTables)
    __obj.updateDynamic("qTags")(qTags)
    __obj.updateDynamic("qTotalCount")(qTotalCount)
    if (!js.isUndefined(qAlwaysOneSelected)) __obj.updateDynamic("qAlwaysOneSelected")(qAlwaysOneSelected)
    if (!js.isUndefined(qAndMode)) __obj.updateDynamic("qAndMode")(qAndMode)
    if (!js.isUndefined(qDistinctOnly)) __obj.updateDynamic("qDistinctOnly")(qDistinctOnly)
    if (!js.isUndefined(qIsDefinitionOnly)) __obj.updateDynamic("qIsDefinitionOnly")(qIsDefinitionOnly)
    if (!js.isUndefined(qIsHidden)) __obj.updateDynamic("qIsHidden")(qIsHidden)
    if (!js.isUndefined(qIsLocked)) __obj.updateDynamic("qIsLocked")(qIsLocked)
    if (!js.isUndefined(qIsNumeric)) __obj.updateDynamic("qIsNumeric")(qIsNumeric)
    if (!js.isUndefined(qIsSemantic)) __obj.updateDynamic("qIsSemantic")(qIsSemantic)
    if (!js.isUndefined(qIsSystem)) __obj.updateDynamic("qIsSystem")(qIsSystem)
    __obj.asInstanceOf[IFieldDescription]
  }
}

