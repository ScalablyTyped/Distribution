package typings.semanticUiNag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl, 'noStorage'> */
@js.native
trait PickImplnoStorage extends js.Object {
  var noStorage: String = js.native
}

object PickImplnoStorage {
  @scala.inline
  def apply(noStorage: String): PickImplnoStorage = {
    val __obj = js.Dynamic.literal(noStorage = noStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoStorage]
  }
  @scala.inline
  implicit class PickImplnoStorageOps[Self <: PickImplnoStorage] (val x: Self) extends AnyVal {
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
    def setNoStorage(value: String): Self = this.set("noStorage", value.asInstanceOf[js.Any])
  }
  
}

