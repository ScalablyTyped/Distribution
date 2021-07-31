package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.htmltag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait HtmlTagToken
  extends StObject
     with ContentToken {
  
  @JSName("content")
  var content_HtmlTagToken: String
  
  @JSName("type")
  var type_HtmlTagToken: htmltag
}
object HtmlTagToken {
  
  @scala.inline
  def apply(content: String, level: Double): HtmlTagToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("htmltag")
    __obj.asInstanceOf[HtmlTagToken]
  }
  
  @scala.inline
  implicit class HtmlTagTokenMutableBuilder[Self <: HtmlTagToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: htmltag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
