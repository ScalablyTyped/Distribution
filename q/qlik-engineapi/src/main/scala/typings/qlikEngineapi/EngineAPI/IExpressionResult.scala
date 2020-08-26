package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExpressionResult...
  */
@js.native
trait IExpressionResult extends js.Object {
  var qBadFieldNames: js.Array[INxRange] = js.native
}

object IExpressionResult {
  @scala.inline
  def apply(qBadFieldNames: js.Array[INxRange]): IExpressionResult = {
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpressionResult]
  }
  @scala.inline
  implicit class IExpressionResultOps[Self <: IExpressionResult] (val x: Self) extends AnyVal {
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
    def setQBadFieldNamesVarargs(value: INxRange*): Self = this.set("qBadFieldNames", js.Array(value :_*))
    @scala.inline
    def setQBadFieldNames(value: js.Array[INxRange]): Self = this.set("qBadFieldNames", value.asInstanceOf[js.Any])
  }
  
}

