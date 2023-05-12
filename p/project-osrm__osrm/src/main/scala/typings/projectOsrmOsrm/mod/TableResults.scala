package typings.projectOsrmOsrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableResults extends StObject {
  
  var destinations: js.Array[Waypoint]
  
  var distances: js.UndefOr[js.Array[js.Array[Distance]]] = js.undefined
  
  var durations: js.Array[js.Array[Duration]]
  
  var fallback_speed_cells: js.UndefOr[js.Array[Double]] = js.undefined
  
  var sources: js.Array[Waypoint]
}
object TableResults {
  
  inline def apply(
    destinations: js.Array[Waypoint],
    durations: js.Array[js.Array[Duration]],
    sources: js.Array[Waypoint]
  ): TableResults = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], durations = durations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableResults] (val x: Self) extends AnyVal {
    
    inline def setDestinations(value: js.Array[Waypoint]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsVarargs(value: Waypoint*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setDistances(value: js.Array[js.Array[Distance]]): Self = StObject.set(x, "distances", value.asInstanceOf[js.Any])
    
    inline def setDistancesUndefined: Self = StObject.set(x, "distances", js.undefined)
    
    inline def setDistancesVarargs(value: js.Array[Distance]*): Self = StObject.set(x, "distances", js.Array(value*))
    
    inline def setDurations(value: js.Array[js.Array[Duration]]): Self = StObject.set(x, "durations", value.asInstanceOf[js.Any])
    
    inline def setDurationsVarargs(value: js.Array[Duration]*): Self = StObject.set(x, "durations", js.Array(value*))
    
    inline def setFallback_speed_cells(value: js.Array[Double]): Self = StObject.set(x, "fallback_speed_cells", value.asInstanceOf[js.Any])
    
    inline def setFallback_speed_cellsUndefined: Self = StObject.set(x, "fallback_speed_cells", js.undefined)
    
    inline def setFallback_speed_cellsVarargs(value: Double*): Self = StObject.set(x, "fallback_speed_cells", js.Array(value*))
    
    inline def setSources(value: js.Array[Waypoint]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: Waypoint*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
