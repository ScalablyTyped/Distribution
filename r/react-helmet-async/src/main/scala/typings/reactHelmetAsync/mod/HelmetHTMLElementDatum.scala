package typings.reactHelmetAsync.mod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLHtmlElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HelmetHTMLElementDatum extends js.Object {
  
  def toComponent(): HTMLAttributes[HTMLHtmlElement] = js.native
}
object HelmetHTMLElementDatum {
  
  @scala.inline
  def apply(toComponent: () => HTMLAttributes[HTMLHtmlElement]): HelmetHTMLElementDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
    __obj.asInstanceOf[HelmetHTMLElementDatum]
  }
  
  @scala.inline
  implicit class HelmetHTMLElementDatumOps[Self <: HelmetHTMLElementDatum] (val x: Self) extends AnyVal {
    
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
    def setToComponent(value: () => HTMLAttributes[HTMLHtmlElement]): Self = this.set("toComponent", js.Any.fromFunction0(value))
  }
}
