package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.paragraph_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait ParagraphCloseToken
  extends StObject
     with ParagraphToken {
  
  @JSName("type")
  var type_ParagraphCloseToken: paragraph_close
}
object ParagraphCloseToken {
  
  inline def apply(level: Double, tight: Boolean): ParagraphCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("paragraph_close")
    __obj.asInstanceOf[ParagraphCloseToken]
  }
  
  extension [Self <: ParagraphCloseToken](x: Self) {
    
    inline def setType(value: paragraph_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
