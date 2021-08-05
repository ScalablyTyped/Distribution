package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x03`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeepAliveFrame
  extends StObject
     with Frame {
  
  var data: js.UndefOr[Encodable] = js.undefined
  
  var flags: Double
  
  var lastReceivedPosition: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var streamId: `0`
  
  var `type`: `0x03`
}
object KeepAliveFrame {
  
  inline def apply(flags: Double, lastReceivedPosition: Double): KeepAliveFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], lastReceivedPosition = lastReceivedPosition.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x03)
    __obj.asInstanceOf[KeepAliveFrame]
  }
  
  extension [Self <: KeepAliveFrame](x: Self) {
    
    inline def setData(value: Encodable): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLastReceivedPosition(value: Double): Self = StObject.set(x, "lastReceivedPosition", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStreamId(value: `0`): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x03`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
