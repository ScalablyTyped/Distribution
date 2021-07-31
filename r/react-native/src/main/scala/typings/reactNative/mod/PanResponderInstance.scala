package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanResponderInstance extends StObject {
  
  var panHandlers: GestureResponderHandlers
}
object PanResponderInstance {
  
  @scala.inline
  def apply(panHandlers: GestureResponderHandlers): PanResponderInstance = {
    val __obj = js.Dynamic.literal(panHandlers = panHandlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanResponderInstance]
  }
  
  @scala.inline
  implicit class PanResponderInstanceMutableBuilder[Self <: PanResponderInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPanHandlers(value: GestureResponderHandlers): Self = StObject.set(x, "panHandlers", value.asInstanceOf[js.Any])
  }
}
