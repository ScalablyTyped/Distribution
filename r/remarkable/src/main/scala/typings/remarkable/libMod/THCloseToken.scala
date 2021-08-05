package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.th_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait THCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_THCloseToken: th_close
}
object THCloseToken {
  
  inline def apply(level: Double): THCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("th_close")
    __obj.asInstanceOf[THCloseToken]
  }
  
  extension [Self <: THCloseToken](x: Self) {
    
    inline def setType(value: th_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
