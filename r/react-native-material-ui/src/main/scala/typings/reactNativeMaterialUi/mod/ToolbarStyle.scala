package typings.reactNativeMaterialUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarStyle extends js.Object {
  var centerElementContainer: js.UndefOr[ViewStyle] = js.native
  var container: js.UndefOr[ViewStyle] = js.native
  var leftElement: js.UndefOr[TextStyle] = js.native
  var leftElementContainer: js.UndefOr[ViewStyle] = js.native
  var rightElement: js.UndefOr[TextStyle] = js.native
  var rightElementContainer: js.UndefOr[ViewStyle] = js.native
  var titleText: js.UndefOr[TextStyle] = js.native
}

object ToolbarStyle {
  @scala.inline
  def apply(): ToolbarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarStyle]
  }
  @scala.inline
  implicit class ToolbarStyleOps[Self <: ToolbarStyle] (val x: Self) extends AnyVal {
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
    def setCenterElementContainer(value: ViewStyle): Self = this.set("centerElementContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterElementContainer: Self = this.set("centerElementContainer", js.undefined)
    @scala.inline
    def setCenterElementContainerNull: Self = this.set("centerElementContainer", null)
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setLeftElement(value: TextStyle): Self = this.set("leftElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftElement: Self = this.set("leftElement", js.undefined)
    @scala.inline
    def setLeftElementNull: Self = this.set("leftElement", null)
    @scala.inline
    def setLeftElementContainer(value: ViewStyle): Self = this.set("leftElementContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftElementContainer: Self = this.set("leftElementContainer", js.undefined)
    @scala.inline
    def setLeftElementContainerNull: Self = this.set("leftElementContainer", null)
    @scala.inline
    def setRightElement(value: TextStyle): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    @scala.inline
    def setRightElementNull: Self = this.set("rightElement", null)
    @scala.inline
    def setRightElementContainer(value: ViewStyle): Self = this.set("rightElementContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightElementContainer: Self = this.set("rightElementContainer", js.undefined)
    @scala.inline
    def setRightElementContainerNull: Self = this.set("rightElementContainer", null)
    @scala.inline
    def setTitleText(value: TextStyle): Self = this.set("titleText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleText: Self = this.set("titleText", js.undefined)
    @scala.inline
    def setTitleTextNull: Self = this.set("titleText", null)
  }
  
}

