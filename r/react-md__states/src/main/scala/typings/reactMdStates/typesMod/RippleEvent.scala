package typings.reactMdStates.typesMod

import typings.react.mod.TouchList
import typings.std.EventTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react.react.MouseEvent<E, react.react.NativeMouseEvent>, 'target' | 'currentTarget' | 'type'> & std.Partial<std.Pick<react.react.MouseEvent<E, react.react.NativeMouseEvent>, 'pageX' | 'pageY' | 'button'>> & std.Partial<std.Pick<react.react.KeyboardEvent<E>, 'key'>> & std.Partial<std.Pick<react.react.TouchEvent<E>, 'touches'>> */
@js.native
trait RippleEvent[E /* <: HTMLElement */] extends js.Object {
  
  var button: js.UndefOr[Double] = js.native
  
  var currentTarget: EventTarget with E = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var pageX: js.UndefOr[Double] = js.native
  
  var pageY: js.UndefOr[Double] = js.native
  
  var target: EventTarget = js.native
  
  var touches: js.UndefOr[TouchList] = js.native
  
  var `type`: String = js.native
}
object RippleEvent {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](currentTarget: EventTarget with E, target: EventTarget, `type`: String): RippleEvent[E] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleEvent[E]]
  }
  
  @scala.inline
  implicit class RippleEventOps[Self <: RippleEvent[_], E /* <: HTMLElement */] (val x: Self with RippleEvent[E]) extends AnyVal {
    
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
    def setCurrentTarget(value: EventTarget with E): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: EventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
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
