package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxSize extends StObject {
  
  var boxHeight: Double = js.native
  
  var boxWidth: Double = js.native
}
object BoxSize {
  
  @scala.inline
  def apply(boxHeight: Double, boxWidth: Double): BoxSize = {
    val __obj = js.Dynamic.literal(boxHeight = boxHeight.asInstanceOf[js.Any], boxWidth = boxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSize]
  }
  
  @scala.inline
  implicit class BoxSizeMutableBuilder[Self <: BoxSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxHeight(value: Double): Self = StObject.set(x, "boxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
  }
}
