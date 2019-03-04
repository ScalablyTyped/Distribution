package typings
package reactDashFaLib.reactDashFaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends SizeOverrideHTMLProps[Icon] {
  var Component: js.UndefOr[reactDashFaLib.CustomComponent] = js.undefined
  var fixedWidth: js.UndefOr[scala.Boolean] = js.undefined
  var flip: js.UndefOr[IconFlip] = js.undefined
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("name")
  var name_IconProps: java.lang.String
  var pulse: js.UndefOr[scala.Boolean] = js.undefined
  var rotate: js.UndefOr[IconRotation] = js.undefined
  @JSName("size")
  var size_IconProps: js.UndefOr[IconSize] = js.undefined
  var spin: js.UndefOr[scala.Boolean] = js.undefined
  var stack: js.UndefOr[IconStackSize] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    Component: reactDashFaLib.CustomComponent = null,
    SizeOverrideHTMLProps: SizeOverrideHTMLProps[Icon] = null,
    fixedWidth: js.UndefOr[scala.Boolean] = js.undefined,
    flip: IconFlip = null,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    pulse: js.UndefOr[scala.Boolean] = js.undefined,
    rotate: IconRotation = null,
    size: IconSize = null,
    spin: js.UndefOr[scala.Boolean] = js.undefined,
    stack: IconStackSize = null
  ): IconProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, SizeOverrideHTMLProps)
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth)
    if (flip != null) __obj.updateDynamic("flip")(flip)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[IconProps]
  }
}

