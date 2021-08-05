package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.del_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DelOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_DelOpenToken: del_open
}
object DelOpenToken {
  
  inline def apply(level: Double): DelOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("del_open")
    __obj.asInstanceOf[DelOpenToken]
  }
  
  extension [Self <: DelOpenToken](x: Self) {
    
    inline def setType(value: del_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
