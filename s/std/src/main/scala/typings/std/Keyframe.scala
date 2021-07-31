package typings.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyframe
  extends StObject
     with /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  
  var composite: js.UndefOr[CompositeOperationOrAuto] = js.undefined
  
  var easing: js.UndefOr[java.lang.String] = js.undefined
  
  var offset: js.UndefOr[Double | Null] = js.undefined
}
object Keyframe {
  
  @scala.inline
  def apply(): Keyframe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Keyframe]
  }
  
  @scala.inline
  implicit class KeyframeMutableBuilder[Self <: Keyframe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComposite(value: CompositeOperationOrAuto): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    @scala.inline
    def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
