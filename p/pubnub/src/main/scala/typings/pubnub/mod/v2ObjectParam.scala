package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait v2ObjectParam[Custom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[Custom] = js.native
}
object v2ObjectParam {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](): v2ObjectParam[Custom] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[v2ObjectParam[Custom]]
  }
  
  @scala.inline
  implicit class v2ObjectParamMutableBuilder[Self <: v2ObjectParam[_], Custom /* <: ObjectCustom */] (val x: Self with v2ObjectParam[Custom]) extends AnyVal {
    
    @scala.inline
    def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
  }
}
