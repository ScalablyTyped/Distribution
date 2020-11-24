package typings.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// setObservableConfig: https://github.com/acdlite/recompose/blob/master/docs/API.md#setObservableConfig
@js.native
trait ObservableConfig extends js.Object {
  
  var fromESObservable: js.UndefOr[js.Function1[/* observable */ Subscribable[_], _]] = js.native
  
  var toESObservable: js.UndefOr[js.Function1[/* stream */ js.Any, Subscribable[_]]] = js.native
}
object ObservableConfig {
  
  @scala.inline
  def apply(): ObservableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableConfig]
  }
  
  @scala.inline
  implicit class ObservableConfigOps[Self <: ObservableConfig] (val x: Self) extends AnyVal {
    
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
    def setFromESObservable(value: /* observable */ Subscribable[_] => _): Self = this.set("fromESObservable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFromESObservable: Self = this.set("fromESObservable", js.undefined)
    
    @scala.inline
    def setToESObservable(value: /* stream */ js.Any => Subscribable[_]): Self = this.set("toESObservable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToESObservable: Self = this.set("toESObservable", js.undefined)
  }
}
