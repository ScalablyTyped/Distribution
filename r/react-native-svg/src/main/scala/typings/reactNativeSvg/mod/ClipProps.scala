package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipProps extends js.Object {
  var clipPath: js.UndefOr[String] = js.undefined
  var clipRule: js.UndefOr[FillRule] = js.undefined
}

object ClipProps {
  @scala.inline
  def apply(clipPath: String = null, clipRule: FillRule = null): ClipProps = {
    val __obj = js.Dynamic.literal()
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipProps]
  }
}

