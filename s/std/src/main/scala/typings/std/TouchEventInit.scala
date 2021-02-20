package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchEventInit extends EventModifierInit {
  
  var changedTouches: js.UndefOr[js.Array[Touch]] = js.native
  
  var targetTouches: js.UndefOr[js.Array[Touch]] = js.native
  
  var touches: js.UndefOr[js.Array[Touch]] = js.native
}
object TouchEventInit {
  
  @scala.inline
  def apply(): TouchEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchEventInit]
  }
  
  @scala.inline
  implicit class TouchEventInitMutableBuilder[Self <: TouchEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedTouches(value: js.Array[Touch]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedTouchesUndefined: Self = StObject.set(x, "changedTouches", js.undefined)
    
    @scala.inline
    def setChangedTouchesVarargs(value: Touch*): Self = StObject.set(x, "changedTouches", js.Array(value :_*))
    
    @scala.inline
    def setTargetTouches(value: js.Array[Touch]): Self = StObject.set(x, "targetTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTouchesUndefined: Self = StObject.set(x, "targetTouches", js.undefined)
    
    @scala.inline
    def setTargetTouchesVarargs(value: Touch*): Self = StObject.set(x, "targetTouches", js.Array(value :_*))
    
    @scala.inline
    def setTouches(value: js.Array[Touch]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchesUndefined: Self = StObject.set(x, "touches", js.undefined)
    
    @scala.inline
    def setTouchesVarargs(value: Touch*): Self = StObject.set(x, "touches", js.Array(value :_*))
  }
}
