package typings.reactOverlays.anon

import typings.react.mod.CSSProperties
import typings.react.mod.RefCallback
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref extends js.Object {
  
  var ref: RefCallback[HTMLElement] = js.native
  
  var style: CSSProperties = js.native
}
object Ref {
  
  @scala.inline
  def apply(ref: /* instance */ HTMLElement | Null => Unit, style: CSSProperties): Ref = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class RefOps[Self <: Ref] (val x: Self) extends AnyVal {
    
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
    def setRef(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
