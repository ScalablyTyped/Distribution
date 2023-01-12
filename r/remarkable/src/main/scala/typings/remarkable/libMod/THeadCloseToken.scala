package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.thead_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait THeadCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_THeadCloseToken: thead_close
}
object THeadCloseToken {
  
  inline def apply(level: Double): THeadCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("thead_close")
    __obj.asInstanceOf[THeadCloseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: THeadCloseToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: thead_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
