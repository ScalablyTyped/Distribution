package typings.reactOverlays.esmModalMod

import typings.react.mod.RefCallback
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderModalBackdropProps extends js.Object {
  
  def onClick(event: SyntheticEvent[Element, Event]): Unit = js.native
  
  var ref: RefCallback[Element] = js.native
}
object RenderModalBackdropProps {
  
  @scala.inline
  def apply(onClick: SyntheticEvent[Element, Event] => Unit, ref: /* instance */ Element | Null => Unit): RenderModalBackdropProps = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[RenderModalBackdropProps]
  }
  
  @scala.inline
  implicit class RenderModalBackdropPropsOps[Self <: RenderModalBackdropProps] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: SyntheticEvent[Element, Event] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: /* instance */ Element | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
  }
}
