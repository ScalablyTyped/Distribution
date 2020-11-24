package typings.reactLeaflet.anon

import typings.leaflet.mod.Popup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popup[E /* <: Popup_ */] extends js.Object {
  
  var popup: E = js.native
}
object Popup {
  
  @scala.inline
  def apply[E /* <: Popup_ */](popup: E): Popup[E] = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popup[E]]
  }
  
  @scala.inline
  implicit class PopupOps[Self <: Popup[_], E /* <: Popup_ */] (val x: Self with Popup[E]) extends AnyVal {
    
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
    def setPopup(value: E): Self = this.set("popup", value.asInstanceOf[js.Any])
  }
}
