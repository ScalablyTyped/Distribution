package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilingDataBackend extends StObject {
  
  var dataForRoots: js.Array[ProfilingDataForRootBackend]
  
  var rendererID: Double
  
  var timelineData: TimelineDataExport | Null
}
object ProfilingDataBackend {
  
  inline def apply(dataForRoots: js.Array[ProfilingDataForRootBackend], rendererID: Double): ProfilingDataBackend = {
    val __obj = js.Dynamic.literal(dataForRoots = dataForRoots.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any], timelineData = null)
    __obj.asInstanceOf[ProfilingDataBackend]
  }
  
  extension [Self <: ProfilingDataBackend](x: Self) {
    
    inline def setDataForRoots(value: js.Array[ProfilingDataForRootBackend]): Self = StObject.set(x, "dataForRoots", value.asInstanceOf[js.Any])
    
    inline def setDataForRootsVarargs(value: ProfilingDataForRootBackend*): Self = StObject.set(x, "dataForRoots", js.Array(value*))
    
    inline def setRendererID(value: Double): Self = StObject.set(x, "rendererID", value.asInstanceOf[js.Any])
    
    inline def setTimelineData(value: TimelineDataExport): Self = StObject.set(x, "timelineData", value.asInstanceOf[js.Any])
    
    inline def setTimelineDataNull: Self = StObject.set(x, "timelineData", null)
  }
}
