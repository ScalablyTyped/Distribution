package typings.reactMapGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEvent
  extends /* key */ StringDictionary[js.Any] {
  
  var lngLat: js.Tuple2[Double, Double] = js.native
}
object DragEvent {
  
  @scala.inline
  def apply(lngLat: js.Tuple2[Double, Double]): DragEvent = {
    val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEvent]
  }
  
  @scala.inline
  implicit class DragEventMutableBuilder[Self <: DragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLngLat(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "lngLat", value.asInstanceOf[js.Any])
  }
}
