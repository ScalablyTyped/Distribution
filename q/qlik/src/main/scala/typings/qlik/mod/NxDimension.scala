package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxDimension extends js.Object {
  var qAttributeDimensions: js.Array[NxAttrDimDef] = js.native
  var qAttributeExpressions: js.Array[NxAttrExprDef] = js.native
  var qCalcCond: ValueExpr = js.native
  var qDef: NxInlineDimensionDef = js.native
  var qLibraryId: String = js.native
  var qNullSuppression: Boolean = js.native
  var qOtherLabel: String = js.native
  var qOtherTotalSpec: OtherTotalSpecProp = js.native
  var qShowAll: Boolean = js.native
  var qTotalLabel: String = js.native
}

object NxDimension {
  @scala.inline
  def apply(
    qAttributeDimensions: js.Array[NxAttrDimDef],
    qAttributeExpressions: js.Array[NxAttrExprDef],
    qCalcCond: ValueExpr,
    qDef: NxInlineDimensionDef,
    qLibraryId: String,
    qNullSuppression: Boolean,
    qOtherLabel: String,
    qOtherTotalSpec: OtherTotalSpecProp,
    qShowAll: Boolean,
    qTotalLabel: String
  ): NxDimension = {
    val __obj = js.Dynamic.literal(qAttributeDimensions = qAttributeDimensions.asInstanceOf[js.Any], qAttributeExpressions = qAttributeExpressions.asInstanceOf[js.Any], qCalcCond = qCalcCond.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qNullSuppression = qNullSuppression.asInstanceOf[js.Any], qOtherLabel = qOtherLabel.asInstanceOf[js.Any], qOtherTotalSpec = qOtherTotalSpec.asInstanceOf[js.Any], qShowAll = qShowAll.asInstanceOf[js.Any], qTotalLabel = qTotalLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxDimension]
  }
  @scala.inline
  implicit class NxDimensionOps[Self <: NxDimension] (val x: Self) extends AnyVal {
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
    def setQDef(value: NxInlineDimensionDef): Self = this.set("qDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLibraryId(value: String): Self = this.set("qLibraryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNullSuppression(value: Boolean): Self = this.set("qNullSuppression", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOtherLabel(value: String): Self = this.set("qOtherLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOtherTotalSpec(value: OtherTotalSpecProp): Self = this.set("qOtherTotalSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def setQShowAll(value: Boolean): Self = this.set("qShowAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTotalLabel(value: String): Self = this.set("qTotalLabel", value.asInstanceOf[js.Any])
  }
  
}

