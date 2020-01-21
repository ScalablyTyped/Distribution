package typings.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER
  - typings.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST
  - typings.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS
  - typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE
  - typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL
*/
trait RoutineStages extends js.Object

object RoutineStages {
  @scala.inline
  def FAILURE: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE = this.cast("FAILURE")
  @scala.inline
  def FULFILL: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL = this.cast("FULFILL")
  @scala.inline
  def REQUEST: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST = this.cast("REQUEST")
  @scala.inline
  def SUCCESS: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  def TRIGGER: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER = this.cast("TRIGGER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

