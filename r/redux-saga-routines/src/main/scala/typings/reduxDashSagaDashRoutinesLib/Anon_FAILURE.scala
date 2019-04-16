package typings
package reduxDashSagaDashRoutinesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FAILURE[TTriggerActionCreator] extends js.Object {
  var FAILURE: java.lang.String
  var FULFILL: java.lang.String
  var REQUEST: java.lang.String
  var SUCCESS: java.lang.String
  var TRIGGER: java.lang.String
  var failure: reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.ActionCreator
  var fulfill: reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.ActionCreator
  var request: reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.ActionCreator
  var success: reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.ActionCreator
  var trigger: TTriggerActionCreator
}

object Anon_FAILURE {
  @scala.inline
  def apply[TTriggerActionCreator](
    FAILURE: java.lang.String,
    FULFILL: java.lang.String,
    REQUEST: java.lang.String,
    SUCCESS: java.lang.String,
    TRIGGER: java.lang.String,
    failure: reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.ActionCreator,
    fulfill: reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.ActionCreator,
    request: reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.ActionCreator,
    success: reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.ActionCreator,
    trigger: TTriggerActionCreator
  ): Anon_FAILURE[TTriggerActionCreator] = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE, FULFILL = FULFILL, REQUEST = REQUEST, SUCCESS = SUCCESS, TRIGGER = TRIGGER, failure = failure.asInstanceOf[js.Any], fulfill = fulfill.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FAILURE[TTriggerActionCreator]]
  }
}

