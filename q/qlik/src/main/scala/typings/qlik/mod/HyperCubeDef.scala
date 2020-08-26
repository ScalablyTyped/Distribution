package typings.qlik.mod

import typings.qlik.qlikNumbers.`-1`
import typings.qlik.qlikNumbers.`0`
import typings.qlik.qlikNumbers.`1`
import typings.qlik.qlikStrings.K
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.S
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperCubeDef extends js.Object {
  var qAlwaysFullyExpanded: js.UndefOr[Boolean] = js.native
  var qCalcCond: js.UndefOr[ValueExpr] = js.native
  var qDimensions: js.UndefOr[js.Array[NxDimension]] = js.native
  var qIndentMode: js.UndefOr[Boolean] = js.native
  var qInitialDataFetch: js.UndefOr[js.Array[NxPage]] = js.native
  var qInterColumnSortOrder: js.UndefOr[js.Array[Double]] = js.native
  var qMaxStackedCells: js.UndefOr[Double] = js.native
  var qMeasures: js.UndefOr[js.Array[NxMeasure]] = js.native
  var qMode: js.UndefOr[S | P | K] = js.native
  var qNoOfLeftDims: js.UndefOr[Double] = js.native
  var qPopulateMissing: js.UndefOr[Boolean] = js.native
  var qShowTotalsAbove: js.UndefOr[Boolean] = js.native
  var qSortByYValue: js.UndefOr[`-1` | `0` | `1`] = js.native
  var qStateName: js.UndefOr[String] = js.native
  var qSuppressZero: js.UndefOr[Boolean] = js.native
  var qSupressMissing: js.UndefOr[Boolean] = js.native
}

object HyperCubeDef {
  @scala.inline
  def apply(): HyperCubeDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperCubeDef]
  }
  @scala.inline
  implicit class HyperCubeDefOps[Self <: HyperCubeDef] (val x: Self) extends AnyVal {
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
    def setQAlwaysFullyExpanded(value: Boolean): Self = this.set("qAlwaysFullyExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQAlwaysFullyExpanded: Self = this.set("qAlwaysFullyExpanded", js.undefined)
    @scala.inline
    def setQCalcCond(value: ValueExpr): Self = this.set("qCalcCond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQCalcCond: Self = this.set("qCalcCond", js.undefined)
    @scala.inline
    def setQDimensionsVarargs(value: NxDimension*): Self = this.set("qDimensions", js.Array(value :_*))
    @scala.inline
    def setQDimensions(value: js.Array[NxDimension]): Self = this.set("qDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQDimensions: Self = this.set("qDimensions", js.undefined)
    @scala.inline
    def setQIndentMode(value: Boolean): Self = this.set("qIndentMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQIndentMode: Self = this.set("qIndentMode", js.undefined)
    @scala.inline
    def setQInitialDataFetchVarargs(value: NxPage*): Self = this.set("qInitialDataFetch", js.Array(value :_*))
    @scala.inline
    def setQInitialDataFetch(value: js.Array[NxPage]): Self = this.set("qInitialDataFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQInitialDataFetch: Self = this.set("qInitialDataFetch", js.undefined)
    @scala.inline
    def setQInterColumnSortOrderVarargs(value: Double*): Self = this.set("qInterColumnSortOrder", js.Array(value :_*))
    @scala.inline
    def setQInterColumnSortOrder(value: js.Array[Double]): Self = this.set("qInterColumnSortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQInterColumnSortOrder: Self = this.set("qInterColumnSortOrder", js.undefined)
    @scala.inline
    def setQMaxStackedCells(value: Double): Self = this.set("qMaxStackedCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQMaxStackedCells: Self = this.set("qMaxStackedCells", js.undefined)
    @scala.inline
    def setQMeasuresVarargs(value: NxMeasure*): Self = this.set("qMeasures", js.Array(value :_*))
    @scala.inline
    def setQMeasures(value: js.Array[NxMeasure]): Self = this.set("qMeasures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQMeasures: Self = this.set("qMeasures", js.undefined)
    @scala.inline
    def setQMode(value: S | P | K): Self = this.set("qMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQMode: Self = this.set("qMode", js.undefined)
    @scala.inline
    def setQNoOfLeftDims(value: Double): Self = this.set("qNoOfLeftDims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQNoOfLeftDims: Self = this.set("qNoOfLeftDims", js.undefined)
    @scala.inline
    def setQPopulateMissing(value: Boolean): Self = this.set("qPopulateMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQPopulateMissing: Self = this.set("qPopulateMissing", js.undefined)
    @scala.inline
    def setQShowTotalsAbove(value: Boolean): Self = this.set("qShowTotalsAbove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQShowTotalsAbove: Self = this.set("qShowTotalsAbove", js.undefined)
    @scala.inline
    def setQSortByYValue(value: `-1` | `0` | `1`): Self = this.set("qSortByYValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQSortByYValue: Self = this.set("qSortByYValue", js.undefined)
    @scala.inline
    def setQStateName(value: String): Self = this.set("qStateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQStateName: Self = this.set("qStateName", js.undefined)
    @scala.inline
    def setQSuppressZero(value: Boolean): Self = this.set("qSuppressZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQSuppressZero: Self = this.set("qSuppressZero", js.undefined)
    @scala.inline
    def setQSupressMissing(value: Boolean): Self = this.set("qSupressMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQSupressMissing: Self = this.set("qSupressMissing", js.undefined)
  }
  
}

