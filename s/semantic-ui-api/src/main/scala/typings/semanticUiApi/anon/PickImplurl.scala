package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'url'> */
@js.native
trait PickImplurl extends js.Object {
  var url: String | `false` = js.native
}

object PickImplurl {
  @scala.inline
  def apply(url: String | `false`): PickImplurl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurl]
  }
  @scala.inline
  implicit class PickImplurlOps[Self <: PickImplurl] (val x: Self) extends AnyVal {
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
    def setUrl(value: String | `false`): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

