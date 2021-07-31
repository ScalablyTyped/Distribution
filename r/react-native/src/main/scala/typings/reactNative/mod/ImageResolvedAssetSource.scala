package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageResolvedAssetSource extends StObject {
  
  var height: Double
  
  var scale: Double
  
  var uri: String
  
  var width: Double
}
object ImageResolvedAssetSource {
  
  @scala.inline
  def apply(height: Double, scale: Double, uri: String, width: Double): ImageResolvedAssetSource = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResolvedAssetSource]
  }
  
  @scala.inline
  implicit class ImageResolvedAssetSourceMutableBuilder[Self <: ImageResolvedAssetSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
