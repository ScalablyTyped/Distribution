package typings
package reactDashSketchappLib.libComponentsSvgImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode] = js.undefined
  var height: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var href: java.lang.String
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var width: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var x: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
  var y: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    height: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    href: java.lang.String,
    width: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    children: js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode = null,
    preserveAspectRatio: java.lang.String = null,
    x: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    y: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], href = href, width = width.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

