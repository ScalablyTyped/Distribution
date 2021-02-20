package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlushUpdates extends StObject {
  
  def flushUpdates(): Unit = js.native
  
  def scheduleUpdate(callback: js.Function0[Unit]): Unit = js.native
}
object FlushUpdates {
  
  @scala.inline
  def apply(flushUpdates: () => Unit, scheduleUpdate: js.Function0[Unit] => Unit): FlushUpdates = {
    val __obj = js.Dynamic.literal(flushUpdates = js.Any.fromFunction0(flushUpdates), scheduleUpdate = js.Any.fromFunction1(scheduleUpdate))
    __obj.asInstanceOf[FlushUpdates]
  }
  
  @scala.inline
  implicit class FlushUpdatesMutableBuilder[Self <: FlushUpdates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlushUpdates(value: () => Unit): Self = StObject.set(x, "flushUpdates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScheduleUpdate(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "scheduleUpdate", js.Any.fromFunction1(value))
  }
}
