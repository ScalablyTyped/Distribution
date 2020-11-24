package typings.reactabularSticky.mod

import typings.reactabularSticky.anon.PartialUIEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickyHeaderProps extends js.Object {
  
  var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.native
  
  var tableBody: HTMLElement | Null = js.native
}
object StickyHeaderProps {
  
  @scala.inline
  def apply(): StickyHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickyHeaderProps]
  }
  
  @scala.inline
  implicit class StickyHeaderPropsOps[Self <: StickyHeaderProps] (val x: Self) extends AnyVal {
    
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
    def setTableBody(value: HTMLElement): Self = this.set("tableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBodyNull: Self = this.set("tableBody", null)
  }
}
