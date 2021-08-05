package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFullscreenIsToolshown extends StObject {
  
  var isFullscreen: Boolean
  
  var isToolshown: Boolean
}
object IsFullscreenIsToolshown {
  
  inline def apply(isFullscreen: Boolean, isToolshown: Boolean): IsFullscreenIsToolshown = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFullscreenIsToolshown]
  }
  
  extension [Self <: IsFullscreenIsToolshown](x: Self) {
    
    inline def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
    
    inline def setIsToolshown(value: Boolean): Self = StObject.set(x, "isToolshown", value.asInstanceOf[js.Any])
  }
}
