package typings.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderingOptions extends js.Object {
  
  var codeSyntaxHighlighting: Boolean = js.native
  
  var singleLineBreaks: js.UndefOr[Boolean] = js.native
}
object RenderingOptions {
  
  @scala.inline
  def apply(codeSyntaxHighlighting: Boolean): RenderingOptions = {
    val __obj = js.Dynamic.literal(codeSyntaxHighlighting = codeSyntaxHighlighting.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingOptions]
  }
  
  @scala.inline
  implicit class RenderingOptionsOps[Self <: RenderingOptions] (val x: Self) extends AnyVal {
    
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
    def setCodeSyntaxHighlighting(value: Boolean): Self = this.set("codeSyntaxHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleLineBreaks(value: Boolean): Self = this.set("singleLineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleLineBreaks: Self = this.set("singleLineBreaks", js.undefined)
  }
}
