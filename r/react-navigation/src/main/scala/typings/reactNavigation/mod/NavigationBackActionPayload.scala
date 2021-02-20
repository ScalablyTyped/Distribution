package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBackActionPayload extends StObject {
  
  var immediate: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String | Null] = js.native
}
object NavigationBackActionPayload {
  
  @scala.inline
  def apply(): NavigationBackActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBackActionPayload]
  }
  
  @scala.inline
  implicit class NavigationBackActionPayloadMutableBuilder[Self <: NavigationBackActionPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
