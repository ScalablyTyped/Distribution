package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.strong_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait StrongCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_StrongCloseToken: strong_close
}
object StrongCloseToken {
  
  inline def apply(level: Double): StrongCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("strong_close")
    __obj.asInstanceOf[StrongCloseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrongCloseToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: strong_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
