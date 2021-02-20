package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait CodeToken extends BlockContentToken {
  
  /**
    * Code: `true` if block, `false` if inline.
    */
  var block: Boolean = js.native
  
  @JSName("type")
  var type_CodeToken: code = js.native
}
object CodeToken {
  
  @scala.inline
  def apply(block: Boolean, level: Double, `type`: code): CodeToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeToken]
  }
  
  @scala.inline
  implicit class CodeTokenMutableBuilder[Self <: CodeToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
