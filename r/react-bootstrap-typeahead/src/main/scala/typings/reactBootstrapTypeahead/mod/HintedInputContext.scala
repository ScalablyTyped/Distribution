package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.HintedInputContextKeys> */
@js.native
trait HintedInputContext[T /* <: TypeaheadModel */] extends js.Object {
  
  var hintText: js.UndefOr[String] = js.native
  
  var initialItem: js.UndefOr[T] = js.native
  
  var onAdd: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.native
  
  var selectHintOnEnter: js.UndefOr[Boolean] = js.native
}
object HintedInputContext {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](): HintedInputContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintedInputContext[T]]
  }
  
  @scala.inline
  implicit class HintedInputContextOps[Self <: HintedInputContext[_], T /* <: TypeaheadModel */] (val x: Self with HintedInputContext[T]) extends AnyVal {
    
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
    def setHintText(value: String): Self = this.set("hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintText: Self = this.set("hintText", js.undefined)
    
    @scala.inline
    def setInitialItem(value: T): Self = this.set("initialItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialItem: Self = this.set("initialItem", js.undefined)
    
    @scala.inline
    def setOnAdd(value: /* option */ T => Unit): Self = this.set("onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    
    @scala.inline
    def setSelectHintOnEnter(value: Boolean): Self = this.set("selectHintOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectHintOnEnter: Self = this.set("selectHintOnEnter", js.undefined)
  }
}
