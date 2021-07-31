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
  
  @scala.inline
  def apply(alt: String, level: Double, src: String, title: String): ImageToken = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[ImageToken]
  }
  
  @scala.inline
  implicit class ImageTokenMutableBuilder[Self <: ImageToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
