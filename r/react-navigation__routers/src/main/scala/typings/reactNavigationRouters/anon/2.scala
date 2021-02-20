package typings.reactNavigationRouters.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2`[Params /* <: js.UndefOr[js.Object] */] extends StObject {
  
  /**
    * Params for this route
    */
  var params: js.UndefOr[Params] = js.native
}
object `2` {
  
  @scala.inline
  def apply[Params /* <: js.UndefOr[js.Object] */](): `2`[Params] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[Params]]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`[_], Params /* <: js.UndefOr[js.Object] */] (val x: Self with `2`[Params]) extends AnyVal {
    
    @scala.inline
    def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
