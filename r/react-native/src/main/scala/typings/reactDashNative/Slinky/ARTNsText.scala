package typings.reactDashNative.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.ARTTextProps
import typings.reactDashNative.reactDashNativeStrings.bevel
import typings.reactDashNative.reactDashNativeStrings.butt
import typings.reactDashNative.reactDashNativeStrings.miter
import typings.reactDashNative.reactDashNativeStrings.round
import typings.reactDashNative.reactDashNativeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: title, stroke, fill */
object ARTNsText
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNative.reactDashNativeMod.ARTNs.Text] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNative.reactDashNativeMod.ARTNs.Text].asInstanceOf[String | js.Object]
  def apply(
    alignment: String = null,
    font: String = null,
    opacity: Int | Double = null,
    originX: Int | Double = null,
    originY: Int | Double = null,
    scale: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    strokeCap: butt | square | round = null,
    strokeDash: js.Array[Double] = null,
    strokeJoin: bevel | miter | round = null,
    strokeWidth: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): BuildingComponent[tag.type, typings.reactDashNative.reactDashNativeMod.ARTNs.Text] = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (font != null) __obj.updateDynamic("font")(font)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash)
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ARTTextProps
}

