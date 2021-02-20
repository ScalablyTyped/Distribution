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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait status extends StObject {
  
  var ERROR: error = js.native
  
  var FINISHED: finished = js.native
  
  var IDLE: idle = js.native
  
  var PAUSED: paused = js.native
  
  var READY: ready = js.native
  
  var RUNNING: running = js.native
  
  var SKIPPED: skipped = js.native
  
  var WAITING: waiting = js.native
}
object status {
  
  @scala.inline
  def apply(
    ERROR: error,
    FINISHED: finished,
    IDLE: idle,
    PAUSED: paused,
    READY: ready,
    RUNNING: running,
    SKIPPED: skipped,
    WAITING: waiting
  ): status = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], FINISHED = FINISHED.asInstanceOf[js.Any], IDLE = IDLE.asInstanceOf[js.Any], PAUSED = PAUSED.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], SKIPPED = SKIPPED.asInstanceOf[js.Any], WAITING = WAITING.asInstanceOf[js.Any])
    __obj.asInstanceOf[status]
  }
  
  @scala.inline
  implicit class statusMutableBuilder[Self <: status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFINISHED(value: finished): Self = StObject.set(x, "FINISHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDLE(value: idle): Self = StObject.set(x, "IDLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAUSED(value: paused): Self = StObject.set(x, "PAUSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREADY(value: ready): Self = StObject.set(x, "READY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUNNING(value: running): Self = StObject.set(x, "RUNNING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSKIPPED(value: skipped): Self = StObject.set(x, "SKIPPED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWAITING(value: waiting): Self = StObject.set(x, "WAITING", value.asInstanceOf[js.Any])
  }
}
