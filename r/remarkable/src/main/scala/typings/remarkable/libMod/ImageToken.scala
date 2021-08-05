package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait ImageToken
  extends StObject
     with ContentToken {
  
  /**
    * Image alt.
    */
  var alt: String
  
  /**
    * Image url.
    */
  var src: String
  
  /**
    * Image title.
    */
  var title: String
  
  @JSName("type")
  var type_ImageToken: image
}
object ImageToken {
  
  inline def apply(alt: String, level: Double, src: String, title: String): ImageToken = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[ImageToken]
  }
  
  extension [Self <: ImageToken](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
