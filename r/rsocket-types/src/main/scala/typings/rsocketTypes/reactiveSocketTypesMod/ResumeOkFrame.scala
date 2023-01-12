package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesInts.`0`
import typings.rsocketTypes.rsocketTypesInts.`0x0e`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeOkFrame
  extends StObject
     with Frame {
  
  var clientPosition: Double
  
  var flags: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var streamId: `0`
  
  var `type`: `0x0e`
}
object ResumeOkFrame {
  
  inline def apply(clientPosition: Double, flags: Double): ResumeOkFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x0e)
    __obj.asInstanceOf[ResumeOkFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeOkFrame] (val x: Self) extends AnyVal {
    
    inline def setClientPosition(value: Double): Self = StObject.set(x, "clientPosition", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStreamId(value: `0`): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x0e`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
