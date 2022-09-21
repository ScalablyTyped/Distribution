package typings.reactPaymentInputs.anon

import typings.reactPaymentInputs.mod.CardImages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Images extends StObject {
  
  var images: CardImages
}
object Images {
  
  inline def apply(images: CardImages): Images = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
  
  extension [Self <: Images](x: Self) {
    
    inline def setImages(value: CardImages): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
  }
}
