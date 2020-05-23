package typings.reduxSagaRoutines.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in redux-saga-routines.redux-saga-routines.RoutineStages ]: string} */
trait keyinRoutineStagesstring extends js.Object {
  var FAILURE: String
  var FULFILL: String
  var REQUEST: String
  var SUCCESS: String
  var TRIGGER: String
}

object keyinRoutineStagesstring {
  @scala.inline
  def apply(FAILURE: String, FULFILL: String, REQUEST: String, SUCCESS: String, TRIGGER: String): keyinRoutineStagesstring = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE.asInstanceOf[js.Any], FULFILL = FULFILL.asInstanceOf[js.Any], REQUEST = REQUEST.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any], TRIGGER = TRIGGER.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinRoutineStagesstring]
  }
}

