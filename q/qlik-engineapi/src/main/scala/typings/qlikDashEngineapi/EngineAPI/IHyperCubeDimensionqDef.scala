package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HyperCubeDimensionqDef width extend NxInlineDimensionDef
  */
trait IHyperCubeDimensionqDef extends INxInlineDimensionDef {
  var autoSort: js.UndefOr[Boolean] = js.undefined
  var cId: js.UndefOr[String] = js.undefined
  var othersLabel: js.UndefOr[IStringExpressionContainer] = js.undefined
}

object IHyperCubeDimensionqDef {
  @scala.inline
  def apply(
    autoSort: js.UndefOr[Boolean] = js.undefined,
    cId: String = null,
    othersLabel: IStringExpressionContainer = null,
    qActiveField: Int | Double = null,
    qFieldDefs: js.Array[String] = null,
    qFieldLabels: js.Array[String] = null,
    qGrouping: NxGrpType = null,
    qNumberPresentations: js.Array[IFieldAttributes] = null,
    qReverseSort: js.UndefOr[Boolean] = js.undefined,
    qSortCriterias: ISortCriteria = null
  ): IHyperCubeDimensionqDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSort)) __obj.updateDynamic("autoSort")(autoSort.asInstanceOf[js.Any])
    if (cId != null) __obj.updateDynamic("cId")(cId.asInstanceOf[js.Any])
    if (othersLabel != null) __obj.updateDynamic("othersLabel")(othersLabel.asInstanceOf[js.Any])
    if (qActiveField != null) __obj.updateDynamic("qActiveField")(qActiveField.asInstanceOf[js.Any])
    if (qFieldDefs != null) __obj.updateDynamic("qFieldDefs")(qFieldDefs.asInstanceOf[js.Any])
    if (qFieldLabels != null) __obj.updateDynamic("qFieldLabels")(qFieldLabels.asInstanceOf[js.Any])
    if (qGrouping != null) __obj.updateDynamic("qGrouping")(qGrouping.asInstanceOf[js.Any])
    if (qNumberPresentations != null) __obj.updateDynamic("qNumberPresentations")(qNumberPresentations.asInstanceOf[js.Any])
    if (!js.isUndefined(qReverseSort)) __obj.updateDynamic("qReverseSort")(qReverseSort.asInstanceOf[js.Any])
    if (qSortCriterias != null) __obj.updateDynamic("qSortCriterias")(qSortCriterias.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeDimensionqDef]
  }
}

