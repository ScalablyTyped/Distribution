package typings
package reactDashBootstrapLib.libMediaMod.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libMediaMod.Media] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object MediaProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libMediaMod.Media] = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): MediaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProps]
  }
}

