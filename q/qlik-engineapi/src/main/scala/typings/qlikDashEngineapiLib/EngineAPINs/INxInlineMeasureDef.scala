package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxInlineMeasureDef...
  */
trait INxInlineMeasureDef extends js.Object {
  /**
    * - 0 means no accumulation
    * - 1 means full accumulation (each y-value accumulates all previous y-values of the expression)
    * - = 2 means accumulate as many steps as the qAccumulate value
    * >> This parameter is optional.
    * >> Default is 0.
    */
  var qAccumulate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Index of the active expression in a cyclic measure. The indexing starts from 0.
    * This parameter is optional.
    * >> The default value is 0.
    */
  var qActiveExpression: js.UndefOr[scala.Double] = js.undefined
  /**
    * Aggregate function.
    * For more information on the aggregate function syntax, see the section Working with Qlik Sense
    * on the online help portal.
    * The default value is 0 (Sum of rows)
    * >> This parameter is optional.
    */
  var qAggrFunc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to true, the sum of rows total should be used rather than real expression total.
    * This parameter is optional and applies to straight tables.
    * If using the Qlik Sense interface, it means that the total mode is set to Expression Total.
    * >> Default is false.
    */
  var qBrutalSum: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Definition of the expression in the measure.
    * Example: Sum (OrderTotal)
    * >> This parameter is mandatory.
    */
  var qDef: java.lang.String
  /**
    * Description of the measure.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of expressions. This parameter is used in case of cyclic measures (qGrouping is C).
    * List of the expressions in the cyclic group.
    */
  var qExpressions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Default value is no grouping.
    * >> This parameter is optional.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.undefined
  /**
    * Name of the measure.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label expression.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qLabelExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Format of the field.
    * >> This parameter is optional.
    */
  var qNumFormat: js.UndefOr[IFieldAttributes] = js.undefined
  /**
    * If set to true, percentage values are returned instead of absolute numbers.
    * >> This parameter is optional.
    * >> Default is false.
    */
  var qRelative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name connected to the measure that is used for search purposes.
    * >> This parameter is optional.
    * A measure can have several tags.
    */
  var qTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object INxInlineMeasureDef {
  @scala.inline
  def apply(
    qDef: java.lang.String,
    qAccumulate: scala.Int | scala.Double = null,
    qActiveExpression: scala.Int | scala.Double = null,
    qAggrFunc: java.lang.String = null,
    qBrutalSum: js.UndefOr[scala.Boolean] = js.undefined,
    qDescription: java.lang.String = null,
    qExpressions: js.Array[java.lang.String] = null,
    qGrouping: NxGrpType = null,
    qLabel: java.lang.String = null,
    qLabelExpression: java.lang.String = null,
    qNumFormat: IFieldAttributes = null,
    qRelative: js.UndefOr[scala.Boolean] = js.undefined,
    qReverseSort: js.UndefOr[scala.Boolean] = js.undefined,
    qTags: js.Array[java.lang.String] = null
  ): INxInlineMeasureDef = {
    val __obj = js.Dynamic.literal(qDef = qDef)
    if (qAccumulate != null) __obj.updateDynamic("qAccumulate")(qAccumulate.asInstanceOf[js.Any])
    if (qActiveExpression != null) __obj.updateDynamic("qActiveExpression")(qActiveExpression.asInstanceOf[js.Any])
    if (qAggrFunc != null) __obj.updateDynamic("qAggrFunc")(qAggrFunc)
    if (!js.isUndefined(qBrutalSum)) __obj.updateDynamic("qBrutalSum")(qBrutalSum)
    if (qDescription != null) __obj.updateDynamic("qDescription")(qDescription)
    if (qExpressions != null) __obj.updateDynamic("qExpressions")(qExpressions)
    if (qGrouping != null) __obj.updateDynamic("qGrouping")(qGrouping.asInstanceOf[js.Any])
    if (qLabel != null) __obj.updateDynamic("qLabel")(qLabel)
    if (qLabelExpression != null) __obj.updateDynamic("qLabelExpression")(qLabelExpression)
    if (qNumFormat != null) __obj.updateDynamic("qNumFormat")(qNumFormat)
    if (!js.isUndefined(qRelative)) __obj.updateDynamic("qRelative")(qRelative)
    if (!js.isUndefined(qReverseSort)) __obj.updateDynamic("qReverseSort")(qReverseSort)
    if (qTags != null) __obj.updateDynamic("qTags")(qTags)
    __obj.asInstanceOf[INxInlineMeasureDef]
  }
}

