package typings.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyIndexedKeyframes
  extends StObject
     with /* property */ StringDictionary[
      js.UndefOr[java.lang.String | (js.Array[Double | Null | java.lang.String]) | Double | Null]
    ] {
  
  var composite: js.UndefOr[CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]] = js.undefined
  
  var easing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  
  var offset: js.UndefOr[Double | (js.Array[Double | Null])] = js.undefined
}
object PropertyIndexedKeyframes {
  
  inline def apply(): PropertyIndexedKeyframes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyIndexedKeyframes]
  }
  
  extension [Self <: PropertyIndexedKeyframes](x: Self) {
    
    inline def setComposite(value: CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    inline def setCompositeVarargs(value: CompositeOperationOrAuto*): Self = StObject.set(x, "composite", js.Array(value :_*))
    
    inline def setEasing(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEasingVarargs(value: java.lang.String*): Self = StObject.set(x, "easing", js.Array(value :_*))
    
    inline def setOffset(value: Double | (js.Array[Double | Null])): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: (Double | Null)*): Self = StObject.set(x, "offset", js.Array(value :_*))
  }
}
