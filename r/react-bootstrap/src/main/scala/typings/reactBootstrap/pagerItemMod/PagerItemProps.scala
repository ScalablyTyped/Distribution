package typings.reactBootstrap.pagerItemMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagerItemProps
  extends AllHTMLAttributes[PagerItem]
     with ClassAttributes[PagerItem] {
  
  var eventKey: js.UndefOr[js.Any] = js.native
  
  var next: js.UndefOr[Boolean] = js.native
  
  @JSName("onSelect")
  var onSelect_PagerItemProps: js.UndefOr[SelectCallback] = js.native
  
  var previous: js.UndefOr[Boolean] = js.native
}
object PagerItemProps {
  
  @scala.inline
  def apply(): PagerItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerItemProps]
  }
  
  @scala.inline
  implicit class PagerItemPropsOps[Self <: PagerItemProps] (val x: Self) extends AnyVal {
    
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
    def setEventKey(value: js.Any): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    
    @scala.inline
    def setNext(value: Boolean): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SelectCallback): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setPrevious(value: Boolean): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
  }
}
