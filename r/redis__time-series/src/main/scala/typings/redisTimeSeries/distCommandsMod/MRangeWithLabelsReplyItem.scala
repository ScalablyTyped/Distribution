package typings.redisTimeSeries.distCommandsMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MRangeWithLabelsReplyItem] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
  }
}
