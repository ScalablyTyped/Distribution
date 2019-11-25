package typings.qlikDashEngineapi.EngineAPI

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
  var qAlwaysOneSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * >> The default value is false.
    */
  var qAndMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of distinct field values.
    */
  var qCardinal: Double
  /**
    * Field comment.
    */
  var qComment: String
  /**
    * If set to true, only distinct field values are shown.
    * >> The default value is false.
    */
  var qDistinctOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Internal number of the field.
    */
  var qInternalNumber: Double
  /**
    * If set to true, it means that the field is a field on the fly.
    * >> The default value is false.
    */
  var qIsDefinitionOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, it means that the field is hidden.
    * >> The default value is false.
    */
  var qIsHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, it means that the field is locked.
    * >> The default value is false.
    */
  var qIsLocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Is set to true if the value is a numeric.
    * >> The default value is false.
    */
  var qIsNumeric: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, it means that the field is a semantic.
    * >> The default value is false.
    */
  var qIsSemantic: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, it means that the field is a system field.
    * >> The default value is false.
    */
  var qIsSystem: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the field.
    */
  var qName: String
  /**
    * List of table names.
    */
  var qSrcTables: js.Array[String]
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[String]
  /**
    * Total number of field values.
    */
  var qTotalCount: Double
}

object IFieldDescription {
  @scala.inline
  def apply(
    qCardinal: Double,
    qComment: String,
    qInternalNumber: Double,
    qName: String,
    qSrcTables: js.Array[String],
    qTags: js.Array[String],
    qTotalCount: Double,
    qAlwaysOneSelected: js.UndefOr[Boolean] = js.undefined,
    qAndMode: js.UndefOr[Boolean] = js.undefined,
    qDistinctOnly: js.UndefOr[Boolean] = js.undefined,
    qIsDefinitionOnly: js.UndefOr[Boolean] = js.undefined,
    qIsHidden: js.UndefOr[Boolean] = js.undefined,
    qIsLocked: js.UndefOr[Boolean] = js.undefined,
    qIsNumeric: js.UndefOr[Boolean] = js.undefined,
    qIsSemantic: js.UndefOr[Boolean] = js.undefined,
    qIsSystem: js.UndefOr[Boolean] = js.undefined
  ): IFieldDescription = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qComment = qComment.asInstanceOf[js.Any], qInternalNumber = qInternalNumber.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qSrcTables = qSrcTables.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any], qTotalCount = qTotalCount.asInstanceOf[js.Any])
    if (!js.isUndefined(qAlwaysOneSelected)) __obj.updateDynamic("qAlwaysOneSelected")(qAlwaysOneSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(qAndMode)) __obj.updateDynamic("qAndMode")(qAndMode.asInstanceOf[js.Any])
    if (!js.isUndefined(qDistinctOnly)) __obj.updateDynamic("qDistinctOnly")(qDistinctOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(qIsDefinitionOnly)) __obj.updateDynamic("qIsDefinitionOnly")(qIsDefinitionOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(qIsHidden)) __obj.updateDynamic("qIsHidden")(qIsHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(qIsLocked)) __obj.updateDynamic("qIsLocked")(qIsLocked.asInstanceOf[js.Any])
    if (!js.isUndefined(qIsNumeric)) __obj.updateDynamic("qIsNumeric")(qIsNumeric.asInstanceOf[js.Any])
    if (!js.isUndefined(qIsSemantic)) __obj.updateDynamic("qIsSemantic")(qIsSemantic.asInstanceOf[js.Any])
    if (!js.isUndefined(qIsSystem)) __obj.updateDynamic("qIsSystem")(qIsSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldDescription]
  }
}

