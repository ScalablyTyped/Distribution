package typings.storybookAddonNotes.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkdownParameter extends _Parameters {
  
  var markdown: String = js.native
}
object MarkdownParameter {
  
  @scala.inline
  def apply(markdown: String): MarkdownParameter = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownParameter]
  }
  
  @scala.inline
  implicit class MarkdownParameterOps[Self <: MarkdownParameter] (val x: Self) extends AnyVal {
    
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
    def setMarkdown(value: String): Self = this.set("markdown", value.asInstanceOf[js.Any])
  }
}
