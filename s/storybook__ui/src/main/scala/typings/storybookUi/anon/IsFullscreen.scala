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
  
  @scala.inline
  def apply(isFullscreen: Boolean, position: CSSProperties): IsFullscreen = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFullscreen]
  }
  
  @scala.inline
  implicit class IsFullscreenMutableBuilder[Self <: IsFullscreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: CSSProperties): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
