package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  
  var hideSpacer: js.UndefOr[Boolean] = js.native
  
  var hideTop: js.UndefOr[Boolean] = js.native
  
   // string | JSX.Element
  var scroll: js.UndefOr[Boolean] = js.native
  
  var seamed: js.UndefOr[Boolean] = js.native
  
  @JSName("title")
  var title_HeaderProps: js.UndefOr[js.Any] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
  
  var waterfall: js.UndefOr[Boolean] = js.native
}
object HeaderProps {
  
  @scala.inline
  def apply(): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderProps]
  }
  
  @scala.inline
  implicit class HeaderPropsOps[Self <: HeaderProps] (val x: Self) extends AnyVal {
    
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
    def setHideTop(value: Boolean): Self = this.set("hideTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTop: Self = this.set("hideTop", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setSeamed(value: Boolean): Self = this.set("seamed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeamed: Self = this.set("seamed", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    
    @scala.inline
    def setWaterfall(value: Boolean): Self = this.set("waterfall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterfall: Self = this.set("waterfall", js.undefined)
  }
}
