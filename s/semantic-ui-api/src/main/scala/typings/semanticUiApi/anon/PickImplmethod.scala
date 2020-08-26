package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiStrings.delete
import typings.semanticUiApi.semanticUiApiStrings.get
import typings.semanticUiApi.semanticUiApiStrings.head
import typings.semanticUiApi.semanticUiApiStrings.options
import typings.semanticUiApi.semanticUiApiStrings.patch
import typings.semanticUiApi.semanticUiApiStrings.post
import typings.semanticUiApi.semanticUiApiStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'method'> */
@js.native
trait PickImplmethod extends js.Object {
  var method: post | get | put | delete | head | options | patch = js.native
}

object PickImplmethod {
  @scala.inline
  def apply(method: post | get | put | delete | head | options | patch): PickImplmethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmethod]
  }
  @scala.inline
  implicit class PickImplmethodOps[Self <: PickImplmethod] (val x: Self) extends AnyVal {
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
    def setMethod(value: post | get | put | delete | head | options | patch): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

