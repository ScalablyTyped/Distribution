package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxInlineMeasureDef...
  */
@js.native
trait INxInlineMeasureDef extends js.Object {
  /**
    * - 0 means no accumulation
    * - 1 means full accumulation (each y-value accumulates all previous y-values of the expression)
    * - = 2 means accumulate as many steps as the qAccumulate value
    * >> This parameter is optional.
    * >> Default is 0.
    */
  var qAccumulate: js.UndefOr[Double] = js.native
  /**
    * Index of the active expression in a cyclic measure. The indexing starts from 0.
    * This parameter is optional.
    * >> The default value is 0.
    */
  var qActiveExpression: js.UndefOr[Double] = js.native
  /**
    * Aggregate function.
    * For more information on the aggregate function syntax, see the section Working with Qlik Sense
    * on the online help portal.
    * The default value is 0 (Sum of rows)
    * >> This parameter is optional.
    */
  var qAggrFunc: js.UndefOr[String] = js.native
  /**
    * If set to true, the sum of rows total should be used rather than real expression total.
    * This parameter is optional and applies to straight tables.
    * If using the Qlik Sense interface, it means that the total mode is set to Expression Total.
    * >> Default is false.
    */
  var qBrutalSum: js.UndefOr[Boolean] = js.native
  /**
    * Definition of the expression in the measure.
    * Example: Sum (OrderTotal)
    * >> This parameter is mandatory.
    */
  var qDef: String = js.native
  /**
    * Description of the measure.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qDescription: js.UndefOr[String] = js.native
  /**
    * Array of expressions. This parameter is used in case of cyclic measures (qGrouping is C).
    * List of the expressions in the cyclic group.
    */
  var qExpressions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Default value is no grouping.
    * >> This parameter is optional.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.native
  /**
    * Name of the measure.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qLabel: js.UndefOr[String] = js.native
  /**
    * Label expression.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qLabelExpression: js.UndefOr[String] = js.native
  /**
    * Format of the field.
    * >> This parameter is optional.
    */
  var qNumFormat: js.UndefOr[IFieldAttributes] = js.native
  /**
    * If set to true, percentage values are returned instead of absolute numbers.
    * >> This parameter is optional.
    * >> Default is false.
    */
  var qRelative: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: js.UndefOr[Boolean] = js.native
  /**
    * Name connected to the measure that is used for search purposes.
    * >> This parameter is optional.
    * A measure can have several tags.
    */
  var qTags: js.UndefOr[js.Array[String]] = js.native
}

object INxInlineMeasureDef {
  @scala.inline
  def apply(qDef: String): INxInlineMeasureDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxInlineMeasureDef]
  }
  @scala.inline
  implicit class INxInlineMeasureDefOps[Self <: INxInlineMeasureDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQDef(value: String): Self = this.set("qDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setQAccumulate(value: Double): Self = this.set("qAccumulate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQAccumulate: Self = this.set("qAccumulate", js.undefined)
    @scala.inline
    def setQActiveExpression(value: Double): Self = this.set("qActiveExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQActiveExpression: Self = this.set("qActiveExpression", js.undefined)
    @scala.inline
    def setQAggrFunc(value: String): Self = this.set("qAggrFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQAggrFunc: Self = this.set("qAggrFunc", js.undefined)
    @scala.inline
    def setQBrutalSum(value: Boolean): Self = this.set("qBrutalSum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQBrutalSum: Self = this.set("qBrutalSum", js.undefined)
    @scala.inline
    def setQDescription(value: String): Self = this.set("qDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQDescription: Self = this.set("qDescription", js.undefined)
    @scala.inline
    def setQExpressionsVarargs(value: String*): Self = this.set("qExpressions", js.Array(value :_*))
    @scala.inline
    def setQExpressions(value: js.Array[String]): Self = this.set("qExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQExpressions: Self = this.set("qExpressions", js.undefined)
    @scala.inline
    def setQGrouping(value: NxGrpType): Self = this.set("qGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQGrouping: Self = this.set("qGrouping", js.undefined)
    @scala.inline
    def setQLabel(value: String): Self = this.set("qLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQLabel: Self = this.set("qLabel", js.undefined)
    @scala.inline
    def setQLabelExpression(value: String): Self = this.set("qLabelExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQLabelExpression: Self = this.set("qLabelExpression", js.undefined)
    @scala.inline
    def setQNumFormat(value: IFieldAttributes): Self = this.set("qNumFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQNumFormat: Self = this.set("qNumFormat", js.undefined)
    @scala.inline
    def setQRelative(value: Boolean): Self = this.set("qRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQRelative: Self = this.set("qRelative", js.undefined)
    @scala.inline
    def setQReverseSort(value: Boolean): Self = this.set("qReverseSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQReverseSort: Self = this.set("qReverseSort", js.undefined)
    @scala.inline
    def setQTagsVarargs(value: String*): Self = this.set("qTags", js.Array(value :_*))
    @scala.inline
    def setQTags(value: js.Array[String]): Self = this.set("qTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQTags: Self = this.set("qTags", js.undefined)
  }
  
}

