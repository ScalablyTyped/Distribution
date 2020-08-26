package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Active extends js.Object {
  var active: js.UndefOr[TextStyle] = js.native
  var container: js.UndefOr[ViewStyle] = js.native
  var disabled: js.UndefOr[TextStyle] = js.native
}

object Active {
  @scala.inline
  def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
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
    def setActive(value: TextStyle): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setActiveNull: Self = this.set("active", null)
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setDisabled(value: TextStyle): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledNull: Self = this.set("disabled", null)
  }
  
}

