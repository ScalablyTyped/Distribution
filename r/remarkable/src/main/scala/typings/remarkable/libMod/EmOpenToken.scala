package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.em_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait EmOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_EmOpenToken: em_open
}
object EmOpenToken {
  
  inline def apply(level: Double): EmOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("em_open")
    __obj.asInstanceOf[EmOpenToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmOpenToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: em_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
