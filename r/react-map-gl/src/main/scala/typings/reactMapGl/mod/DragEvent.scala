package typings.reactMapGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEvent
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var lngLat: js.Tuple2[Double, Double]
}
object DragEvent {
  
  inline def apply(lngLat: js.Tuple2[Double, Double]): DragEvent = {
    val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEvent]
  }
  
  extension [Self <: DragEvent](x: Self) {
    
    inline def setLngLat(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "lngLat", value.asInstanceOf[js.Any])
  }
}
