package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxSimpleValue
  */
@js.native
trait INxSimpleValue extends js.Object {
  /**
    * Numeric value of the attribute expression.
    * This property is set to NaN (Not a Number) if the attribute expression value is not a numeric.
    * Numerical values are not returned as text.
    */
  var qNum: Double = js.native
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    */
  var qText: js.UndefOr[String] = js.native
}

object INxSimpleValue {
  @scala.inline
  def apply(qNum: Double): INxSimpleValue = {
    val __obj = js.Dynamic.literal(qNum = qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSimpleValue]
  }
  @scala.inline
  implicit class INxSimpleValueOps[Self <: INxSimpleValue] (val x: Self) extends AnyVal {
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
    def setQNum(value: Double): Self = this.set("qNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQText: Self = this.set("qText", js.undefined)
  }
  
}

