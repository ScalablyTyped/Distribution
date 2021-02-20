package typings.reactNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2`[P] extends StObject {
  
  var params: js.UndefOr[P] = js.native
}
object `2` {
  
  @scala.inline
  def apply[P](): `2`[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[P]]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`[_], P] (val x: Self with `2`[P]) extends AnyVal {
    
    @scala.inline
    def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
