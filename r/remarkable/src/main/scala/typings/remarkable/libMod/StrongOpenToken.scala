package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.strong_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait StrongOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_StrongOpenToken: strong_open
}
object StrongOpenToken {
  
  inline def apply(level: Double): StrongOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("strong_open")
    __obj.asInstanceOf[StrongOpenToken]
  }
  
  extension [Self <: StrongOpenToken](x: Self) {
    
    inline def setType(value: strong_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
