package typings.storybookUi.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFullscreen extends StObject {
  
  var isFullscreen: Boolean
  
  var position: CSSProperties
}
object IsFullscreen {
  
  inline def apply(isFullscreen: Boolean, position: CSSProperties): IsFullscreen = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFullscreen]
  }
  
  extension [Self <: IsFullscreen](x: Self) {
    
    inline def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: CSSProperties): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
