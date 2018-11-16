package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qActiveField: js.UndefOr[scala.Double] = js.undefined
  /**
           * Array of field names.
           * When creating a grouped dimension, more than one field name is defined.
           * >> This parameter is optional.
           */
  var qFieldDefs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Array of field labels.
           * >> This parameter is optional.
           */
  var qFieldLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var qReverseSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines the sorting criteria in the field.
           * >>This parameter is optional.
           * Default is to sort by alphabetical order, ascending.
           */
  var qSortCriterias: js.UndefOr[ISortCriteria] = js.undefined
}

