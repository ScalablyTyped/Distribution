package typings.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] extends js.Object {
  
  var always: js.UndefOr[handlerReducer[S, typings.redux.mod.Action[_]]] = js.native
  
  var failure: js.UndefOr[handlerReducer[S, PackActionPayload[TErrorPayload, TMetaPayload]]] = js.native
  
  var finish: js.UndefOr[handlerReducer[S, typings.redux.mod.Action[_]]] = js.native
  
  var start: js.UndefOr[handlerReducer[S, PackActionPayload[TStartPayload, TMetaPayload]]] = js.native
  
  var success: js.UndefOr[handlerReducer[S, PackActionPayload[TSuccessPayload, TMetaPayload]]] = js.native
}
object Handlers {
  
  @scala.inline
  def apply[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](): Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
  }
  
  @scala.inline
  implicit class HandlersOps[Self <: Handlers[_, _, _, _, _], S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] (val x: Self with (Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload])) extends AnyVal {
    
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
    def setAlways(value: (S, typings.redux.mod.Action[_]) => S): Self = this.set("always", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAlways: Self = this.set("always", js.undefined)
    
    @scala.inline
    def setFailure(value: (S, PackActionPayload[TErrorPayload, TMetaPayload]) => S): Self = this.set("failure", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    
    @scala.inline
    def setFinish(value: (S, typings.redux.mod.Action[_]) => S): Self = this.set("finish", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFinish: Self = this.set("finish", js.undefined)
    
    @scala.inline
    def setStart(value: (S, PackActionPayload[TStartPayload, TMetaPayload]) => S): Self = this.set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setSuccess(value: (S, PackActionPayload[TSuccessPayload, TMetaPayload]) => S): Self = this.set("success", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
