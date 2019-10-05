package typings.recharts.rechartsMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveContainerProps extends js.Object {
  var aspect: js.UndefOr[Double] = js.undefined
  var children: ReactNode
  var className: js.UndefOr[String | Double] = js.undefined
  var debounce: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var maxHeight: js.UndefOr[String | Double] = js.undefined
  var minHeight: js.UndefOr[String | Double] = js.undefined
  var minWidth: js.UndefOr[String | Double] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object ResponsiveContainerProps {
  @scala.inline
  def apply(
    aspect: Int | Double = null,
    children: ReactNode = null,
    className: String | Double = null,
    debounce: Int | Double = null,
    height: String | Double = null,
    id: String | Double = null,
    maxHeight: String | Double = null,
    minHeight: String | Double = null,
    minWidth: String | Double = null,
    width: String | Double = null
  ): ResponsiveContainerProps = {
    val __obj = js.Dynamic.literal()
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
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

