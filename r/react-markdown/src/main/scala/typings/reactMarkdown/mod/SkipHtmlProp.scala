package typings.reactMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipHtmlProp extends js.Object {
  
  val skipHtml: js.UndefOr[Boolean] = js.native
}
object SkipHtmlProp {
  
  @scala.inline
  def apply(): SkipHtmlProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipHtmlProp]
  }
  
  @scala.inline
  implicit class SkipHtmlPropOps[Self <: SkipHtmlProp] (val x: Self) extends AnyVal {
    
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
    def setSkipHtml(value: Boolean): Self = this.set("skipHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipHtml: Self = this.set("skipHtml", js.undefined)
  }
}
