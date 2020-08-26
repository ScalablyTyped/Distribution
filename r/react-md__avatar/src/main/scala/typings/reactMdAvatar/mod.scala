package typings.reactMdAvatar

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdAvatar.avatarMod.AvatarProps
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/avatar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * An `Avatar` is generally used to represent objects or people within your app.
    * The avatar can consist of an image, an icon, or some text to display. When
    * the avatar is not an image, different themes can be applied to make the
    * avatar more unique.
    */
  val Avatar: ForwardRefExoticComponent[AvatarProps with RefAttributes[HTMLSpanElement]] = js.native
}

