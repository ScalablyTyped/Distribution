package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerProps extends DraggableControlProps {
  
  var className: js.UndefOr[String] = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var offsetLeft: js.UndefOr[Double] = js.native
  
  var offsetTop: js.UndefOr[Double] = js.native
}
object MarkerProps {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): MarkerProps = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
  
  @scala.inline
  implicit class MarkerPropsMutableBuilder[Self <: MarkerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
    
    @scala.inline
    def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
  }
}
