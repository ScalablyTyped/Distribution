package typings.reactLeaflet.mod.LayersControl

import typings.leaflet.mod.Layer
import typings.react.mod.ReactNode
import typings.reactLeaflet.mod.AddLayerHandler
import typings.reactLeaflet.mod.Children
import typings.reactLeaflet.mod.LeafletContext
import typings.reactLeaflet.mod.RemoveLayerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlledLayerProps extends js.Object {
  
  var addBaseLayer: js.UndefOr[AddLayerHandler] = js.native
  
  var addOverlay: js.UndefOr[AddLayerHandler] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var children: Children = js.native
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  var name: String = js.native
  
  var removeLayer: js.UndefOr[RemoveLayerHandler] = js.native
  
  var removeLayerControl: js.UndefOr[RemoveLayerHandler] = js.native
}
object ControlledLayerProps {
  
  @scala.inline
  def apply(name: String): ControlledLayerProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlledLayerProps]
  }
  
  @scala.inline
  implicit class ControlledLayerPropsOps[Self <: ControlledLayerProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddBaseLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = this.set("addBaseLayer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAddBaseLayer: Self = this.set("addBaseLayer", js.undefined)
    
    @scala.inline
    def setAddOverlay(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = this.set("addOverlay", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAddOverlay: Self = this.set("addOverlay", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: Children): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = this.set("leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaflet: Self = this.set("leaflet", js.undefined)
    
    @scala.inline
    def setRemoveLayer(value: /* layer */ Layer => Unit): Self = this.set("removeLayer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveLayer: Self = this.set("removeLayer", js.undefined)
    
    @scala.inline
    def setRemoveLayerControl(value: /* layer */ Layer => Unit): Self = this.set("removeLayerControl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveLayerControl: Self = this.set("removeLayerControl", js.undefined)
  }
}
