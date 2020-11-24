package typings.reduxPromiseListener.mod.ReduxPromiseListener

import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config[StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn] extends js.Object {
  
  var getError: js.UndefOr[js.Function1[/* action */ RejectAction, _]] = js.native
  
  var getPayload: js.UndefOr[js.Function1[/* action */ ResolveAction, TReturn]] = js.native
  
  var reject: String | ActionMatcher = js.native
  
  var resolve: String | ActionMatcher = js.native
  
  var setPayload: js.UndefOr[js.Function2[/* action */ StartAction, /* payload */ js.Any, AnyAction]] = js.native
  
  var start: String = js.native
}
object Config {
  
  @scala.inline
  def apply[StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn](reject: String | ActionMatcher, resolve: String | ActionMatcher, start: String): Config[StartAction, ResolveAction, RejectAction, TReturn] = {
    val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[StartAction, ResolveAction, RejectAction, TReturn]]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config[_, _, _, _], StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn] (val x: Self with (Config[StartAction, ResolveAction, RejectAction, TReturn])) extends AnyVal {
    
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
    def setRejectFunction1(value: /* action */ AnyAction => Boolean): Self = this.set("reject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReject(value: String | ActionMatcher): Self = this.set("reject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveFunction1(value: /* action */ AnyAction => Boolean): Self = this.set("resolve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolve(value: String | ActionMatcher): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetError(value: /* action */ RejectAction => _): Self = this.set("getError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetError: Self = this.set("getError", js.undefined)
    
    @scala.inline
    def setGetPayload(value: /* action */ ResolveAction => TReturn): Self = this.set("getPayload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPayload: Self = this.set("getPayload", js.undefined)
    
    @scala.inline
    def setSetPayload(value: (/* action */ StartAction, /* payload */ js.Any) => AnyAction): Self = this.set("setPayload", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetPayload: Self = this.set("setPayload", js.undefined)
  }
}
