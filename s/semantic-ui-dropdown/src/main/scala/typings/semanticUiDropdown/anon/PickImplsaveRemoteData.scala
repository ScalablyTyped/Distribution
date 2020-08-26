package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'saveRemoteData'> */
@js.native
trait PickImplsaveRemoteData extends js.Object {
  var saveRemoteData: Boolean = js.native
}

object PickImplsaveRemoteData {
  @scala.inline
  def apply(saveRemoteData: Boolean): PickImplsaveRemoteData = {
    val __obj = js.Dynamic.literal(saveRemoteData = saveRemoteData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsaveRemoteData]
  }
  @scala.inline
  implicit class PickImplsaveRemoteDataOps[Self <: PickImplsaveRemoteData] (val x: Self) extends AnyVal {
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
    def setSaveRemoteData(value: Boolean): Self = this.set("saveRemoteData", value.asInstanceOf[js.Any])
  }
  
}

