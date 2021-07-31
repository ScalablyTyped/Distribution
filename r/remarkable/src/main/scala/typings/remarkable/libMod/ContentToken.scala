package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait ContentToken
  extends StObject
     with TagToken {
  
  /**
    * Is this a block element
    */
  var block: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A text token has a `content` property. This is passed to
    * the corresponding renderer to be converted for output.
    */
  var content: js.UndefOr[js.Any] = js.undefined
}
object ContentToken {
  
  @scala.inline
  def apply(level: Double, `type`: String): ContentToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentToken]
  }
  
  @scala.inline
  implicit class ContentTokenMutableBuilder[Self <: ContentToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
