package typings.qlik.qlikMod

import typings.qlik.qlikStrings.E
import typings.qlik.qlikStrings.N
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.R
import typings.qlik.qlikStrings.T
import typings.qlik.qlikStrings.U
import typings.qlik.qlikStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxPivotDimensioncell extends js.Object {
  var qAttrDims: js.Array[NxAttributeDimValues]
  var qAttrExps: js.Array[NxAttributeExpressionValues]
  var qCanCollapse: Boolean
  var qCanExpand: Boolean
  var qDown: Double
  var qElemNo: Double
  var qSubNodes: js.Array[NxPivotDimensioncell]
  var qText: String
  var qType: V | E | N | T | P | R | U
  var qUp: Double
  var qValue: Double
}

object NxPivotDimensioncell {
  @scala.inline
  def apply(
    qAttrDims: js.Array[NxAttributeDimValues],
    qAttrExps: js.Array[NxAttributeExpressionValues],
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qSubNodes: js.Array[NxPivotDimensioncell],
    qText: String,
    qType: V | E | N | T | P | R | U,
    qUp: Double,
    qValue: Double
  ): NxPivotDimensioncell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims, qAttrExps = qAttrExps, qCanCollapse = qCanCollapse, qCanExpand = qCanExpand, qDown = qDown, qElemNo = qElemNo, qSubNodes = qSubNodes, qText = qText, qType = qType.asInstanceOf[js.Any], qUp = qUp, qValue = qValue)
  
    __obj.asInstanceOf[NxPivotDimensioncell]
  }
}

