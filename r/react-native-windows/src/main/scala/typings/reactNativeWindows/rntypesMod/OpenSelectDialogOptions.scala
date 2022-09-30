package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenSelectDialogOptions extends StObject {
  
  /** Defaults to true */
  var showImages: js.UndefOr[Boolean] = js.undefined
  
  /** Defaults to false */
  var showVideos: js.UndefOr[Boolean] = js.undefined
}
object OpenSelectDialogOptions {
  
  inline def apply(): OpenSelectDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenSelectDialogOptions]
  }
  
  extension [Self <: OpenSelectDialogOptions](x: Self) {
    
    inline def setShowImages(value: Boolean): Self = StObject.set(x, "showImages", value.asInstanceOf[js.Any])
    
    inline def setShowImagesUndefined: Self = StObject.set(x, "showImages", js.undefined)
    
    inline def setShowVideos(value: Boolean): Self = StObject.set(x, "showVideos", value.asInstanceOf[js.Any])
    
    inline def setShowVideosUndefined: Self = StObject.set(x, "showVideos", js.undefined)
  }
}
