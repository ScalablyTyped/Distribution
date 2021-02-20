package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenSelectDialogOptions extends StObject {
  
  /** Defaults to true */
  var showImages: js.UndefOr[Boolean] = js.native
  
  /** Defaults to false */
  var showVideos: js.UndefOr[Boolean] = js.native
}
object OpenSelectDialogOptions {
  
  @scala.inline
  def apply(): OpenSelectDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenSelectDialogOptions]
  }
  
  @scala.inline
  implicit class OpenSelectDialogOptionsMutableBuilder[Self <: OpenSelectDialogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowImages(value: Boolean): Self = StObject.set(x, "showImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowImagesUndefined: Self = StObject.set(x, "showImages", js.undefined)
    
    @scala.inline
    def setShowVideos(value: Boolean): Self = StObject.set(x, "showVideos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowVideosUndefined: Self = StObject.set(x, "showVideos", js.undefined)
  }
}
