package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomGestureProps extends StObject {
  
  var config: js.Array[moves] = js.native
  
  def onGesture(): Unit = js.native
}
object CustomGestureProps {
  
  @scala.inline
  def apply(config: js.Array[moves], onGesture: () => Unit): CustomGestureProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], onGesture = js.Any.fromFunction0(onGesture))
    __obj.asInstanceOf[CustomGestureProps]
  }
  
  @scala.inline
  implicit class CustomGesturePropsMutableBuilder[Self <: CustomGestureProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: js.Array[moves]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigVarargs(value: moves*): Self = StObject.set(x, "config", js.Array(value :_*))
    
    @scala.inline
    def setOnGesture(value: () => Unit): Self = StObject.set(x, "onGesture", js.Any.fromFunction0(value))
  }
}
