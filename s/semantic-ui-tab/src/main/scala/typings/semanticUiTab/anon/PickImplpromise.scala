package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, 'promise'> */
@js.native
trait PickImplpromise extends js.Object {
  var promise: String = js.native
}

object PickImplpromise {
  @scala.inline
  def apply(promise: String): PickImplpromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpromise]
  }
  @scala.inline
  implicit class PickImplpromiseOps[Self <: PickImplpromise] (val x: Self) extends AnyVal {
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
    def setPromise(value: String): Self = this.set("promise", value.asInstanceOf[js.Any])
  }
  
}

