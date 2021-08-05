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
  
  inline def apply(content: String, level: Double): HtmlTagToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("htmltag")
    __obj.asInstanceOf[HtmlTagToken]
  }
  
  extension [Self <: HtmlTagToken](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: htmltag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
