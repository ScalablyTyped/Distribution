package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.paragraph_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait ParagraphOpenToken extends ParagraphToken {
  
  @JSName("type")
  var type_ParagraphOpenToken: paragraph_open = js.native
}
object ParagraphOpenToken {
  
  @scala.inline
  def apply(level: Double, tight: Boolean, `type`: paragraph_open): ParagraphOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphOpenToken]
  }
  
  @scala.inline
  implicit class ParagraphOpenTokenMutableBuilder[Self <: ParagraphOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: paragraph_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
