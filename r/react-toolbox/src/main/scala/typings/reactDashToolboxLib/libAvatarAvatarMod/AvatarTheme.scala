package typings
package reactDashToolboxLib.libAvatarAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarTheme extends js.Object {
  /**
    * Used for the root class of the element.
    */
  var avatar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element when the component has image.
    */
  var image: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element if the component shows the letter.
    */
  var letter: js.UndefOr[java.lang.String] = js.undefined
}

object AvatarTheme {
  @scala.inline
  def apply(avatar: java.lang.String = null, image: java.lang.String = null, letter: java.lang.String = null): AvatarTheme = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (image != null) __obj.updateDynamic("image")(image)
    if (letter != null) __obj.updateDynamic("letter")(letter)
    __obj.asInstanceOf[AvatarTheme]
  }
}

