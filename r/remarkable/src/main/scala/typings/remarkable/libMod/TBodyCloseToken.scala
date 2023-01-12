package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.tbody_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TBodyCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_TBodyCloseToken: tbody_close
}
object TBodyCloseToken {
  
  inline def apply(level: Double): TBodyCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tbody_close")
    __obj.asInstanceOf[TBodyCloseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TBodyCloseToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: tbody_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
