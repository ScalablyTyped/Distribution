package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxInlineDimensionDef...
  */
trait INxInlineDimensionDef extends js.Object {
  /**
    * Index of the active field in a cyclic dimension.
    * This parameter is optional. The default value is 0.
    * This parameter is used in case of cyclic dimensions (qGrouping is C).
    */
  var qActiveField: js.UndefOr[Double] = js.undefined
  /**
    * Array of field names.
    * When creating a grouped dimension, more than one field name is defined.
    * >> This parameter is optional.
    */
  var qFieldDefs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Array of field labels.
    * >> This parameter is optional.
    */
  var qFieldLabels: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Used to define a cyclic group or drill-down group.
    * This parameter is optional.
    * Default value is no grouping.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.undefined
  /**
    * Defines the format of the value.
    * >> This parameter is optional.
    */
  var qNumberPresentations: js.UndefOr[js.Array[IFieldAttributes]] = js.undefined
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the sorting criteria in the field.
    * >>This parameter is optional.
    * Default is to sort by alphabetical order, ascending.
    */
  var qSortCriterias: js.UndefOr[ISortCriteria] = js.undefined
}

object INxInlineDimensionDef {
  @scala.inline
  def apply(
    qActiveField: Int | Double = null,
    qFieldDefs: js.Array[String] = null,
    qFieldLabels: js.Array[String] = null,
    qGrouping: NxGrpType = null,
    qNumberPresentations: js.Array[IFieldAttributes] = null,
    qReverseSort: js.UndefOr[Boolean] = js.undefined,
    qSortCriterias: ISortCriteria = null
  ): INxInlineDimensionDef = {
    val __obj = js.Dynamic.literal()
    if (qActiveField != null) __obj.updateDynamic("qActiveField")(qActiveField.asInstanceOf[js.Any])
    if (qFieldDefs != null) __obj.updateDynamic("qFieldDefs")(qFieldDefs)
    if (qFieldLabels != null) __obj.updateDynamic("qFieldLabels")(qFieldLabels)
    if (qGrouping != null) __obj.updateDynamic("qGrouping")(qGrouping.asInstanceOf[js.Any])
    if (qNumberPresentations != null) __obj.updateDynamic("qNumberPresentations")(qNumberPresentations)
    if (!js.isUndefined(qReverseSort)) __obj.updateDynamic("qReverseSort")(qReverseSort)
    if (qSortCriterias != null) __obj.updateDynamic("qSortCriterias")(qSortCriterias)
    __obj.asInstanceOf[INxInlineDimensionDef]
  }
}

