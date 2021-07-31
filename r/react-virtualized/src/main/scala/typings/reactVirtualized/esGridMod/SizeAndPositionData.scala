package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeAndPositionData extends StObject {
  
  var offset: Double
  
  var size: Double
}
object SizeAndPositionData {
  
  @scala.inline
  def apply(offset: Double, size: Double): SizeAndPositionData = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeAndPositionData]
  }
  
  @scala.inline
  implicit class SizeAndPositionDataMutableBuilder[Self <: SizeAndPositionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
