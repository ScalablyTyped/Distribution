package typings.reduxSagaRoutines

import typings.reduxSagaRoutines.mod.RoutineStages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxSagaRoutinesStrings {
  
  @js.native
  sealed trait FAILURE
    extends StObject
       with RoutineStages
  inline def FAILURE: FAILURE = "FAILURE".asInstanceOf[FAILURE]
  
  @js.native
  sealed trait FULFILL
    extends StObject
       with RoutineStages
  inline def FULFILL: FULFILL = "FULFILL".asInstanceOf[FULFILL]
  
  @js.native
  sealed trait REQUEST
    extends StObject
       with RoutineStages
  inline def REQUEST: REQUEST = "REQUEST".asInstanceOf[REQUEST]
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with RoutineStages
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait TRIGGER
    extends StObject
       with RoutineStages
  inline def TRIGGER: TRIGGER = "TRIGGER".asInstanceOf[TRIGGER]
}
