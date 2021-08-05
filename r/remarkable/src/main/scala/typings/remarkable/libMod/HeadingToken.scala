package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait HeadingToken
  extends StObject
     with TagToken {
  
  var hLevel: HeadingValue
}
object HeadingToken {
  
  inline def apply(hLevel: HeadingValue, level: Double, `type`: String): HeadingToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingToken]
  }
  
  extension [Self <: HeadingToken](x: Self) {
    
    inline def setHLevel(value: HeadingValue): Self = StObject.set(x, "hLevel", value.asInstanceOf[js.Any])
  }
}
