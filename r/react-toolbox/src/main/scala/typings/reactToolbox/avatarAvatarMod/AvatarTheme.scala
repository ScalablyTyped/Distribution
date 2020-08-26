package typings.reactToolbox.avatarAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarTheme extends js.Object {
  /**
    * Used for the root class of the element.
    */
  var avatar: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the component has image.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * Used for the root element if the component shows the letter.
    */
  var letter: js.UndefOr[String] = js.native
}

object AvatarTheme {
  @scala.inline
  def apply(): AvatarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarTheme]
  }
  @scala.inline
  implicit class AvatarThemeOps[Self <: AvatarTheme] (val x: Self) extends AnyVal {
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
    def setAvatar(value: String): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLetter(value: String): Self = this.set("letter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetter: Self = this.set("letter", js.undefined)
  }
  
}

