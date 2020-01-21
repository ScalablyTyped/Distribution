package typings.reactFa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends SizeOverrideHTMLProps[Icon] {
  var Component: js.UndefOr[CustomComponent] = js.undefined
  var fixedWidth: js.UndefOr[Boolean] = js.undefined
  var flip: js.UndefOr[IconFlip] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  @JSName("name")
  var name_IconProps: String
  var pulse: js.UndefOr[Boolean] = js.undefined
  var rotate: js.UndefOr[IconRotation] = js.undefined
  @JSName("size")
  var size_IconProps: js.UndefOr[IconSize] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
  var stack: js.UndefOr[IconStackSize] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    name: String,
    Component: CustomComponent = null,
    SizeOverrideHTMLProps: SizeOverrideHTMLProps[Icon] = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    flip: IconFlip = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    pulse: js.UndefOr[Boolean] = js.undefined,
    rotate: IconRotation = null,
    size: IconSize = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    stack: IconStackSize = null
  ): IconProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (SizeOverrideHTMLProps != null) js.Dynamic.global.Object.assign(__obj, SizeOverrideHTMLProps)
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

