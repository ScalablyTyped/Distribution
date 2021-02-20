package typings.scrivito.mod

import typings.scrivito.scrivitoStrings.bottom
import typings.scrivito.scrivitoStrings.center
import typings.scrivito.scrivitoStrings.crop
import typings.scrivito.scrivitoStrings.left
import typings.scrivito.scrivitoStrings.resize
import typings.scrivito.scrivitoStrings.right
import typings.scrivito.scrivitoStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimizeDefinition extends StObject {
  
  // Fix this being able to be filled when using fit = resize
  var crop: center | top | left | right | bottom = js.native
  
  var fit: resize | crop = js.native
  
  var height: Double | String = js.native
  
  var width: Double | String = js.native
}
object OptimizeDefinition {
  
  @scala.inline
  def apply(
    crop: center | top | left | right | bottom,
    fit: resize | crop,
    height: Double | String,
    width: Double | String
  ): OptimizeDefinition = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizeDefinition]
  }
  
  @scala.inline
  implicit class OptimizeDefinitionMutableBuilder[Self <: OptimizeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrop(value: center | top | left | right | bottom): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFit(value: resize | crop): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
