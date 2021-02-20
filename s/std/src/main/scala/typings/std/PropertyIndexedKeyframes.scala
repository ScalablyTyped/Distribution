package typings.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyIndexedKeyframes
  extends /* property */ StringDictionary[
      js.UndefOr[java.lang.String | (js.Array[Double | Null | java.lang.String]) | Double | Null]
    ] {
  
  var composite: js.UndefOr[CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]] = js.native
  
  var easing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  
  var offset: js.UndefOr[Double | (js.Array[Double | Null])] = js.native
}
object PropertyIndexedKeyframes {
  
  @scala.inline
  def apply(): PropertyIndexedKeyframes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyIndexedKeyframes]
  }
  
  @scala.inline
  implicit class PropertyIndexedKeyframesMutableBuilder[Self <: PropertyIndexedKeyframes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComposite(value: CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    @scala.inline
    def setCompositeVarargs(value: CompositeOperationOrAuto*): Self = StObject.set(x, "composite", js.Array(value :_*))
    
    @scala.inline
    def setEasing(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setEasingVarargs(value: java.lang.String*): Self = StObject.set(x, "easing", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double | (js.Array[Double | Null])): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: (Double | Null)*): Self = StObject.set(x, "offset", js.Array(value :_*))
  }
}
