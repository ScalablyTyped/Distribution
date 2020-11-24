package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined leaflet.leaflet.Control.AttributionOptions & react-leaflet.react-leaflet.MapControlProps */
@js.native
trait AttributionControlProps extends js.Object {
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  var position: js.UndefOr[ControlPosition] = js.native
  
  var prefix: js.UndefOr[String | Boolean] = js.native
}
object AttributionControlProps {
  
  @scala.inline
  def apply(): AttributionControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributionControlProps]
  }
  
  @scala.inline
  implicit class AttributionControlPropsOps[Self <: AttributionControlProps] (val x: Self) extends AnyVal {
    
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
    def setLeaflet(value: LeafletContext): Self = this.set("leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaflet: Self = this.set("leaflet", js.undefined)
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPrefix(value: String | Boolean): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
