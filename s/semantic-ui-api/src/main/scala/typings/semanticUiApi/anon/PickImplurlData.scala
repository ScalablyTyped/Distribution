package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'urlData'> */
@js.native
trait PickImplurlData extends js.Object {
  var urlData: js.Any | `false` = js.native
}

object PickImplurlData {
  @scala.inline
  def apply(urlData: js.Any | `false`): PickImplurlData = {
    val __obj = js.Dynamic.literal(urlData = urlData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurlData]
  }
  @scala.inline
  implicit class PickImplurlDataOps[Self <: PickImplurlData] (val x: Self) extends AnyVal {
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
    def setUrlData(value: js.Any | `false`): Self = this.set("urlData", value.asInstanceOf[js.Any])
  }
  
}

