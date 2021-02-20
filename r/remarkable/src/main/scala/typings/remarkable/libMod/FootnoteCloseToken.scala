package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait FootnoteCloseToken extends FootnoteGenericToken {
  
  @JSName("type")
  var type_FootnoteCloseToken: footnote_close = js.native
}
object FootnoteCloseToken {
  
  @scala.inline
  def apply(id: Double, level: Double, `type`: footnote_close): FootnoteCloseToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteCloseToken]
  }
  
  @scala.inline
  implicit class FootnoteCloseTokenMutableBuilder[Self <: FootnoteCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: footnote_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
