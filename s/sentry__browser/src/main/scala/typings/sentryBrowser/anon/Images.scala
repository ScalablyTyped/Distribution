package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Images extends StObject {
  
  var images: js.Array[Codefile]
}
object Images {
  
  inline def apply(images: js.Array[Codefile]): Images = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Images] (val x: Self) extends AnyVal {
    
    inline def setImages(value: js.Array[Codefile]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Codefile*): Self = StObject.set(x, "images", js.Array(value*))
  }
}
