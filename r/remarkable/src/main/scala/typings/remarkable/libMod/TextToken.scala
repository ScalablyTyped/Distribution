package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait TextToken extends TagToken {
  
  var content: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_TextToken: text = js.native
}
object TextToken {
  
  @scala.inline
  def apply(level: Double, `type`: text): TextToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextToken]
  }
  
  @scala.inline
  implicit class TextTokenMutableBuilder[Self <: TextToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
