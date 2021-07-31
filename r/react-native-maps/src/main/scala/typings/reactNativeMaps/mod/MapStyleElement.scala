package typings.reactNativeMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapStyleElement extends StObject {
  
  var elementType: js.UndefOr[String] = js.undefined
  
  var featureType: js.UndefOr[String] = js.undefined
  
  var stylers: js.Array[js.Object]
}
object MapStyleElement {
  
  @scala.inline
  def apply(stylers: js.Array[js.Object]): MapStyleElement = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyleElement]
  }
  
  @scala.inline
  implicit class MapStyleElementMutableBuilder[Self <: MapStyleElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    @scala.inline
    def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    @scala.inline
    def setStylers(value: js.Array[js.Object]): Self = StObject.set(x, "stylers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylersVarargs(value: js.Object*): Self = StObject.set(x, "stylers", js.Array(value :_*))
  }
}
