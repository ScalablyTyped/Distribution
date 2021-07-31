package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.IDLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleState
  extends StObject
     with State {
  
  var completed: js.UndefOr[CompletedDrag] = js.undefined
  
  var phase: IDLE
  
  var shouldFlush: Boolean
}
object IdleState {
  
  @scala.inline
  def apply(shouldFlush: Boolean): IdleState = {
    val __obj = js.Dynamic.literal(phase = "IDLE", shouldFlush = shouldFlush.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleState]
  }
  
  @scala.inline
  implicit class IdleStateMutableBuilder[Self <: IdleState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: CompletedDrag): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    @scala.inline
    def setPhase(value: IDLE): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldFlush(value: Boolean): Self = StObject.set(x, "shouldFlush", value.asInstanceOf[js.Any])
  }
}
