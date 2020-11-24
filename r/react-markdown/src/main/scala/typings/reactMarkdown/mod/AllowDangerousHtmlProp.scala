package typings.reactMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowDangerousHtmlProp extends js.Object {
  
  val allowDangerousHtml: js.UndefOr[Boolean] = js.native
}
object AllowDangerousHtmlProp {
  
  @scala.inline
  def apply(): AllowDangerousHtmlProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDangerousHtmlProp]
  }
  
  @scala.inline
  implicit class AllowDangerousHtmlPropOps[Self <: AllowDangerousHtmlProp] (val x: Self) extends AnyVal {
    
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
    def setAllowDangerousHtml(value: Boolean): Self = this.set("allowDangerousHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDangerousHtml: Self = this.set("allowDangerousHtml", js.undefined)
  }
}
