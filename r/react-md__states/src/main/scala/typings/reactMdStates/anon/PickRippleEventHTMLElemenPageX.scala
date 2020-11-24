package typings.reactMdStates.anon

import typings.react.mod.TouchList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@react-md/states.@react-md/states/types/ripples/types.RippleEvent<std.HTMLElement>, 'pageX' | 'pageY' | 'touches' | 'type'> */
@js.native
trait PickRippleEventHTMLElemenPageX extends js.Object {
  
  var pageX: js.UndefOr[Double] = js.native
  
  var pageY: js.UndefOr[Double] = js.native
  
  var touches: js.UndefOr[TouchList] = js.native
  
  var `type`: String = js.native
}
object PickRippleEventHTMLElemenPageX {
  
  @scala.inline
  def apply(`type`: String): PickRippleEventHTMLElemenPageX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRippleEventHTMLElemenPageX]
  }
  
  @scala.inline
  implicit class PickRippleEventHTMLElemenPageXOps[Self <: PickRippleEventHTMLElemenPageX] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageX: Self = this.set("pageX", js.undefined)
    
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageY: Self = this.set("pageY", js.undefined)
    
    @scala.inline
    def setTouches(value: TouchList): Self = this.set("touches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouches: Self = this.set("touches", js.undefined)
  }
}
