package typings.reactResizeDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-resize-detector.react-resize-detector.ReactResizeDetectorDimensions> */
trait PartialReactResizeDetecto extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialReactResizeDetecto {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): PartialReactResizeDetecto = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialReactResizeDetecto]
  }
}

