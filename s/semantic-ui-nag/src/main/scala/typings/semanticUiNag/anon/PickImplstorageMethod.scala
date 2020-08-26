package typings.semanticUiNag.anon

import typings.semanticUiNag.semanticUiNagStrings.cookie
import typings.semanticUiNag.semanticUiNagStrings.localstorage
import typings.semanticUiNag.semanticUiNagStrings.sessionstorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'storageMethod'> */
@js.native
trait PickImplstorageMethod extends js.Object {
  var storageMethod: cookie | localstorage | sessionstorage = js.native
}

object PickImplstorageMethod {
  @scala.inline
  def apply(storageMethod: cookie | localstorage | sessionstorage): PickImplstorageMethod = {
    val __obj = js.Dynamic.literal(storageMethod = storageMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstorageMethod]
  }
  @scala.inline
  implicit class PickImplstorageMethodOps[Self <: PickImplstorageMethod] (val x: Self) extends AnyVal {
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
    def setStorageMethod(value: cookie | localstorage | sessionstorage): Self = this.set("storageMethod", value.asInstanceOf[js.Any])
  }
  
}

