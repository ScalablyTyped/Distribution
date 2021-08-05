package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x00`
import typings.rsocketTypes.rsocketTypesNumbers.`0x0c`
import typings.rsocketTypes.rsocketTypesNumbers.`0x3f`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsupportedFrame
  extends StObject
     with Frame {
  
  var flags: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var streamId: `0`
  
  var `type`: `0x3f` | `0x0c` | `0x00`
}
object UnsupportedFrame {
  
  inline def apply(flags: Double, `type`: `0x3f` | `0x0c` | `0x00`): UnsupportedFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedFrame]
  }
  
  extension [Self <: UnsupportedFrame](x: Self) {
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStreamId(value: `0`): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x3f` | `0x0c` | `0x00`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
