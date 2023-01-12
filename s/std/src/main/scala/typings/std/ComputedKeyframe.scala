package typings.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedKeyframe
  extends StObject
     with /* standard dom */
/* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  
  /* standard dom */
  var composite: CompositeOperationOrAuto
  
  /* standard dom */
  var computedOffset: Double
  
  /* standard dom */
  var easing: java.lang.String
  
  /* standard dom */
  var offset: Double | Null
}
object ComputedKeyframe {
  
  inline def apply(composite: CompositeOperationOrAuto, computedOffset: Double, easing: java.lang.String): ComputedKeyframe = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], computedOffset = computedOffset.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], offset = null)
    __obj.asInstanceOf[ComputedKeyframe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputedKeyframe] (val x: Self) extends AnyVal {
    
    inline def setComposite(value: CompositeOperationOrAuto): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setComputedOffset(value: Double): Self = StObject.set(x, "computedOffset", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
  }
}
