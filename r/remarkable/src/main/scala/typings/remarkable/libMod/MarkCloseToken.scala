package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.mark_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait MarkCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_MarkCloseToken: mark_close
}
object MarkCloseToken {
  
  inline def apply(level: Double): MarkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mark_close")
    __obj.asInstanceOf[MarkCloseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkCloseToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: mark_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
