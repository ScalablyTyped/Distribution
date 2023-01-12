package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactComponentMeasure extends StObject {
  
  val componentName: String
  
  var duration: Milliseconds
  
  val timestamp: Milliseconds
  
  val `type`: ReactComponentMeasureType
  
  var warning: String | Null
}
object ReactComponentMeasure {
  
  inline def apply(
    componentName: String,
    duration: Milliseconds,
    timestamp: Milliseconds,
    `type`: ReactComponentMeasureType
  ): ReactComponentMeasure = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], warning = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactComponentMeasure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactComponentMeasure] (val x: Self) extends AnyVal {
    
    inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Milliseconds): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Milliseconds): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: ReactComponentMeasureType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
  }
}
