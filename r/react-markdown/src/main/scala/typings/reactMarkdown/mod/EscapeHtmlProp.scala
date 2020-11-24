package typings.reactMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EscapeHtmlProp extends js.Object {
  
  /** @deprecated use allowDangerousHtml */
  val escapeHtml: js.UndefOr[Boolean] = js.native
}
object EscapeHtmlProp {
  
  @scala.inline
  def apply(): EscapeHtmlProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EscapeHtmlProp]
  }
  
  @scala.inline
  implicit class EscapeHtmlPropOps[Self <: EscapeHtmlProp] (val x: Self) extends AnyVal {
    
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
    def setEscapeHtml(value: Boolean): Self = this.set("escapeHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeHtml: Self = this.set("escapeHtml", js.undefined)
  }
}
