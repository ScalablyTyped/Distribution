package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.sub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait SubToken
  extends StObject
     with ContentToken {
  
  @JSName("content")
  var content_SubToken: String
  
  @JSName("type")
  var type_SubToken: sub
}
object SubToken {
  
  inline def apply(content: String, level: Double): SubToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sub")
    __obj.asInstanceOf[SubToken]
  }
  
  extension [Self <: SubToken](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: sub): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
