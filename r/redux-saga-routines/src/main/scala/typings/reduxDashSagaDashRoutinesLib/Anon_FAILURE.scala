package typings
package reduxDashSagaDashRoutinesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FAILURE[TRequestPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator, TSuccessPayloadCreator, TTriggerPayloadCreator] extends js.Object {
  var FAILURE: js.UndefOr[TFailurePayloadCreator] = js.undefined
  var FULFILL: js.UndefOr[TFulfillPayloadCreator] = js.undefined
  var REQUEST: js.UndefOr[TRequestPayloadCreator] = js.undefined
  var SUCCESS: js.UndefOr[TSuccessPayloadCreator] = js.undefined
  var TRIGGER: js.UndefOr[TTriggerPayloadCreator] = js.undefined
  var failure: js.UndefOr[TFailurePayloadCreator] = js.undefined
  var fulfill: js.UndefOr[TFulfillPayloadCreator] = js.undefined
  var request: js.UndefOr[TRequestPayloadCreator] = js.undefined
  var success: js.UndefOr[TSuccessPayloadCreator] = js.undefined
  var trigger: js.UndefOr[TTriggerPayloadCreator] = js.undefined
}

trait Anon_Failure[TFulfillActionCreator, TFailureActionCreator, TRequestActionCreator, TTriggerActionCreator, TSuccessActionCreator] extends js.Object {
  var failure: TFailureActionCreator
  var fulfill: TFulfillActionCreator
  var request: TRequestActionCreator
  var success: TSuccessActionCreator
  var trigger: TTriggerActionCreator
}

object Anon_FAILURE {
  @scala.inline
  def apply[TRequestPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator, TSuccessPayloadCreator, TTriggerPayloadCreator](
    FAILURE: TFailurePayloadCreator = null,
    FULFILL: TFulfillPayloadCreator = null,
    REQUEST: TRequestPayloadCreator = null,
    SUCCESS: TSuccessPayloadCreator = null,
    TRIGGER: TTriggerPayloadCreator = null,
    failure: TFailurePayloadCreator = null,
    fulfill: TFulfillPayloadCreator = null,
    request: TRequestPayloadCreator = null,
    success: TSuccessPayloadCreator = null,
    trigger: TTriggerPayloadCreator = null
  ): Anon_FAILURE[
    TRequestPayloadCreator, 
    TFailurePayloadCreator, 
    TFulfillPayloadCreator, 
    TSuccessPayloadCreator, 
    TTriggerPayloadCreator
  ] = {
    val __obj = js.Dynamic.literal()
    if (FAILURE != null) __obj.updateDynamic("FAILURE")(FAILURE.asInstanceOf[js.Any])
    if (FULFILL != null) __obj.updateDynamic("FULFILL")(FULFILL.asInstanceOf[js.Any])
    if (REQUEST != null) __obj.updateDynamic("REQUEST")(REQUEST.asInstanceOf[js.Any])
    if (SUCCESS != null) __obj.updateDynamic("SUCCESS")(SUCCESS.asInstanceOf[js.Any])
    if (TRIGGER != null) __obj.updateDynamic("TRIGGER")(TRIGGER.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (fulfill != null) __obj.updateDynamic("fulfill")(fulfill.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FAILURE[
  TRequestPayloadCreator, 
  TFailurePayloadCreator, 
  TFulfillPayloadCreator, 
  TSuccessPayloadCreator, 
  TTriggerPayloadCreator]]
  }
}

object Anon_Failure {
  @scala.inline
  def apply[TFulfillActionCreator, TFailureActionCreator, TRequestActionCreator, TTriggerActionCreator, TSuccessActionCreator](
    failure: TFailureActionCreator,
    fulfill: TFulfillActionCreator,
    request: TRequestActionCreator,
    success: TSuccessActionCreator,
    trigger: TTriggerActionCreator
  ): Anon_Failure[
    TFulfillActionCreator, 
    TFailureActionCreator, 
    TRequestActionCreator, 
    TTriggerActionCreator, 
    TSuccessActionCreator
  ] = {
    val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], fulfill = fulfill.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Failure[
  TFulfillActionCreator, 
  TFailureActionCreator, 
  TRequestActionCreator, 
  TTriggerActionCreator, 
  TSuccessActionCreator]]
  }
}

