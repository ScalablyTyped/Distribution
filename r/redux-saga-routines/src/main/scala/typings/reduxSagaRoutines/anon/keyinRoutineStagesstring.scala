package typings.reduxSagaRoutines.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in redux-saga-routines.redux-saga-routines.RoutineStages ]: string} */
@js.native
trait keyinRoutineStagesstring extends js.Object {
  var FAILURE: String = js.native
  var FULFILL: String = js.native
  var REQUEST: String = js.native
  var SUCCESS: String = js.native
  var TRIGGER: String = js.native
}

object keyinRoutineStagesstring {
  @scala.inline
  def apply(FAILURE: String, FULFILL: String, REQUEST: String, SUCCESS: String, TRIGGER: String): keyinRoutineStagesstring = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE.asInstanceOf[js.Any], FULFILL = FULFILL.asInstanceOf[js.Any], REQUEST = REQUEST.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any], TRIGGER = TRIGGER.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinRoutineStagesstring]
  }
  @scala.inline
  implicit class keyinRoutineStagesstringOps[Self <: keyinRoutineStagesstring] (val x: Self) extends AnyVal {
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
    def setFAILURE(value: String): Self = this.set("FAILURE", value.asInstanceOf[js.Any])
    @scala.inline
    def setFULFILL(value: String): Self = this.set("FULFILL", value.asInstanceOf[js.Any])
    @scala.inline
    def setREQUEST(value: String): Self = this.set("REQUEST", value.asInstanceOf[js.Any])
    @scala.inline
    def setSUCCESS(value: String): Self = this.set("SUCCESS", value.asInstanceOf[js.Any])
    @scala.inline
    def setTRIGGER(value: String): Self = this.set("TRIGGER", value.asInstanceOf[js.Any])
  }
  
}

