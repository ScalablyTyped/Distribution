package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait FootnoteOpenToken extends FootnoteGenericToken {
  
  @JSName("type")
  var type_FootnoteOpenToken: footnote_open = js.native
}
object FootnoteOpenToken {
  
  @scala.inline
  def apply(id: Double, level: Double, `type`: footnote_open): FootnoteOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteOpenToken]
  }
  
  @scala.inline
  implicit class FootnoteOpenTokenMutableBuilder[Self <: FootnoteOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: footnote_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
