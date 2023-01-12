package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.tr_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TRCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_TRCloseToken: tr_close
}
object TRCloseToken {
  
  inline def apply(level: Double): TRCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tr_close")
    __obj.asInstanceOf[TRCloseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TRCloseToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: tr_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
