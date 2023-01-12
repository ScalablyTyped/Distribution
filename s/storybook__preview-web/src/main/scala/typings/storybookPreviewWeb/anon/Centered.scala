package typings.storybookPreviewWeb.anon

import typings.storybookPreviewWeb.storybookPreviewWebStrings.`sb-main-centered`
import typings.storybookPreviewWeb.storybookPreviewWebStrings.`sb-main-fullscreen`
import typings.storybookPreviewWeb.storybookPreviewWebStrings.`sb-main-padded`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Centered extends StObject {
  
  val centered: `sb-main-centered`
  
  val fullscreen: `sb-main-fullscreen`
  
  val padded: `sb-main-padded`
}
object Centered {
  
  inline def apply(): Centered = {
    val __obj = js.Dynamic.literal(centered = "sb-main-centered", fullscreen = "sb-main-fullscreen", padded = "sb-main-padded")
    __obj.asInstanceOf[Centered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Centered] (val x: Self) extends AnyVal {
    
    inline def setCentered(value: `sb-main-centered`): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    inline def setFullscreen(value: `sb-main-fullscreen`): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setPadded(value: `sb-main-padded`): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
  }
}
