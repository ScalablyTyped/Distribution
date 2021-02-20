package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsFullscreenIsToolshown extends StObject {
  
  var isFullscreen: Boolean = js.native
  
  var isToolshown: Boolean = js.native
}
object IsFullscreenIsToolshown {
  
  @scala.inline
  def apply(isFullscreen: Boolean, isToolshown: Boolean): IsFullscreenIsToolshown = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFullscreenIsToolshown]
  }
  
  @scala.inline
  implicit class IsFullscreenIsToolshownMutableBuilder[Self <: IsFullscreenIsToolshown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToolshown(value: Boolean): Self = StObject.set(x, "isToolshown", value.asInstanceOf[js.Any])
  }
}
