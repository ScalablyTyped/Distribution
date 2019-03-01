package typings
package reactDashBootstrapLib.libMediaHeadingMod.MediaHeadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaHeadingProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libMediaHeadingMod.MediaHeading] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object MediaHeadingProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libMediaHeadingMod.MediaHeading] = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): MediaHeadingProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaHeadingProps]
  }
}

