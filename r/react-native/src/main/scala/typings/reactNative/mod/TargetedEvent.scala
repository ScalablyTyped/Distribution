package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetedEvent extends StObject {
  
  var target: Double = js.native
}
object TargetedEvent {
  
  @scala.inline
  def apply(target: Double): TargetedEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedEvent]
  }
  
  @scala.inline
  implicit class TargetedEventMutableBuilder[Self <: TargetedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
