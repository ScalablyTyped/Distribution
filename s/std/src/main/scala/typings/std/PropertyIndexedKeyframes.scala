package typings.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyIndexedKeyframes
  extends StObject
     with /* standard dom */
/* property */ StringDictionary[
      js.UndefOr[java.lang.String | (js.Array[Double | Null | java.lang.String]) | Double | Null]
    ] {
  
  /* standard dom */
  var composite: js.UndefOr[CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]] = js.undefined
  
  /* standard dom */
  var easing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  
  /* standard dom */
  var offset: js.UndefOr[Double | (js.Array[Double | Null])] = js.undefined
}
object PropertyIndexedKeyframes {
  
  inline def apply(): PropertyIndexedKeyframes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyIndexedKeyframes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyIndexedKeyframes] (val x: Self) extends AnyVal {
    
    inline def setComposite(value: CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    inline def setCompositeVarargs(value: CompositeOperationOrAuto*): Self = StObject.set(x, "composite", js.Array(value*))
    
    inline def setEasing(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEasingVarargs(value: java.lang.String*): Self = StObject.set(x, "easing", js.Array(value*))
    
    inline def setOffset(value: Double | (js.Array[Double | Null])): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: (Double | Null)*): Self = StObject.set(x, "offset", js.Array(value*))
  }
}
