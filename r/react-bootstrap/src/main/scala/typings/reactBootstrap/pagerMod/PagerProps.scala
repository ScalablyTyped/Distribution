package typings.reactBootstrap.pagerMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagerProps
  extends AllHTMLAttributes[Pager]
     with ClassAttributes[Pager] {
  
  var bsClass: js.UndefOr[String] = js.native
  
  @JSName("onSelect")
  var onSelect_PagerProps: js.UndefOr[SelectCallback] = js.native
}
object PagerProps {
  
  @scala.inline
  def apply(): PagerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerProps]
  }
  
  @scala.inline
  implicit class PagerPropsOps[Self <: PagerProps] (val x: Self) extends AnyVal {
    
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
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SelectCallback): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
  }
}
