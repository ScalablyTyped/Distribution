package typings.sentryReplay.typesTypesReplayFrameMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSpanFrame
  extends StObject
     with SpanFrame {
  
  var data: js.UndefOr[Record[String, Any]] = js.undefined
  
  var description: String
  
  var endTimestamp: Double
  
  var op: String
  
  var startTimestamp: Double
}
object BaseSpanFrame {
  
  inline def apply(description: String, endTimestamp: Double, op: String, startTimestamp: Double): BaseSpanFrame = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSpanFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseSpanFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
  }
}
