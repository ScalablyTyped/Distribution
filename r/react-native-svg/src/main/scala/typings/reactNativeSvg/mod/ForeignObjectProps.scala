package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeignObjectProps extends js.Object {
  var height: js.UndefOr[NumberProp] = js.undefined
  var width: js.UndefOr[NumberProp] = js.undefined
  var x: js.UndefOr[NumberProp] = js.undefined
  var y: js.UndefOr[NumberProp] = js.undefined
}

object ForeignObjectProps {
  @scala.inline
  def apply(height: NumberProp = null, width: NumberProp = null, x: NumberProp = null, y: NumberProp = null): ForeignObjectProps = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignObjectProps]
  }
}

