package typings.reduxThunk.anon

import typings.redux.mod.AnyAction
import typings.reduxThunk.mod.ThunkMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithExtraArgument extends js.Object {
  
  def withExtraArgument[E](extraArgument: E): ThunkMiddleware[js.Object, AnyAction, E] = js.native
}
object WithExtraArgument {
  
  @scala.inline
  def apply(withExtraArgument: js.Any => ThunkMiddleware[js.Object, AnyAction, js.Any]): WithExtraArgument = {
    val __obj = js.Dynamic.literal(withExtraArgument = js.Any.fromFunction1(withExtraArgument))
    __obj.asInstanceOf[WithExtraArgument]
  }
  
  @scala.inline
  implicit class WithExtraArgumentOps[Self <: WithExtraArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWithExtraArgument(value: js.Any => ThunkMiddleware[js.Object, AnyAction, js.Any]): Self = this.set("withExtraArgument", js.Any.fromFunction1(value))
  }
}
