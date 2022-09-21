package typings.redisTimeSeries.commandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRangeReplyItem extends StObject {
  
  var key: String
  
  var samples: js.Array[SampleReply]
}
object MRangeReplyItem {
  
  inline def apply(key: String, samples: js.Array[SampleReply]): MRangeReplyItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRangeReplyItem]
  }
  
  extension [Self <: MRangeReplyItem](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSamples(value: js.Array[SampleReply]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesVarargs(value: SampleReply*): Self = StObject.set(x, "samples", js.Array(value*))
  }
}
