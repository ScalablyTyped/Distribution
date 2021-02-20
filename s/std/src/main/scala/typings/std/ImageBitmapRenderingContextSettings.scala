package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBitmapRenderingContextSettings extends StObject {
  
  var alpha: js.UndefOr[scala.Boolean] = js.native
}
object ImageBitmapRenderingContextSettings {
  
  @scala.inline
  def apply(): ImageBitmapRenderingContextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapRenderingContextSettings]
  }
  
  @scala.inline
  implicit class ImageBitmapRenderingContextSettingsMutableBuilder[Self <: ImageBitmapRenderingContextSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: scala.Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
  }
}
