package typings.reduxSagaRoutines.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failure[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] extends js.Object {
  var failure: TFailureActionCreator = js.native
  var fulfill: TFulfillActionCreator = js.native
  var request: TRequestActionCreator = js.native
  var success: TSuccessActionCreator = js.native
  var trigger: TTriggerActionCreator = js.native
}

object Failure {
  @scala.inline
  def apply[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator](
    failure: TFailureActionCreator,
    fulfill: TFulfillActionCreator,
    request: TRequestActionCreator,
    success: TSuccessActionCreator,
    trigger: TTriggerActionCreator
  ): Failure[
    TTriggerActionCreator, 
    TRequestActionCreator, 
    TSuccessActionCreator, 
    TFailureActionCreator, 
    TFulfillActionCreator
  ] = {
    val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], fulfill = fulfill.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure[
      TTriggerActionCreator, 
      TRequestActionCreator, 
      TSuccessActionCreator, 
      TFailureActionCreator, 
      TFulfillActionCreator
    ]]
  }
  @scala.inline
  implicit class FailureOps[Self <: Failure[_, _, _, _, _], TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] (val x: Self with (Failure[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ])) extends AnyVal {
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
    def setFailure(value: TFailureActionCreator): Self = this.set("failure", value.asInstanceOf[js.Any])
    @scala.inline
    def setFulfill(value: TFulfillActionCreator): Self = this.set("fulfill", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TRequestActionCreator): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: TSuccessActionCreator): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrigger(value: TTriggerActionCreator): Self = this.set("trigger", value.asInstanceOf[js.Any])
  }
  
}

