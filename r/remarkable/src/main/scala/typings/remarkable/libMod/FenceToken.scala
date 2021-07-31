package typings.remarkable.libMod

import typings.remarkable.remarkableBooleans.`false`
import typings.remarkable.remarkableStrings.fence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FenceToken
  extends StObject
     with ContentToken {
  
  @JSName("block")
  var block_FenceToken: js.UndefOr[`false`] = js.undefined
  
  @JSName("content")
  var content_FenceToken: String
  
  /**
    * Fenced block params.
    */
  var params: String
  
  @JSName("type")
  var type_FenceToken: fence
}
object FenceToken {
  
  @scala.inline
  def apply(content: String, level: Double, params: String): FenceToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fence")
    __obj.asInstanceOf[FenceToken]
  }
  
  @scala.inline
  implicit class FenceTokenMutableBuilder[Self <: FenceToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: `false`): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: fence): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
