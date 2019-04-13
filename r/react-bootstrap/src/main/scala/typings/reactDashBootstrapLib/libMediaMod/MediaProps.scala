package typings
package reactDashBootstrapLib.libMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaProps
  extends reactLib.reactMod.HTMLProps[Media] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object MediaProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[Media] = null,
    componentClass: reactLib.reactMod.ReactType[_] = null
  ): MediaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProps]
  }
}

