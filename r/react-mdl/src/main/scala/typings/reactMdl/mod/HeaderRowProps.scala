package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderRowProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  
   // string | JSX.Element
  var hideSpacer: js.UndefOr[Boolean] = js.native
  
  @JSName("title")
  var title_HeaderRowProps: js.UndefOr[js.Any] = js.native
}
object HeaderRowProps {
  
  @scala.inline
  def apply(): HeaderRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderRowProps]
  }
  
  @scala.inline
  implicit class HeaderRowPropsOps[Self <: HeaderRowProps] (val x: Self) extends AnyVal {
    
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
    def setHideSpacer(value: Boolean): Self = this.set("hideSpacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideSpacer: Self = this.set("hideSpacer", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
