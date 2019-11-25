package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.react.reactMod.CSSProperties
import typings.std.Partial
import typings.std.SVGDefsElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposableMapProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defs: js.UndefOr[SVGDefsElement] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  var projection: js.UndefOr[String | ProjectionFunction] = js.undefined
  var projectionConfig: js.UndefOr[Partial[ProjectionConfig]] = js.undefined
  var showCenter: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ComposableMapProps {
  @scala.inline
  def apply(
    className: String = null,
    defs: SVGDefsElement = null,
    height: Int | Double = null,
    preserveAspectRatio: String = null,
    projection: String | ProjectionFunction = null,
    projectionConfig: Partial[ProjectionConfig] = null,
    showCenter: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    viewBox: String = null,
    width: Int | Double = null
  ): ComposableMapProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (projectionConfig != null) __obj.updateDynamic("projectionConfig")(projectionConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(showCenter)) __obj.updateDynamic("showCenter")(showCenter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposableMapProps]
  }
}

