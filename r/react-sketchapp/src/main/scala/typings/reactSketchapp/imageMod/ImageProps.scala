package typings.reactSketchapp.imageMod

import typings.react.mod.ReactNode
import typings.reactSketchapp.propsMod.NumberProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var height: NumberProp
  var href: String
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  var width: NumberProp
  var x: js.UndefOr[NumberProp] = js.undefined
  var y: js.UndefOr[NumberProp] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    height: NumberProp,
    href: String,
    width: NumberProp,
    children: js.Array[ReactNode] | ReactNode = null,
    preserveAspectRatio: String = null,
    x: NumberProp = null,
    y: NumberProp = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

