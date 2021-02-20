package typings.scrollmagic.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event[T] extends StObject {
  
  val currentTarget: Scene = js.native
  
  val namespace: String = js.native
  
  val target: Scene = js.native
  
  val timeStamp: Date = js.native
  
  val timestamp: Date = js.native
  
  val `type`: T = js.native
}
object Event {
  
  @scala.inline
  def apply[T](
    currentTarget: Scene,
    namespace: String,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    `type`: T
  ): Event[T] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[T]]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event[_], T] (val x: Self with Event[T]) extends AnyVal {
    
    @scala.inline
    def setCurrentTarget(value: Scene): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Scene): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
