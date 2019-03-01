package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondSvgIconProps extends js.Object {
  var iconProcess: js.UndefOr[java.lang.String] = js.undefined
  var iconRemove: js.UndefOr[java.lang.String] = js.undefined
  var iconRetry: js.UndefOr[java.lang.String] = js.undefined
  var iconUndo: js.UndefOr[java.lang.String] = js.undefined
}

object FilePondSvgIconProps {
  @scala.inline
  def apply(
    iconProcess: java.lang.String = null,
    iconRemove: java.lang.String = null,
    iconRetry: java.lang.String = null,
    iconUndo: java.lang.String = null
  ): FilePondSvgIconProps = {
    val __obj = js.Dynamic.literal()
    if (iconProcess != null) __obj.updateDynamic("iconProcess")(iconProcess)
    if (iconRemove != null) __obj.updateDynamic("iconRemove")(iconRemove)
    if (iconRetry != null) __obj.updateDynamic("iconRetry")(iconRetry)
    if (iconUndo != null) __obj.updateDynamic("iconUndo")(iconUndo)
    __obj.asInstanceOf[FilePondSvgIconProps]
  }
}

