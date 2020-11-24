package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined leaflet.leaflet.Control.ScaleOptions & react-leaflet.react-leaflet.MapControlProps */
@js.native
trait ScaleControlProps extends js.Object {
  
  var imperial: js.UndefOr[Boolean] = js.native
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var metric: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[ControlPosition] = js.native
  
  var updateWhenIdle: js.UndefOr[Boolean] = js.native
}
object ScaleControlProps {
  
  @scala.inline
  def apply(): ScaleControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleControlProps]
  }
  
  @scala.inline
  implicit class ScaleControlPropsOps[Self <: ScaleControlProps] (val x: Self) extends AnyVal {
    
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
    def setImperial(value: Boolean): Self = this.set("imperial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImperial: Self = this.set("imperial", js.undefined)
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = this.set("leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaflet: Self = this.set("leaflet", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMetric(value: Boolean): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setUpdateWhenIdle(value: Boolean): Self = this.set("updateWhenIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateWhenIdle: Self = this.set("updateWhenIdle", js.undefined)
  }
}
