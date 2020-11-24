package typings.reactMdUtils.useGridListMod

import typings.react.mod.RefCallback
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvidedGridListProps[E /* <: HTMLElement */] extends js.Object {
  
  var className: String = js.native
  
  var ref: RefCallback[E | Null] = js.native
  
  var style: CSSProperties = js.native
}
object ProvidedGridListProps {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](className: String, ref: /* instance */ (E | Null) | Null => Unit, style: CSSProperties): ProvidedGridListProps[E] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidedGridListProps[E]]
  }
  
  @scala.inline
  implicit class ProvidedGridListPropsOps[Self <: ProvidedGridListProps[_], E /* <: HTMLElement */] (val x: Self with ProvidedGridListProps[E]) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: /* instance */ (E | Null) | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
