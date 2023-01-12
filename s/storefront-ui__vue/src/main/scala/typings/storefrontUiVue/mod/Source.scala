package typings.storefrontUiVue.mod

import typings.storefrontUiVue.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var big: js.UndefOr[Url] = js.undefined
  
  var desktop: js.UndefOr[Url] = js.undefined
  
  var mobile: js.UndefOr[Url] = js.undefined
  
  var zoom: js.UndefOr[Url] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setBig(value: Url): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
    
    inline def setBigUndefined: Self = StObject.set(x, "big", js.undefined)
    
    inline def setDesktop(value: Url): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    inline def setMobile(value: Url): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setZoom(value: Url): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
