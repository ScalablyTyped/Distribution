package typings.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CenterOffset extends StObject {
  
  var centerOffset: Double
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object CenterOffset {
  
  inline def apply(centerOffset: Double): CenterOffset = {
    val __obj = js.Dynamic.literal(centerOffset = centerOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CenterOffset] (val x: Self) extends AnyVal {
    
    inline def setCenterOffset(value: Double): Self = StObject.set(x, "centerOffset", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
