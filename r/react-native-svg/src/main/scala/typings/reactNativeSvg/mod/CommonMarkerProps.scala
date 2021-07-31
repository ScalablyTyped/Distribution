package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonMarkerProps extends StObject {
  
  var marker: js.UndefOr[String] = js.undefined
  
  var markerEnd: js.UndefOr[String] = js.undefined
  
  var markerMid: js.UndefOr[String] = js.undefined
  
  var markerStart: js.UndefOr[String] = js.undefined
}
object CommonMarkerProps {
  
  @scala.inline
  def apply(): CommonMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonMarkerProps]
  }
  
  @scala.inline
  implicit class CommonMarkerPropsMutableBuilder[Self <: CommonMarkerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
  }
}
