package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.blockquote_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait BlockquoteCloseToken extends TagToken {
  
  @JSName("type")
  var type_BlockquoteCloseToken: blockquote_close = js.native
}
object BlockquoteCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: blockquote_close): BlockquoteCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteCloseToken]
  }
  
  @scala.inline
  implicit class BlockquoteCloseTokenMutableBuilder[Self <: BlockquoteCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: blockquote_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
