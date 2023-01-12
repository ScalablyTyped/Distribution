package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dd_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DdCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_DdCloseToken: dd_close
}
object DdCloseToken {
  
  inline def apply(level: Double): DdCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dd_close")
    __obj.asInstanceOf[DdCloseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DdCloseToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: dd_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
