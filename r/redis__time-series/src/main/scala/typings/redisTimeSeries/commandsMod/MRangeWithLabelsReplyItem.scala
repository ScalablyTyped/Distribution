package typings.redisTimeSeries.commandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRangeWithLabelsReplyItem
  extends StObject
     with MRangeReplyItem {
  
  var labels: Labels
}
object MRangeWithLabelsReplyItem {
  
  inline def apply(key: String, labels: Labels, samples: js.Array[SampleReply]): MRangeWithLabelsReplyItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRangeWithLabelsReplyItem]
  }
  
  extension [Self <: MRangeWithLabelsReplyItem](x: Self) {
    
    inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
  }
}
