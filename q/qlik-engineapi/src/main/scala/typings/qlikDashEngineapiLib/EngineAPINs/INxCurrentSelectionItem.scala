package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxCurrentSelectionItem...
  */
trait INxCurrentSelectionItem extends js.Object {
  /**
    * Name of the field that is selected.
    */
  var qField: java.lang.String
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Is set to true if the field is a numeric.
    */
  var qIsNum: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Is set to true if the field is locked.
    */
  var qLocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Information about the fields that are not selected.
    */
  var qNotSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo]
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Property that is set to a field. Is set to true if the field cannot be unselected.
    */
  var qOneAndOnlyOne: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Information about the range of selected values.
    * Is empty if there is no range of selected values.
    */
  var qRangeInfo: js.Array[IRangeSelectInfo]
  /**
    * Label that, if defined, is displayed in current selections instead of the actual expression.
    */
  var qReadableName: java.lang.String
  /**
    * Values that are selected.
    */
  var qSelected: java.lang.String
  /**
    * Number of values that are selected.
    */
  var qSelectedCount: scala.Double
  /**
    * Information about the fields that are selected.
    */
  var qSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo]
  /**
    * Maximum values to show in the current selections.
    * >> The default value is 6.
    */
  var qSelectionThreshold: scala.Double
  /**
    * Sort index of the field. Indexing starts from 0.
    */
  var qSortIndex: scala.Double
  /**
    * Number of values in a particular state.
    */
  var qStateCounts: INxStateCounts
  /**
    * Optional parameter.
    * Text that was used for the search.
    * This parameter is filled when searching for a value and selecting it.
    */
  var qTextSearch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of values in the field.
    */
  var qTotal: scala.Double
}

