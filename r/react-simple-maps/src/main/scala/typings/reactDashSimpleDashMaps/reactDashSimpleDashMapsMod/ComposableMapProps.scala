package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.react.reactMod.SVGAttributes
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
    height: Int | Double = null,
    projection: String | ProjectionFunction = null,
    projectionConfig: ProjectionConfig = null,
    width: Int | Double = null
  ): ComposableMapProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (projectionConfig != null) __obj.updateDynamic("projectionConfig")(projectionConfig.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposableMapProps]
  }
}

