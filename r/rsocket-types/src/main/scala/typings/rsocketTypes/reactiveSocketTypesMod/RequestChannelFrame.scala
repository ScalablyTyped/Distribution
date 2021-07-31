package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0x07`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestChannelFrame
  extends StObject
     with Frame {
  
  var data: js.UndefOr[Encodable] = js.undefined
  
  var flags: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[Encodable] = js.undefined
  
  var requestN: Double
  
  var streamId: Double
  
  var `type`: `0x07`
}
object RequestChannelFrame {
  
  @scala.inline
  def apply(flags: Double, requestN: Double, streamId: Double): RequestChannelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x07)
    __obj.asInstanceOf[RequestChannelFrame]
  }
  
  @scala.inline
  implicit class RequestChannelFrameMutableBuilder[Self <: RequestChannelFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Encodable): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMetadata(value: Encodable): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setRequestN(value: Double): Self = StObject.set(x, "requestN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: Double): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0x07`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
