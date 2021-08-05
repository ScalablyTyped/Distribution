package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.em_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait EmCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_EmCloseToken: em_close
}
object EmCloseToken {
  
  inline def apply(level: Double): EmCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("em_close")
    __obj.asInstanceOf[EmCloseToken]
  }
  
  extension [Self <: EmCloseToken](x: Self) {
    
    inline def setType(value: em_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
