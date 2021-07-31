package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0x08`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestNFrame
  extends StObject
     with Frame {
  
  var flags: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var requestN: Double
  
  var streamId: Double
  
  var `type`: `0x08`
}
object RequestNFrame {
  
  @scala.inline
  def apply(flags: Double, requestN: Double, streamId: Double): RequestNFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x08)
    __obj.asInstanceOf[RequestNFrame]
  }
  
  @scala.inline
  implicit class RequestNFrameMutableBuilder[Self <: RequestNFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setRequestN(value: Double): Self = StObject.set(x, "requestN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: Double): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0x08`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
