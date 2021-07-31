package typings.scrivito.mod

import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTagProps
  extends StObject
     with HTMLAttributes[js.Any] {
  
  var attribute: String
  
  var content: Obj | Widget
  
  var tag: js.UndefOr[String] = js.undefined
  
  var widgetProps: js.UndefOr[js.Object] = js.undefined
}
object ContentTagProps {
  
  @scala.inline
  def apply(attribute: String, content: Obj | Widget): ContentTagProps = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTagProps]
  }
  
  @scala.inline
  implicit class ContentTagPropsMutableBuilder[Self <: ContentTagProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Obj | Widget): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setWidgetProps(value: js.Object): Self = StObject.set(x, "widgetProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetPropsUndefined: Self = StObject.set(x, "widgetProps", js.undefined)
  }
}
