package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/sketch/Sketch.SketchPickerStylesProps>> */
trait PartialClassesSketchPicke extends js.Object {
  var default: js.UndefOr[PartialSketchPickerStyles] = js.undefined
}

object PartialClassesSketchPicke {
  @scala.inline
  def apply(default: PartialSketchPickerStyles = null): PartialClassesSketchPicke = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesSketchPicke]
  }
}

