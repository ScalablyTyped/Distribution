package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBitmapRenderingContextSettings extends StObject {
  
  /* standard dom */
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
}
object ImageBitmapRenderingContextSettings {
  
  inline def apply(): ImageBitmapRenderingContextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapRenderingContextSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageBitmapRenderingContextSettings] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: scala.Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
  }
}
