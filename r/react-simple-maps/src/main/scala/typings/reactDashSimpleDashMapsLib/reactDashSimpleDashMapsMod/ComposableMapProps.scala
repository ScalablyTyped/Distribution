package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposableMapProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defs: js.UndefOr[stdLib.SVGDefsElement] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var projection: js.UndefOr[java.lang.String | ProjectionFunction] = js.undefined
  var projectionConfig: js.UndefOr[stdLib.Partial[ProjectionConfig]] = js.undefined
  var showCenter: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ComposableMapProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defs: stdLib.SVGDefsElement = null,
    height: scala.Int | scala.Double = null,
    preserveAspectRatio: java.lang.String = null,
    projection: java.lang.String | ProjectionFunction = null,
    projectionConfig: stdLib.Partial[ProjectionConfig] = null,
    showCenter: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    viewBox: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): ComposableMapProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defs != null) __obj.updateDynamic("defs")(defs)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (projectionConfig != null) __obj.updateDynamic("projectionConfig")(projectionConfig)
    if (!js.isUndefined(showCenter)) __obj.updateDynamic("showCenter")(showCenter)
    if (style != null) __obj.updateDynamic("style")(style)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposableMapProps]
  }
}

