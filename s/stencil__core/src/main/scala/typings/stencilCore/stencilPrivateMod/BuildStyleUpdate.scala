package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildStyleUpdate extends StObject {
  
  var styleMode: String
  
  var styleTag: String
  
  var styleText: String
}
object BuildStyleUpdate {
  
  inline def apply(styleMode: String, styleTag: String, styleText: String): BuildStyleUpdate = {
    val __obj = js.Dynamic.literal(styleMode = styleMode.asInstanceOf[js.Any], styleTag = styleTag.asInstanceOf[js.Any], styleText = styleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildStyleUpdate]
  }
  
  extension [Self <: BuildStyleUpdate](x: Self) {
    
    inline def setStyleMode(value: String): Self = StObject.set(x, "styleMode", value.asInstanceOf[js.Any])
    
    inline def setStyleTag(value: String): Self = StObject.set(x, "styleTag", value.asInstanceOf[js.Any])
    
    inline def setStyleText(value: String): Self = StObject.set(x, "styleText", value.asInstanceOf[js.Any])
  }
}
