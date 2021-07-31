package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.del_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DelCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_DelCloseToken: del_open
}
object DelCloseToken {
  
  @scala.inline
  def apply(level: Double): DelCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("del_open")
    __obj.asInstanceOf[DelCloseToken]
  }
  
  @scala.inline
  implicit class DelCloseTokenMutableBuilder[Self <: DelCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: del_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
