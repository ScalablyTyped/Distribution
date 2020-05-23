package typings.qlikEngineapi.EngineAPI

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
  var qAccumulate: js.UndefOr[Double] = js.undefined
  /**
    * Index of the active expression in a cyclic measure. The indexing starts from 0.
    * This parameter is optional.
    * >> The default value is 0.
    */
  var qActiveExpression: js.UndefOr[Double] = js.undefined
  /**
    * Aggregate function.
    * For more information on the aggregate function syntax, see the section Working with Qlik Sense
    * on the online help portal.
    * The default value is 0 (Sum of rows)
    * >> This parameter is optional.
    */
  var qAggrFunc: js.UndefOr[String] = js.undefined
  /**
    * If set to true, the sum of rows total should be used rather than real expression total.
    * This parameter is optional and applies to straight tables.
    * If using the Qlik Sense interface, it means that the total mode is set to Expression Total.
    * >> Default is false.
    */
  var qBrutalSum: js.UndefOr[Boolean] = js.undefined
  /**
    * Definition of the expression in the measure.
    * Example: Sum (OrderTotal)
    * >> This parameter is mandatory.
    */
  var qDef: String
  /**
    * Description of the measure.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qDescription: js.UndefOr[String] = js.undefined
  /**
    * Array of expressions. This parameter is used in case of cyclic measures (qGrouping is C).
    * List of the expressions in the cyclic group.
    */
  var qExpressions: js.UndefOr[js.Array[String]] = js.undefined
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
  var qLabel: js.UndefOr[String] = js.undefined
  /**
    * Label expression.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qLabelExpression: js.UndefOr[String] = js.undefined
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
  var qRelative: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: js.UndefOr[Boolean] = js.undefined
  /**
    * Name connected to the measure that is used for search purposes.
    * >> This parameter is optional.
    * A measure can have several tags.
    */
  var qTags: js.UndefOr[js.Array[String]] = js.undefined
}

object INxInlineMeasureDef {
  @scala.inline
  def apply(
    qDef: String,
    qAccumulate: js.UndefOr[Double] = js.undefined,
    qActiveExpression: js.UndefOr[Double] = js.undefined,
    qAggrFunc: String = null,
    qBrutalSum: js.UndefOr[Boolean] = js.undefined,
    qDescription: String = null,
    qExpressions: js.Array[String] = null,
    qGrouping: NxGrpType = null,
    qLabel: String = null,
    qLabelExpression: String = null,
    qNumFormat: IFieldAttributes = null,
    qRelative: js.UndefOr[Boolean] = js.undefined,
    qReverseSort: js.UndefOr[Boolean] = js.undefined,
    qTags: js.Array[String] = null
  ): INxInlineMeasureDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    if (!js.isUndefined(qAccumulate)) __obj.updateDynamic("qAccumulate")(qAccumulate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qActiveExpression)) __obj.updateDynamic("qActiveExpression")(qActiveExpression.get.asInstanceOf[js.Any])
    if (qAggrFunc != null) __obj.updateDynamic("qAggrFunc")(qAggrFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(qBrutalSum)) __obj.updateDynamic("qBrutalSum")(qBrutalSum.get.asInstanceOf[js.Any])
    if (qDescription != null) __obj.updateDynamic("qDescription")(qDescription.asInstanceOf[js.Any])
    if (qExpressions != null) __obj.updateDynamic("qExpressions")(qExpressions.asInstanceOf[js.Any])
    if (qGrouping != null) __obj.updateDynamic("qGrouping")(qGrouping.asInstanceOf[js.Any])
    if (qLabel != null) __obj.updateDynamic("qLabel")(qLabel.asInstanceOf[js.Any])
    if (qLabelExpression != null) __obj.updateDynamic("qLabelExpression")(qLabelExpression.asInstanceOf[js.Any])
    if (qNumFormat != null) __obj.updateDynamic("qNumFormat")(qNumFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(qRelative)) __obj.updateDynamic("qRelative")(qRelative.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qReverseSort)) __obj.updateDynamic("qReverseSort")(qReverseSort.get.asInstanceOf[js.Any])
    if (qTags != null) __obj.updateDynamic("qTags")(qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxInlineMeasureDef]
  }
}

