package typings.reactDevtoolsInline.commonsMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilingDataFrontend extends StObject {
  
  var dataForRoots: Map[Double, ProfilingDataForRootFrontend]
  
  var imported: Boolean
  
  var timelineData: js.Array[TimelineData]
}
object ProfilingDataFrontend {
  
  inline def apply(
    dataForRoots: Map[Double, ProfilingDataForRootFrontend],
    imported: Boolean,
    timelineData: js.Array[TimelineData]
  ): ProfilingDataFrontend = {
    val __obj = js.Dynamic.literal(dataForRoots = dataForRoots.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], timelineData = timelineData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingDataFrontend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfilingDataFrontend] (val x: Self) extends AnyVal {
    
    inline def setDataForRoots(value: Map[Double, ProfilingDataForRootFrontend]): Self = StObject.set(x, "dataForRoots", value.asInstanceOf[js.Any])
    
    inline def setImported(value: Boolean): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setTimelineData(value: js.Array[TimelineData]): Self = StObject.set(x, "timelineData", value.asInstanceOf[js.Any])
    
    inline def setTimelineDataVarargs(value: TimelineData*): Self = StObject.set(x, "timelineData", js.Array(value*))
  }
}
