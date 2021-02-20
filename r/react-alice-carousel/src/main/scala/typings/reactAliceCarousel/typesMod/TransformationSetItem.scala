package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformationSetItem extends StObject {
  
  var position: Double = js.native
  
  var width: Double = js.native
}
object TransformationSetItem {
  
  @scala.inline
  def apply(position: Double, width: Double): TransformationSetItem = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationSetItem]
  }
  
  @scala.inline
  implicit class TransformationSetItemMutableBuilder[Self <: TransformationSetItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
