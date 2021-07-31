package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.abbr_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait AbbrOpenToken
  extends StObject
     with TagToken {
  
  /**
    * Abbreviation title.
    */
  var title: String
  
  @JSName("type")
  var type_AbbrOpenToken: abbr_open
}
object AbbrOpenToken {
  
  @scala.inline
  def apply(level: Double, title: String): AbbrOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("abbr_open")
    __obj.asInstanceOf[AbbrOpenToken]
  }
  
  @scala.inline
  implicit class AbbrOpenTokenMutableBuilder[Self <: AbbrOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: abbr_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
