package typings.storybookApi.anon

import typings.storybookApi.mod.API
import typings.storybookApi.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Api extends StObject {
  
  var api: API = js.native
  
  var state: State = js.native
}
object Api {
  
  @scala.inline
  def apply(api: API, state: State): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  
  @scala.inline
  implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
