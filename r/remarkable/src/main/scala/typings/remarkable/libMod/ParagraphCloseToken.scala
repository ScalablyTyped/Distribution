package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.paragraph_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait ParagraphCloseToken extends ParagraphToken {
  
  @JSName("type")
  var type_ParagraphCloseToken: paragraph_close = js.native
}
object ParagraphCloseToken {
  
  @scala.inline
  def apply(level: Double, tight: Boolean, `type`: paragraph_close): ParagraphCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphCloseToken]
  }
  
  @scala.inline
  implicit class ParagraphCloseTokenMutableBuilder[Self <: ParagraphCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: paragraph_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
