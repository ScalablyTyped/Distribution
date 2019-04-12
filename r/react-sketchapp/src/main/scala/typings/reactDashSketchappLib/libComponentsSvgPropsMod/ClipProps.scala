package typings
package reactDashSketchappLib.libComponentsSvgPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipProps extends js.Object {
  var clipPath: js.UndefOr[java.lang.String] = js.undefined
  var clipRule: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.evenodd | reactDashSketchappLib.reactDashSketchappLibStrings.nonzero
  ] = js.undefined
}

object ClipProps {
  @scala.inline
  def apply(
    clipPath: java.lang.String = null,
    clipRule: reactDashSketchappLib.reactDashSketchappLibStrings.evenodd | reactDashSketchappLib.reactDashSketchappLibStrings.nonzero = null
  ): ClipProps = {
    val __obj = js.Dynamic.literal()
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath)
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipProps]
  }
}

