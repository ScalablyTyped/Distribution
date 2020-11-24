package typings.reactBootstrap.responsiveEmbedMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveEmbedProps
  extends AllHTMLAttributes[ResponsiveEmbed]
     with ClassAttributes[ResponsiveEmbed] {
  
  var a16by9: js.UndefOr[Boolean] = js.native
  
  var a4by3: js.UndefOr[Boolean] = js.native
  
  var bsClass: js.UndefOr[String] = js.native
}
object ResponsiveEmbedProps {
  
  @scala.inline
  def apply(): ResponsiveEmbedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveEmbedProps]
  }
  
  @scala.inline
  implicit class ResponsiveEmbedPropsOps[Self <: ResponsiveEmbedProps] (val x: Self) extends AnyVal {
    
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
    def setA16by9(value: Boolean): Self = this.set("a16by9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA16by9: Self = this.set("a16by9", js.undefined)
    
    @scala.inline
    def setA4by3(value: Boolean): Self = this.set("a4by3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA4by3: Self = this.set("a4by3", js.undefined)
    
    @scala.inline
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
  }
}
