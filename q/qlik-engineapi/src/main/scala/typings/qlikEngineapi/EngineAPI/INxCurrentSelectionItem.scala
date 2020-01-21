package typings.qlikEngineapi.EngineAPI

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
  var qField: String
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Is set to true if the field is a numeric.
    */
  var qIsNum: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Is set to true if the field is locked.
    */
  var qLocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Information about the fields that are not selected.
    */
  var qNotSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo]
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Property that is set to a field. Is set to true if the field cannot be unselected.
    */
  var qOneAndOnlyOne: js.UndefOr[Boolean] = js.undefined
  /**
    * Information about the range of selected values.
    * Is empty if there is no range of selected values.
    */
  var qRangeInfo: js.Array[IRangeSelectInfo]
  /**
    * Label that, if defined, is displayed in current selections instead of the actual expression.
    */
  var qReadableName: String
  /**
    * Values that are selected.
    */
  var qSelected: String
  /**
    * Number of values that are selected.
    */
  var qSelectedCount: Double
  /**
    * Information about the fields that are selected.
    */
  var qSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo]
  /**
    * Maximum values to show in the current selections.
    * >> The default value is 6.
    */
  var qSelectionThreshold: Double
  /**
    * Sort index of the field. Indexing starts from 0.
    */
  var qSortIndex: Double
  /**
    * Number of values in a particular state.
    */
  var qStateCounts: INxStateCounts
  /**
    * Optional parameter.
    * Text that was used for the search.
    * This parameter is filled when searching for a value and selecting it.
    */
  var qTextSearch: js.UndefOr[String] = js.undefined
  /**
    * Number of values in the field.
    */
  var qTotal: Double
}

object INxCurrentSelectionItem {
  @scala.inline
  def apply(
    qField: String,
    qNotSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo],
    qRangeInfo: js.Array[IRangeSelectInfo],
    qReadableName: String,
    qSelected: String,
    qSelectedCount: Double,
    qSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo],
    qSelectionThreshold: Double,
    qSortIndex: Double,
    qStateCounts: INxStateCounts,
    qTotal: Double,
    qIsNum: js.UndefOr[Boolean] = js.undefined,
    qLocked: js.UndefOr[Boolean] = js.undefined,
    qOneAndOnlyOne: js.UndefOr[Boolean] = js.undefined,
    qTextSearch: String = null
  ): INxCurrentSelectionItem = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qNotSelectedFieldSelectionInfo = qNotSelectedFieldSelectionInfo.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qReadableName = qReadableName.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedCount = qSelectedCount.asInstanceOf[js.Any], qSelectedFieldSelectionInfo = qSelectedFieldSelectionInfo.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTotal = qTotal.asInstanceOf[js.Any])
    if (!js.isUndefined(qIsNum)) __obj.updateDynamic("qIsNum")(qIsNum.asInstanceOf[js.Any])
    if (!js.isUndefined(qLocked)) __obj.updateDynamic("qLocked")(qLocked.asInstanceOf[js.Any])
    if (!js.isUndefined(qOneAndOnlyOne)) __obj.updateDynamic("qOneAndOnlyOne")(qOneAndOnlyOne.asInstanceOf[js.Any])
    if (qTextSearch != null) __obj.updateDynamic("qTextSearch")(qTextSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxCurrentSelectionItem]
  }
}

