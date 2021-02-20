package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.sub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait SubToken extends ContentToken {
  
  @JSName("content")
  var content_SubToken: String = js.native
  
  @JSName("type")
  var type_SubToken: sub = js.native
}
object SubToken {
  
  @scala.inline
  def apply(content: String, level: Double, `type`: sub): SubToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubToken]
  }
  
  @scala.inline
  implicit class SubTokenMutableBuilder[Self <: SubToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: sub): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
