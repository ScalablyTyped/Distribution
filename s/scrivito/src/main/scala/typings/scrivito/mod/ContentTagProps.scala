package typings.scrivito.mod

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTagProps
  extends HTMLAttributes[js.Any] {
  
  var attribute: String = js.native
  
  var content: Obj | Widget = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var widgetProps: js.UndefOr[js.Object] = js.native
}
object ContentTagProps {
  
  @scala.inline
  def apply(attribute: String, content: Obj | Widget): ContentTagProps = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTagProps]
  }
  
  @scala.inline
  implicit class ContentTagPropsOps[Self <: ContentTagProps] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Obj | Widget): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setWidgetProps(value: js.Object): Self = this.set("widgetProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidgetProps: Self = this.set("widgetProps", js.undefined)
  }
}
