package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDataSettings extends StObject {
  
  /* standard dom */
  var colorSpace: js.UndefOr[PredefinedColorSpace] = js.undefined
}
object ImageDataSettings {
  
  inline def apply(): ImageDataSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDataSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDataSettings] (val x: Self) extends AnyVal {
    
    inline def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
  }
}
