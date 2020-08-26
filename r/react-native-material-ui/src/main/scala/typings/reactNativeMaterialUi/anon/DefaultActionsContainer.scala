package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultActionsContainer extends js.Object {
  var defaultActionsContainer: js.UndefOr[ViewStyle] = js.native
}

object DefaultActionsContainer {
  @scala.inline
  def apply(): DefaultActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultActionsContainer]
  }
  @scala.inline
  implicit class DefaultActionsContainerOps[Self <: DefaultActionsContainer] (val x: Self) extends AnyVal {
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
    def setDefaultActionsContainer(value: ViewStyle): Self = this.set("defaultActionsContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActionsContainer: Self = this.set("defaultActionsContainer", js.undefined)
    @scala.inline
    def setDefaultActionsContainerNull: Self = this.set("defaultActionsContainer", null)
  }
  
}

