package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait FootnoteGenericToken extends TagToken {
  
  /**
    * Footnote id.
    */
  var id: Double = js.native
  
  /**
    * Footnote sub id.
    */
  var subId: js.UndefOr[Double] = js.native
}
object FootnoteGenericToken {
  
  @scala.inline
  def apply(id: Double, level: Double, `type`: String): FootnoteGenericToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteGenericToken]
  }
  
  @scala.inline
  implicit class FootnoteGenericTokenMutableBuilder[Self <: FootnoteGenericToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubId(value: Double): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubIdUndefined: Self = StObject.set(x, "subId", js.undefined)
  }
}
