package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait ImageToken extends ContentToken {
  
  /**
    * Image alt.
    */
  var alt: String = js.native
  
  /**
    * Image url.
    */
  var src: String = js.native
  
  /**
    * Image title.
    */
  var title: String = js.native
  
  @JSName("type")
  var type_ImageToken: image = js.native
}
object ImageToken {
  
  @scala.inline
  def apply(alt: String, level: Double, src: String, title: String, `type`: image): ImageToken = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
