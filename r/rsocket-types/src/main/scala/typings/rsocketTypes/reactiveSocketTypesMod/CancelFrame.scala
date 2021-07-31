package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0x09`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelFrame
  extends StObject
     with Frame {
  
  var flags: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var streamId: Double
  
  var `type`: `0x09`
}
object CancelFrame {
  
  @scala.inline
  def apply(flags: Double, streamId: Double): CancelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x09)
    __obj.asInstanceOf[CancelFrame]
  }
  
  @scala.inline
  implicit class CancelFrameMutableBuilder[Self <: CancelFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setStreamId(value: Double): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0x09`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
