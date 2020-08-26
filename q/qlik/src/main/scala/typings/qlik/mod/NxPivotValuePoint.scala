package typings.qlik.mod

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

@js.native
trait NxPivotValuePoint extends js.Object {
  var qAttrExps: NxAttributeExpressionValues = js.native
  var qLabel: js.UndefOr[String] = js.native
  var qNum: Double = js.native
  var qText: String = js.native
  var qType: V | E | N | T | P | R | U = js.native
}

object NxPivotValuePoint {
  @scala.inline
  def apply(
    qAttrExps: NxAttributeExpressionValues,
    qNum: Double,
    qText: String,
    qType: V | E | N | T | P | R | U
  ): NxPivotValuePoint = {
    val __obj = js.Dynamic.literal(qAttrExps = qAttrExps.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotValuePoint]
  }
  @scala.inline
  implicit class NxPivotValuePointOps[Self <: NxPivotValuePoint] (val x: Self) extends AnyVal {
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
    def setQAttrExps(value: NxAttributeExpressionValues): Self = this.set("qAttrExps", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNum(value: Double): Self = this.set("qNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
    @scala.inline
    def setQType(value: V | E | N | T | P | R | U): Self = this.set("qType", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLabel(value: String): Self = this.set("qLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQLabel: Self = this.set("qLabel", js.undefined)
  }
  
}

