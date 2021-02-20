package typings.reactJoyride.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreState extends StObject {
  
  var action: String = js.native
  
  var controlled: Boolean = js.native
  
  var index: Double = js.native
  
  var lifecycle: String = js.native
  
  var size: Double = js.native
  
  var status: String = js.native
}
object StoreState {
  
  @scala.inline
  def apply(
    action: String,
    controlled: Boolean,
    index: Double,
    lifecycle: String,
    size: Double,
    status: String
  ): StoreState = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], controlled = controlled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreState]
  }
  
  @scala.inline
  implicit class StoreStateMutableBuilder[Self <: StoreState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlled(value: Boolean): Self = StObject.set(x, "controlled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycle(value: String): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
