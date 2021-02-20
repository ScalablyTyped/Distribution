package typings.remarkable.libMod

import typings.remarkable.remarkableBooleans.`false`
import typings.remarkable.remarkableStrings.htmlblock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait HtmlBlockToken extends ContentToken {
  
  @JSName("block")
  var block_HtmlBlockToken: `false` = js.native
  
  @JSName("content")
  var content_HtmlBlockToken: String = js.native
  
  @JSName("type")
  var type_HtmlBlockToken: htmlblock = js.native
}
object HtmlBlockToken {
  
  @scala.inline
  def apply(block: `false`, content: String, level: Double, `type`: htmlblock): HtmlBlockToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlBlockToken]
  }
  
  @scala.inline
  implicit class HtmlBlockTokenMutableBuilder[Self <: HtmlBlockToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: `false`): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: htmlblock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
