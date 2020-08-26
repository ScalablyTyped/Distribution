package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxMeasure extends js.Object {
  var qAttributeDimensions: js.Array[NxAttrDimDef] = js.native
  var qAttributeExpressions: js.Array[NxAttrExprDef] = js.native
  var qCalcCond: ValueExpr = js.native
  var qDef: NxInlineMeasureDef = js.native
  var qLibraryId: String = js.native
  var qSortBy: SortCriteria = js.native
}

object NxMeasure {
  @scala.inline
  def apply(
    qAttributeDimensions: js.Array[NxAttrDimDef],
    qAttributeExpressions: js.Array[NxAttrExprDef],
    qCalcCond: ValueExpr,
    qDef: NxInlineMeasureDef,
    qLibraryId: String,
    qSortBy: SortCriteria
  ): NxMeasure = {
    val __obj = js.Dynamic.literal(qAttributeDimensions = qAttributeDimensions.asInstanceOf[js.Any], qAttributeExpressions = qAttributeExpressions.asInstanceOf[js.Any], qCalcCond = qCalcCond.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qSortBy = qSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxMeasure]
  }
  @scala.inline
  implicit class NxMeasureOps[Self <: NxMeasure] (val x: Self) extends AnyVal {
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
    def setQAttributeDimensionsVarargs(value: NxAttrDimDef*): Self = this.set("qAttributeDimensions", js.Array(value :_*))
    @scala.inline
    def setQAttributeDimensions(value: js.Array[NxAttrDimDef]): Self = this.set("qAttributeDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setQAttributeExpressionsVarargs(value: NxAttrExprDef*): Self = this.set("qAttributeExpressions", js.Array(value :_*))
    @scala.inline
    def setQAttributeExpressions(value: js.Array[NxAttrExprDef]): Self = this.set("qAttributeExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def setQCalcCond(value: ValueExpr): Self = this.set("qCalcCond", value.asInstanceOf[js.Any])
    @scala.inline
    def setQDef(value: NxInlineMeasureDef): Self = this.set("qDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLibraryId(value: String): Self = this.set("qLibraryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSortBy(value: SortCriteria): Self = this.set("qSortBy", value.asInstanceOf[js.Any])
  }
  
}

