package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveContainerProps extends js.Object {
  var aspect: js.UndefOr[scala.Double] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactNode
  var className: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var debounce: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var maxHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var minHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var minWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ResponsiveContainerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    aspect: scala.Int | scala.Double = null,
    className: java.lang.String | scala.Double = null,
    debounce: scala.Int | scala.Double = null,
    height: java.lang.String | scala.Double = null,
    id: java.lang.String | scala.Double = null,
    maxHeight: java.lang.String | scala.Double = null,
    minHeight: java.lang.String | scala.Double = null,
    minWidth: java.lang.String | scala.Double = null,
    width: java.lang.String | scala.Double = null
  ): ResponsiveContainerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveContainerProps]
  }
}

