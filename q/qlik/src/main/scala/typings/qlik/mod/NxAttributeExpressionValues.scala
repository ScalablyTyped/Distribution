package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxAttributeExpressionValues extends js.Object {
  var qValues: js.Array[NxSimpleValue] = js.native
}

object NxAttributeExpressionValues {
  @scala.inline
  def apply(qValues: js.Array[NxSimpleValue]): NxAttributeExpressionValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttributeExpressionValues]
  }
  @scala.inline
  implicit class NxAttributeExpressionValuesOps[Self <: NxAttributeExpressionValues] (val x: Self) extends AnyVal {
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
    def setQValuesVarargs(value: NxSimpleValue*): Self = this.set("qValues", js.Array(value :_*))
    @scala.inline
    def setQValues(value: js.Array[NxSimpleValue]): Self = this.set("qValues", value.asInstanceOf[js.Any])
  }
  
}

