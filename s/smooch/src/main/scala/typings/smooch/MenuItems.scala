package typings.smooch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItems extends StObject {
  
  /**
    * Enables the file upload menu item.
    * @default true
    */
  var fileUpload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables the image upload menu item.
    * @default true
    */
  var imageUpload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables the share location menu item.
    * @default true
    */
  var shareLocation: js.UndefOr[Boolean] = js.undefined
}
object MenuItems {
  
  inline def apply(): MenuItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItems]
  }
  
  extension [Self <: MenuItems](x: Self) {
    
    inline def setFileUpload(value: Boolean): Self = StObject.set(x, "fileUpload", value.asInstanceOf[js.Any])
    
    inline def setFileUploadUndefined: Self = StObject.set(x, "fileUpload", js.undefined)
    
    inline def setImageUpload(value: Boolean): Self = StObject.set(x, "imageUpload", value.asInstanceOf[js.Any])
    
    inline def setImageUploadUndefined: Self = StObject.set(x, "imageUpload", js.undefined)
    
    inline def setShareLocation(value: Boolean): Self = StObject.set(x, "shareLocation", value.asInstanceOf[js.Any])
    
    inline def setShareLocationUndefined: Self = StObject.set(x, "shareLocation", js.undefined)
  }
}
