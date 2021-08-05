package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.tbody_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TBodyOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_TBodyOpenToken: tbody_open
}
object TBodyOpenToken {
  
  inline def apply(level: Double): TBodyOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tbody_open")
    __obj.asInstanceOf[TBodyOpenToken]
  }
  
  extension [Self <: TBodyOpenToken](x: Self) {
    
    inline def setType(value: tbody_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
