package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationPopActionPayload extends StObject {
  
  var immediate: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  // n: the number of routes to pop of the stack
  var n: js.UndefOr[Double] = js.native
  
  var prune: js.UndefOr[Boolean] = js.native
}
object NavigationPopActionPayload {
  
  @scala.inline
  def apply(): NavigationPopActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationPopActionPayload]
  }
  
  @scala.inline
  implicit class NavigationPopActionPayloadMutableBuilder[Self <: NavigationPopActionPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    @scala.inline
    def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
  }
}
