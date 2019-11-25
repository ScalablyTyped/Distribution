package typings.reactDashFilepond.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondSvgIconProps extends js.Object {
  var iconProcess: js.UndefOr[String] = js.undefined
  var iconRemove: js.UndefOr[String] = js.undefined
  var iconRetry: js.UndefOr[String] = js.undefined
  var iconUndo: js.UndefOr[String] = js.undefined
}

object FilePondSvgIconProps {
  @scala.inline
  def apply(
    iconProcess: String = null,
    iconRemove: String = null,
    iconRetry: String = null,
    iconUndo: String = null
  ): FilePondSvgIconProps = {
    val __obj = js.Dynamic.literal()
    if (iconProcess != null) __obj.updateDynamic("iconProcess")(iconProcess.asInstanceOf[js.Any])
    if (iconRemove != null) __obj.updateDynamic("iconRemove")(iconRemove.asInstanceOf[js.Any])
    if (iconRetry != null) __obj.updateDynamic("iconRetry")(iconRetry.asInstanceOf[js.Any])
    if (iconUndo != null) __obj.updateDynamic("iconUndo")(iconUndo.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondSvgIconProps]
  }
}

