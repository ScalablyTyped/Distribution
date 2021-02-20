package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableCallbackArgument extends DraggableStyle {
  
  var dx: Double = js.native
  
  var dy: Double = js.native
}
object DraggableCallbackArgument {
  
  @scala.inline
  def apply(dx: Double, dy: Double): DraggableCallbackArgument = {
    val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableCallbackArgument]
  }
  
  @scala.inline
  implicit class DraggableCallbackArgumentMutableBuilder[Self <: DraggableCallbackArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
  }
}
