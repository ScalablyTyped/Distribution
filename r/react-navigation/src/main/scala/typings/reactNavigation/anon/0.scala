package typings.reactNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[Params] extends StObject {
  
  var params: js.UndefOr[Params] = js.native
}
object `0` {
  
  @scala.inline
  def apply[Params](): `0`[Params] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[Params]]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`[_], Params] (val x: Self with `0`[Params]) extends AnyVal {
    
    @scala.inline
    def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
