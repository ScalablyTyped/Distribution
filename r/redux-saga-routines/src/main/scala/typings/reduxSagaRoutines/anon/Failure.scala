package typings.reduxSagaRoutines.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failure[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] extends js.Object {
  var failure: TFailureActionCreator
  var fulfill: TFulfillActionCreator
  var request: TRequestActionCreator
  var success: TSuccessActionCreator
  var trigger: TTriggerActionCreator
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
}

