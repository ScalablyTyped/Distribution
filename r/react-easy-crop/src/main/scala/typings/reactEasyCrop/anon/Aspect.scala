package typings.reactEasyCrop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aspect extends js.Object {
  
  var aspect: Double = js.native
  
  var cropShape: String = js.native
  
  var maxZoom: Double = js.native
  
  var minZoom: Double = js.native
  
  var restrictPosition: Boolean = js.native
  
  var rotation: Double = js.native
  
  var showGrid: Boolean = js.native
  
  var zoom: Double = js.native
  
  var zoomSpeed: Double = js.native
  
  var zoomWithScroll: Boolean = js.native
}
object Aspect {
  
  @scala.inline
  def apply(
    aspect: Double,
    cropShape: String,
    maxZoom: Double,
    minZoom: Double,
    restrictPosition: Boolean,
    rotation: Double,
    showGrid: Boolean,
    zoom: Double,
    zoomSpeed: Double,
    zoomWithScroll: Boolean
  ): Aspect = {
    val __obj = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], cropShape = cropShape.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], restrictPosition = restrictPosition.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], showGrid = showGrid.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any], zoomWithScroll = zoomWithScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aspect]
  }
  
  @scala.inline
  implicit class AspectOps[Self <: Aspect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAspect(value: Double): Self = this.set("aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropShape(value: String): Self = this.set("cropShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictPosition(value: Boolean): Self = this.set("restrictPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGrid(value: Boolean): Self = this.set("showGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomSpeed(value: Double): Self = this.set("zoomSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomWithScroll(value: Boolean): Self = this.set("zoomWithScroll", value.asInstanceOf[js.Any])
  }
}
