package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.th_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait THOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_THOpenToken: th_open
}
object THOpenToken {
  
  inline def apply(level: Double): THOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("th_open")
    __obj.asInstanceOf[THOpenToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: THOpenToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: th_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
