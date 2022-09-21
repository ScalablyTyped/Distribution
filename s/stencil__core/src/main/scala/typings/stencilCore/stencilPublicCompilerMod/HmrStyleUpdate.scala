package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmrStyleUpdate extends StObject {
  
  var styleId: String
  
  var styleTag: String
  
  var styleText: String
}
object HmrStyleUpdate {
  
  inline def apply(styleId: String, styleTag: String, styleText: String): HmrStyleUpdate = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any], styleTag = styleTag.asInstanceOf[js.Any], styleText = styleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmrStyleUpdate]
  }
  
  extension [Self <: HmrStyleUpdate](x: Self) {
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
    
    inline def setStyleTag(value: String): Self = StObject.set(x, "styleTag", value.asInstanceOf[js.Any])
    
    inline def setStyleText(value: String): Self = StObject.set(x, "styleText", value.asInstanceOf[js.Any])
  }
}
