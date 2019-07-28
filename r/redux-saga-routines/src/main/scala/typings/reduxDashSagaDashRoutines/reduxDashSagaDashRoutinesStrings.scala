package typings.reduxDashSagaDashRoutines

import typings.reduxDashSagaDashRoutines.reduxDashSagaDashRoutinesMod.RoutineStages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxDashSagaDashRoutinesStrings {
  @js.native
  sealed trait FAILURE extends RoutineStages
  
  @js.native
  sealed trait FULFILL extends RoutineStages
  
  @js.native
  sealed trait REQUEST extends RoutineStages
  
  @js.native
  sealed trait Routine extends js.Object
  
  @js.native
  sealed trait SUCCESS extends RoutineStages
  
  @js.native
  sealed trait TRIGGER extends RoutineStages
  
  @scala.inline
  def FAILURE: FAILURE = "FAILURE".asInstanceOf[FAILURE]
  @scala.inline
  def FULFILL: FULFILL = "FULFILL".asInstanceOf[FULFILL]
  @scala.inline
  def REQUEST: REQUEST = "REQUEST".asInstanceOf[REQUEST]
  @scala.inline
  def Routine: Routine = "Routine".asInstanceOf[Routine]
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  @scala.inline
  def TRIGGER: TRIGGER = "TRIGGER".asInstanceOf[TRIGGER]
}

