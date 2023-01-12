package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlamechartStackFrame extends StObject {
  
  var duration: Milliseconds
  
  var locationColumn: js.UndefOr[Double] = js.undefined
  
  var locationLine: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var scriptUrl: js.UndefOr[String] = js.undefined
  
  var timestamp: Milliseconds
}
object FlamechartStackFrame {
  
  inline def apply(duration: Milliseconds, name: String, timestamp: Milliseconds): FlamechartStackFrame = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlamechartStackFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlamechartStackFrame] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Milliseconds): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLocationColumn(value: Double): Self = StObject.set(x, "locationColumn", value.asInstanceOf[js.Any])
    
    inline def setLocationColumnUndefined: Self = StObject.set(x, "locationColumn", js.undefined)
    
    inline def setLocationLine(value: Double): Self = StObject.set(x, "locationLine", value.asInstanceOf[js.Any])
    
    inline def setLocationLineUndefined: Self = StObject.set(x, "locationLine", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScriptUrl(value: String): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
    
    inline def setScriptUrlUndefined: Self = StObject.set(x, "scriptUrl", js.undefined)
    
    inline def setTimestamp(value: Milliseconds): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
