package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.blockquote_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait BlockquoteOpenToken extends TagToken {
  
  @JSName("type")
  var type_BlockquoteOpenToken: blockquote_open = js.native
}
object BlockquoteOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: blockquote_open): BlockquoteOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteOpenToken]
  }
  
  @scala.inline
  implicit class BlockquoteOpenTokenMutableBuilder[Self <: BlockquoteOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: blockquote_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
