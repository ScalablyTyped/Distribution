package typings.scrollmagic.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event[T] extends StObject {
  
  val currentTarget: Scene
  
  val namespace: String
  
  val target: Scene
  
  val timeStamp: Date
  
  val timestamp: Date
  
  val `type`: T
}
object Event {
  
  inline def apply[T](
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
  
  extension [Self <: Event[?], T](x: Self & Event[T]) {
    
    inline def setCurrentTarget(value: Scene): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Scene): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
