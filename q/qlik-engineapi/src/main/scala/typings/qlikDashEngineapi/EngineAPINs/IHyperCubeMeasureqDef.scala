package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HyperCubeMeasureqDef with extend of NxInlineMeasureDef
  */
trait IHyperCubeMeasureqDef extends INxInlineMeasureDef {
  var autoSort: js.UndefOr[Boolean] = js.undefined
  var cId: js.UndefOr[String] = js.undefined
  var numFormatFromTemplate: js.UndefOr[Boolean] = js.undefined
}

object IHyperCubeMeasureqDef {
  @scala.inline
  def apply(
    qDef: String,
    autoSort: js.UndefOr[Boolean] = js.undefined,
    cId: String = null,
    numFormatFromTemplate: js.UndefOr[Boolean] = js.undefined,
    qAccumulate: Int | Double = null,
    qActiveExpression: Int | Double = null,
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
  ): IHyperCubeMeasureqDef = {
    val __obj = js.Dynamic.literal(qDef = qDef)
    if (!js.isUndefined(autoSort)) __obj.updateDynamic("autoSort")(autoSort)
    if (cId != null) __obj.updateDynamic("cId")(cId)
    if (!js.isUndefined(numFormatFromTemplate)) __obj.updateDynamic("numFormatFromTemplate")(numFormatFromTemplate)
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
    __obj.asInstanceOf[IHyperCubeMeasureqDef]
  }
}

