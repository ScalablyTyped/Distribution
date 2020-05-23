package typings.reactSimpleMaps.mod

import typings.react.mod.SVGAttributes
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposableMapProps extends SVGAttributes[SVGSVGElement] {
  /**
    * @default 600
    */
  @JSName("height")
  var height_ComposableMapProps: js.UndefOr[Double] = js.undefined
  /**
    * @default "geoEqualEarth"
    */
  var projection: js.UndefOr[String | ProjectionFunction] = js.undefined
  /**
    * @default {}
    */
  var projectionConfig: js.UndefOr[ProjectionConfig] = js.undefined
  /**
    * @default 800
    */
  @JSName("width")
  var width_ComposableMapProps: js.UndefOr[Double] = js.undefined
}

object ComposableMapProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[SVGSVGElement] = null,
    height: js.UndefOr[Double] = js.undefined,
    projection: String | ProjectionFunction = null,
    projectionConfig: ProjectionConfig = null,
    width: js.UndefOr[Double] = js.undefined
  ): ComposableMapProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (projectionConfig != null) __obj.updateDynamic("projectionConfig")(projectionConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposableMapProps]
  }
}

