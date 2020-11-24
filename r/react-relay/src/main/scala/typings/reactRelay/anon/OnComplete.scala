package typings.reactRelay.anon

import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnComplete[TQuery /* <: OperationType */] extends js.Object {
  
  var UNSTABLE_extraVariables: js.UndefOr[Partial[VariablesOf[TQuery]]] = js.native
  
  var onComplete: js.UndefOr[js.Function1[/* arg */ typings.std.Error | Null, Unit]] = js.native
}
object OnComplete {
  
  @scala.inline
  def apply[TQuery /* <: OperationType */](): OnComplete[TQuery] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnComplete[TQuery]]
  }
  
  @scala.inline
  implicit class OnCompleteOps[Self <: OnComplete[_], TQuery /* <: OperationType */] (val x: Self with OnComplete[TQuery]) extends AnyVal {
    
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
    def setUNSTABLE_extraVariables(value: Partial[VariablesOf[TQuery]]): Self = this.set("UNSTABLE_extraVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUNSTABLE_extraVariables: Self = this.set("UNSTABLE_extraVariables", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* arg */ typings.std.Error | Null => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
  }
}
