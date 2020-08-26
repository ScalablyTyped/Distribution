package typings.storybookApi.initProviderApiMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubAPI extends js.Object {
  var renderPreview: js.UndefOr[js.Function0[ReactElement]] = js.native
}

object SubAPI {
  @scala.inline
  def apply(): SubAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubAPI]
  }
  @scala.inline
  implicit class SubAPIOps[Self <: SubAPI] (val x: Self) extends AnyVal {
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
    def setRenderPreview(value: () => ReactElement): Self = this.set("renderPreview", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderPreview: Self = this.set("renderPreview", js.undefined)
  }
  
}

