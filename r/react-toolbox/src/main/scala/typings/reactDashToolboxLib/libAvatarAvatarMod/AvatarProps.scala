package typings
package reactDashToolboxLib.libAvatarAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props
     with /**
  * Additional properties for component root element.
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Set to true if your image is not squared so it will be used as a cover for the element.
    * @default false
    */
  var cover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A key to identify an Icon from Material Design Icons or a custom Icon Element.
    */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * An image source or an image element.
    */
  var image: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[AvatarTheme] = js.undefined
  /**
    * A title for the image. If no image is provided, the first letter will be displayed as the avatar.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

