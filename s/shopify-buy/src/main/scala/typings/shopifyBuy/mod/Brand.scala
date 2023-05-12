package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  var colors: BrandColors
  
  var coverImage: js.UndefOr[MediaImage] = js.undefined
  
  var logo: js.UndefOr[MediaImage] = js.undefined
  
  var shortDescription: js.UndefOr[String] = js.undefined
  
  var slogan: js.UndefOr[String] = js.undefined
  
  var squareLogo: js.UndefOr[MediaImage] = js.undefined
}
object Brand {
  
  inline def apply(colors: BrandColors): Brand = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brand] (val x: Self) extends AnyVal {
    
    inline def setColors(value: BrandColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setCoverImage(value: MediaImage): Self = StObject.set(x, "coverImage", value.asInstanceOf[js.Any])
    
    inline def setCoverImageUndefined: Self = StObject.set(x, "coverImage", js.undefined)
    
    inline def setLogo(value: MediaImage): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    inline def setSlogan(value: String): Self = StObject.set(x, "slogan", value.asInstanceOf[js.Any])
    
    inline def setSloganUndefined: Self = StObject.set(x, "slogan", js.undefined)
    
    inline def setSquareLogo(value: MediaImage): Self = StObject.set(x, "squareLogo", value.asInstanceOf[js.Any])
    
    inline def setSquareLogoUndefined: Self = StObject.set(x, "squareLogo", js.undefined)
  }
}
