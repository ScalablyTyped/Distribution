package typings.reduxSagaRoutines

import typings.reduxSagaRoutines.mod.RoutineStages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxSagaRoutinesStrings {
  
  @js.native
  sealed trait FAILURE extends RoutineStages
  @scala.inline
  def FAILURE: FAILURE = "FAILURE".asInstanceOf[FAILURE]
  
  @js.native
  sealed trait FULFILL extends RoutineStages
  @scala.inline
  def FULFILL: FULFILL = "FULFILL".asInstanceOf[FULFILL]
  
  @js.native
  sealed trait REQUEST extends RoutineStages
  @scala.inline
  def REQUEST: REQUEST = "REQUEST".asInstanceOf[REQUEST]
  
  @js.native
  sealed trait SUCCESS extends RoutineStages
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait TRIGGER extends RoutineStages
  @scala.inline
  def TRIGGER: TRIGGER = "TRIGGER".asInstanceOf[TRIGGER]
}
