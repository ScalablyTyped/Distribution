package typings.storybookTheming.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSelector extends StObject {
  
  var __emotion_styles: Any
}
object ComponentSelector {
  
  inline def apply(__emotion_styles: Any): ComponentSelector = {
    val __obj = js.Dynamic.literal(__emotion_styles = __emotion_styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSelector]
  }
  
  extension [Self <: ComponentSelector](x: Self) {
    
    inline def set__emotion_styles(value: Any): Self = StObject.set(x, "__emotion_styles", value.asInstanceOf[js.Any])
  }
}
