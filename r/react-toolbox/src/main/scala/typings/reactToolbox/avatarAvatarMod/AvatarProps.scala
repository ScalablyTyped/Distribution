package typings.reactToolbox.avatarAvatarMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarProps
  extends Props
     with /**
  * Additional properties passed to inner input element.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Set to true if your image is not squared so it will be used as a cover for the element.
    * @default false
    */
  var cover: js.UndefOr[Boolean] = js.native
  /**
    * A key to identify an Icon from Material Design Icons or a custom Icon Element.
    */
  var icon: js.UndefOr[ReactNode] = js.native
  /**
    * An image source or an image element.
    */
  var image: js.UndefOr[ReactNode] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[AvatarTheme] = js.native
  /**
    * A title for the image. If no image is provided, the first letter will be displayed as the avatar.
    */
  var title: js.UndefOr[String] = js.native
}

object AvatarProps {
  @scala.inline
  def apply(): AvatarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarProps]
  }
  @scala.inline
  implicit class AvatarPropsOps[Self <: AvatarProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCover(value: Boolean): Self = this.set("cover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCover: Self = this.set("cover", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setImage(value: ReactNode): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setTheme(value: AvatarTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

