package typings.reactabularSticky.mod

import typings.reactabularSticky.anon.PartialUIEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickyBodyProps extends js.Object {
  
  var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.native
  
  var tableHeader: HTMLElement | Null = js.native
}
object StickyBodyProps {
  
  @scala.inline
  def apply(): StickyBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickyBodyProps]
  }
  
  @scala.inline
  implicit class StickyBodyPropsOps[Self <: StickyBodyProps] (val x: Self) extends AnyVal {
    
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
    def setOnScroll(value: /* e */ PartialUIEvent => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setTableHeader(value: HTMLElement): Self = this.set("tableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableHeaderNull: Self = this.set("tableHeader", null)
  }
}
