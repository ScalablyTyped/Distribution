package typings.signalfx.mod

import typings.signalfx.anon.TsId
import typings.signalfx.signalfxStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMessage
  extends StObject
     with StreamMessage {
  
  var channel: String
  
  var data: js.Array[TsId]
  
  var logicalTimestampMs: Double
  
  var `type`: data
}
object DataMessage {
  
  inline def apply(channel: String, data: js.Array[TsId], logicalTimestampMs: Double): DataMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], logicalTimestampMs = logicalTimestampMs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("data")
    __obj.asInstanceOf[DataMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataMessage] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[TsId]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: TsId*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLogicalTimestampMs(value: Double): Self = StObject.set(x, "logicalTimestampMs", value.asInstanceOf[js.Any])
    
    inline def setType(value: data): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
