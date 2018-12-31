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

