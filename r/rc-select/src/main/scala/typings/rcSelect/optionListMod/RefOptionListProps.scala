package typings.rcSelect.optionListMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefOptionListProps extends js.Object {
  
  var onKeyDown: KeyboardEventHandler[Element] = js.native
  
  var onKeyUp: KeyboardEventHandler[Element] = js.native
  
  var scrollTo: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
}
object RefOptionListProps {
  
  @scala.inline
  def apply(onKeyDown: KeyboardEvent[Element] => Unit, onKeyUp: KeyboardEvent[Element] => Unit): RefOptionListProps = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp))
    __obj.asInstanceOf[RefOptionListProps]
  }
  
  @scala.inline
  implicit class RefOptionListPropsOps[Self <: RefOptionListProps] (val x: Self) extends AnyVal {
    
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
    def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[Element] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollTo(value: /* index */ Double => Unit): Self = this.set("scrollTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
  }
}
