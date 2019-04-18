package typings
package reduxDashSagaDashRoutinesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxDashSagaDashRoutinesLibStrings {
  @js.native
  sealed trait FAILURE
    extends reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.RoutineStages
  
  @js.native
  sealed trait FULFILL
    extends reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.RoutineStages
  
  @js.native
  sealed trait REQUEST
    extends reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.RoutineStages
  
  @js.native
  sealed trait Routine extends js.Object
  
  @js.native
  sealed trait SUCCESS
    extends reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.RoutineStages
  
  @js.native
  sealed trait TRIGGER
    extends reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod.RoutineStages
  
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

