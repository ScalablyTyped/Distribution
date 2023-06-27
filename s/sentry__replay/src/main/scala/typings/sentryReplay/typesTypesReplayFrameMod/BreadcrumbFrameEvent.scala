package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.anon.Metric
import typings.sentryReplay.typesTypesRrwebMod.EventType.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadcrumbFrameEvent
  extends StObject
     with RecordingCustomEvent
     with ReplayFrameEvent {
  
  @JSName("data")
  var data_BreadcrumbFrameEvent: Metric
}
object BreadcrumbFrameEvent {
  
  inline def apply(data: Metric, timestamp: Double, `type`: Custom): BreadcrumbFrameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbFrameEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreadcrumbFrameEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: Metric): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
