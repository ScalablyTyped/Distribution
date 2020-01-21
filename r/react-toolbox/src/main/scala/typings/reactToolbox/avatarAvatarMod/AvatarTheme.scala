package typings.reactToolbox.avatarAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarTheme extends js.Object {
  /**
    * Used for the root class of the element.
    */
  var avatar: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element when the component has image.
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element if the component shows the letter.
    */
  var letter: js.UndefOr[String] = js.undefined
}

object AvatarTheme {
  @scala.inline
  def apply(avatar: String = null, image: String = null, letter: String = null): AvatarTheme = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (letter != null) __obj.updateDynamic("letter")(letter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarTheme]
  }
}

