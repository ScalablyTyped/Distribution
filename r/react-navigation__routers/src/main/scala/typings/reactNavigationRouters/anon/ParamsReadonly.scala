package typings.reactNavigationRouters.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsReadonly[Params /* <: js.UndefOr[js.Object] */] extends StObject {
  
  /**
    * Params for this route
    */
  var params: Params = js.native
}
object ParamsReadonly {
  
  @scala.inline
  def apply[Params /* <: js.UndefOr[js.Object] */](params: Params): ParamsReadonly[Params] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsReadonly[Params]]
  }
  
  @scala.inline
  implicit class ParamsReadonlyMutableBuilder[Self <: ParamsReadonly[_], Params /* <: js.UndefOr[js.Object] */] (val x: Self with ParamsReadonly[Params]) extends AnyVal {
    
    @scala.inline
    def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
