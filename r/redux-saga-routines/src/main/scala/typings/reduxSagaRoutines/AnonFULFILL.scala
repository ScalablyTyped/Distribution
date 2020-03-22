package typings.reduxSagaRoutines

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFULFILL[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator] extends js.Object {
  var FAILURE: js.UndefOr[TFailureMetaCreator] = js.undefined
  var FULFILL: js.UndefOr[TFulfillMetaCreator] = js.undefined
  var REQUEST: js.UndefOr[TRequestMetaCreator] = js.undefined
  var SUCCESS: js.UndefOr[TSuccessMetaCreator] = js.undefined
  var TRIGGER: js.UndefOr[TTriggerMetaCreator] = js.undefined
  var failure: js.UndefOr[TFailureMetaCreator] = js.undefined
  var fulfill: js.UndefOr[TFulfillMetaCreator] = js.undefined
  var request: js.UndefOr[TRequestMetaCreator] = js.undefined
  var success: js.UndefOr[TSuccessMetaCreator] = js.undefined
  var trigger: js.UndefOr[TTriggerMetaCreator] = js.undefined
}

object AnonFULFILL {
  @scala.inline
  def apply[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    FAILURE: TFailureMetaCreator = null,
    FULFILL: TFulfillMetaCreator = null,
    REQUEST: TRequestMetaCreator = null,
    SUCCESS: TSuccessMetaCreator = null,
    TRIGGER: TTriggerMetaCreator = null,
    failure: TFailureMetaCreator = null,
    fulfill: TFulfillMetaCreator = null,
    request: TRequestMetaCreator = null,
    success: TSuccessMetaCreator = null,
    trigger: TTriggerMetaCreator = null
  ): AnonFULFILL[
    TTriggerMetaCreator, 
    TRequestMetaCreator, 
    TSuccessMetaCreator, 
    TFailureMetaCreator, 
    TFulfillMetaCreator
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
    __obj.asInstanceOf[AnonFULFILL[
  TTriggerMetaCreator, 
  TRequestMetaCreator, 
  TSuccessMetaCreator, 
  TFailureMetaCreator, 
  TFulfillMetaCreator]]
  }
}

