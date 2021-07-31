package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.KmlMarker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Markers extends StObject {
  
  var markers: js.Array[KmlMarker]
}
object Markers {
  
  @scala.inline
  def apply(markers: js.Array[KmlMarker]): Markers = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Markers]
  }
  
  @scala.inline
  implicit class MarkersMutableBuilder[Self <: Markers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkers(value: js.Array[KmlMarker]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersVarargs(value: KmlMarker*): Self = StObject.set(x, "markers", js.Array(value :_*))
  }
}
