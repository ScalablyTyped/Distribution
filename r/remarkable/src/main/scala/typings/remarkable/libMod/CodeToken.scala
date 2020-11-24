package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.code
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
  implicit class CodeTokenOps[Self <: CodeToken] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
