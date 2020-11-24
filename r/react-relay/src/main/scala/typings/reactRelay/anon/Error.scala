package typings.reactRelay.anon

import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error[TOperation /* <: OperationType */] extends js.Object {
  
  var error: typings.std.Error | Null = js.native
  
  var props: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) | Null = js.native
  
  var retry: js.Function0[Unit] | Null = js.native
}
object Error {
  
  @scala.inline
  def apply[TOperation /* <: OperationType */](): Error[TOperation] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error[TOperation]]
  }
  
  @scala.inline
  implicit class ErrorOps[Self <: Error[_], TOperation /* <: OperationType */] (val x: Self with Error[TOperation]) extends AnyVal {
    
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
    def setError(value: typings.std.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    
    @scala.inline
    def setProps(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsNull: Self = this.set("props", null)
    
    @scala.inline
    def setRetry(value: () => Unit): Self = this.set("retry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRetryNull: Self = this.set("retry", null)
  }
}
