package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIRFilterOptions extends AudioNodeOptions {
  var feedback: js.Array[Double] = js.native
  var feedforward: js.Array[Double] = js.native
}

object IIRFilterOptions {
  @scala.inline
  def apply(feedback: js.Array[Double], feedforward: js.Array[Double]): IIRFilterOptions = {
    val __obj = js.Dynamic.literal(feedback = feedback.asInstanceOf[js.Any], feedforward = feedforward.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIRFilterOptions]
  }
  @scala.inline
  implicit class IIRFilterOptionsOps[Self <: IIRFilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeedbackVarargs(value: Double*): Self = this.set("feedback", js.Array(value :_*))
    @scala.inline
    def setFeedback(value: js.Array[Double]): Self = this.set("feedback", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeedforwardVarargs(value: Double*): Self = this.set("feedforward", js.Array(value :_*))
    @scala.inline
    def setFeedforward(value: js.Array[Double]): Self = this.set("feedforward", value.asInstanceOf[js.Any])
  }
  
}

