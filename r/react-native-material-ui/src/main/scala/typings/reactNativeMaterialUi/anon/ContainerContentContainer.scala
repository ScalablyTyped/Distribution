package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerContentContainer extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.native
  var contentContainer: js.UndefOr[ViewStyle] = js.native
}

object ContainerContentContainer {
  @scala.inline
  def apply(): ContainerContentContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerContentContainer]
  }
  @scala.inline
  implicit class ContainerContentContainerOps[Self <: ContainerContentContainer] (val x: Self) extends AnyVal {
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
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setContentContainer(value: ViewStyle): Self = this.set("contentContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentContainer: Self = this.set("contentContainer", js.undefined)
    @scala.inline
    def setContentContainerNull: Self = this.set("contentContainer", null)
  }
  
}

