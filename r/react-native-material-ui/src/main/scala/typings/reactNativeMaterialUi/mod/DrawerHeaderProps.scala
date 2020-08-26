package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Image
import typings.reactNativeMaterialUi.anon.ContainerContentContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerHeaderProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var children: js.UndefOr[Element] = js.native
  var image: js.UndefOr[js.Array[Image]] = js.native
  var style: js.UndefOr[ContainerContentContainer] = js.native
}

object DrawerHeaderProps {
  @scala.inline
  def apply(): DrawerHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerHeaderProps]
  }
  @scala.inline
  implicit class DrawerHeaderPropsOps[Self <: DrawerHeaderProps] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setChildren(value: Element): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setImageVarargs(value: Image*): Self = this.set("image", js.Array(value :_*))
    @scala.inline
    def setImage(value: js.Array[Image]): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setStyle(value: ContainerContentContainer): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

