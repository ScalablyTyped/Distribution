package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaneLayout extends StObject {
  
  /* standard dom */
  var offset: Double
  
  /* standard dom */
  var stride: Double
}
object PlaneLayout {
  
  inline def apply(offset: Double, stride: Double): PlaneLayout = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaneLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaneLayout] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setStride(value: Double): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
  }
}
