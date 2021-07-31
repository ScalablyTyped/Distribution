package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.mark_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait MarkOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_MarkOpenToken: mark_open
}
object MarkOpenToken {
  
  @scala.inline
  def apply(level: Double): MarkOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mark_open")
    __obj.asInstanceOf[MarkOpenToken]
  }
  
  @scala.inline
  implicit class MarkOpenTokenMutableBuilder[Self <: MarkOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: mark_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
