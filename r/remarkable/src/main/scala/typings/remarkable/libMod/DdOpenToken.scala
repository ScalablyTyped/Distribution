package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dd_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DdOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_DdOpenToken: dd_open
}
object DdOpenToken {
  
  inline def apply(level: Double): DdOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dd_open")
    __obj.asInstanceOf[DdOpenToken]
  }
  
  extension [Self <: DdOpenToken](x: Self) {
    
    inline def setType(value: dd_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
