package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEvent extends StObject {
  
  val depth: Double
  
  val duration: Milliseconds
  
  val timestamp: Milliseconds
  
  val `type`: String
  
  var warning: String | Null
}
object NativeEvent {
  
  inline def apply(depth: Double, duration: Milliseconds, timestamp: Milliseconds, `type`: String): NativeEvent = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], warning = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeEvent] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Milliseconds): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Milliseconds): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
  }
}
