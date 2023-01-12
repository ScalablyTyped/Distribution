package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.hardbreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait HardbreakToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_HardbreakToken: hardbreak
}
object HardbreakToken {
  
  inline def apply(level: Double): HardbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hardbreak")
    __obj.asInstanceOf[HardbreakToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HardbreakToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: hardbreak): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
