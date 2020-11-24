package typings.storybookComponents.descriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescriptionProps extends js.Object {
  
  var markdown: String = js.native
}
object DescriptionProps {
  
  @scala.inline
  def apply(markdown: String): DescriptionProps = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionProps]
  }
  
  @scala.inline
  implicit class DescriptionPropsOps[Self <: DescriptionProps] (val x: Self) extends AnyVal {
    
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
