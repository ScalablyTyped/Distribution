package typings.reactJoyride.mod

import typings.reactJoyride.reactJoyrideStrings.error
import typings.reactJoyride.reactJoyrideStrings.finished
import typings.reactJoyride.reactJoyrideStrings.idle
import typings.reactJoyride.reactJoyrideStrings.paused
import typings.reactJoyride.reactJoyrideStrings.ready
import typings.reactJoyride.reactJoyrideStrings.running
import typings.reactJoyride.reactJoyrideStrings.skipped
import typings.reactJoyride.reactJoyrideStrings.waiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait status extends StObject {
  
  var ERROR: error
  
  var FINISHED: finished
  
  var IDLE: idle
  
  var PAUSED: paused
  
  var READY: ready
  
  var RUNNING: running
  
  var SKIPPED: skipped
  
  var WAITING: waiting
}
object status {
  
  inline def apply(): status = {
    val __obj = js.Dynamic.literal(ERROR = "error", FINISHED = "finished", IDLE = "idle", PAUSED = "paused", READY = "ready", RUNNING = "running", SKIPPED = "skipped", WAITING = "waiting")
    __obj.asInstanceOf[status]
  }
  
  extension [Self <: status](x: Self) {
    
    inline def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setFINISHED(value: finished): Self = StObject.set(x, "FINISHED", value.asInstanceOf[js.Any])
    
    inline def setIDLE(value: idle): Self = StObject.set(x, "IDLE", value.asInstanceOf[js.Any])
    
    inline def setPAUSED(value: paused): Self = StObject.set(x, "PAUSED", value.asInstanceOf[js.Any])
    
    inline def setREADY(value: ready): Self = StObject.set(x, "READY", value.asInstanceOf[js.Any])
    
    inline def setRUNNING(value: running): Self = StObject.set(x, "RUNNING", value.asInstanceOf[js.Any])
    
    inline def setSKIPPED(value: skipped): Self = StObject.set(x, "SKIPPED", value.asInstanceOf[js.Any])
    
    inline def setWAITING(value: waiting): Self = StObject.set(x, "WAITING", value.asInstanceOf[js.Any])
  }
}
