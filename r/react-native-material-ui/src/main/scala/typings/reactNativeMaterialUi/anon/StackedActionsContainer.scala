package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackedActionsContainer extends js.Object {
  var stackedActionsContainer: js.UndefOr[ViewStyle] = js.native
}

object StackedActionsContainer {
  @scala.inline
  def apply(): StackedActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackedActionsContainer]
  }
  @scala.inline
  implicit class StackedActionsContainerOps[Self <: StackedActionsContainer] (val x: Self) extends AnyVal {
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
    def setStackedActionsContainer(value: ViewStyle): Self = this.set("stackedActionsContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedActionsContainer: Self = this.set("stackedActionsContainer", js.undefined)
    @scala.inline
    def setStackedActionsContainerNull: Self = this.set("stackedActionsContainer", null)
  }
  
}

