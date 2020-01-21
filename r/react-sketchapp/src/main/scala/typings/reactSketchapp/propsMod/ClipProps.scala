package typings.reactSketchapp.propsMod

import typings.reactSketchapp.reactSketchappStrings.evenodd
import typings.reactSketchapp.reactSketchappStrings.nonzero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipProps extends js.Object {
  var clipPath: js.UndefOr[String] = js.undefined
  var clipRule: js.UndefOr[evenodd | nonzero] = js.undefined
}

object ClipProps {
  @scala.inline
  def apply(clipPath: String = null, clipRule: evenodd | nonzero = null): ClipProps = {
    val __obj = js.Dynamic.literal()
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipProps]
  }
}

