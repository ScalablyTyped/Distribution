package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaImage
  extends StObject
     with Node
     with Media
     with MetafieldReference {
  
  var image: Image
}
object MediaImage {
  
  inline def apply(id: ID, image: Image, mediaContentType: MediaContentType): MediaImage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], mediaContentType = mediaContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaImage] (val x: Self) extends AnyVal {
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
