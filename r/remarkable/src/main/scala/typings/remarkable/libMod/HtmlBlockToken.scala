package typings.remarkable.libMod

import typings.remarkable.remarkableBooleans.`false`
import typings.remarkable.remarkableStrings.htmlblock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait HtmlBlockToken
  extends StObject
     with ContentToken {
  
  @JSName("block")
  var block_HtmlBlockToken: `false`
  
  @JSName("content")
  var content_HtmlBlockToken: String
  
  @JSName("type")
  var type_HtmlBlockToken: htmlblock
}
object HtmlBlockToken {
  
  inline def apply(content: String, level: Double): HtmlBlockToken = {
    val __obj = js.Dynamic.literal(block = false, content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("htmlblock")
    __obj.asInstanceOf[HtmlBlockToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlBlockToken] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: `false`): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: htmlblock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
