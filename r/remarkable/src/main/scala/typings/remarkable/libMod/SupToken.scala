package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.sup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait SupToken extends ContentToken {
  
  @JSName("content")
  var content_SupToken: String = js.native
  
  @JSName("type")
  var type_SupToken: sup = js.native
}
object SupToken {
  
  @scala.inline
  def apply(content: String, level: Double, `type`: sup): SupToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupToken]
  }
  
  @scala.inline
  implicit class SupTokenMutableBuilder[Self <: SupToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: sup): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
