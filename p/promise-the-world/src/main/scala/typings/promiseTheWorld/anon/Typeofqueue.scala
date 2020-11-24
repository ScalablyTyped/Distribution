package typings.promiseTheWorld.anon

import org.scalablytyped.runtime.Instantiable0
import typings.promiseTheWorld.queueMod.Queue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofqueue extends js.Object {
  
  var Queue: Instantiable0[typings.promiseTheWorld.queueMod.Queue] = js.native
}
object Typeofqueue {
  
  @scala.inline
  def apply(Queue: Instantiable0[Queue]): Typeofqueue = {
    val __obj = js.Dynamic.literal(Queue = Queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofqueue]
  }
  
  @scala.inline
  implicit class TypeofqueueOps[Self <: Typeofqueue] (val x: Self) extends AnyVal {
    
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
    def setQueue(value: Instantiable0[Queue]): Self = this.set("Queue", value.asInstanceOf[js.Any])
  }
}
