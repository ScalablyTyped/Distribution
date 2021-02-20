package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x03`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeepAliveFrame extends Frame {
  
  var data: js.UndefOr[Encodable] = js.native
  
  var flags: Double = js.native
  
  var lastReceivedPosition: Double = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var streamId: `0` = js.native
  
  var `type`: `0x03` = js.native
}
object KeepAliveFrame {
  
  @scala.inline
  def apply(flags: Double, lastReceivedPosition: Double, streamId: `0`, `type`: `0x03`): KeepAliveFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], lastReceivedPosition = lastReceivedPosition.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepAliveFrame]
  }
  
  @scala.inline
  implicit class KeepAliveFrameMutableBuilder[Self <: KeepAliveFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Encodable): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReceivedPosition(value: Double): Self = StObject.set(x, "lastReceivedPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setStreamId(value: `0`): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0x03`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
