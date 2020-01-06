package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.SVGAttributes
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SphereProps
  extends SVGAttributes[SVGPathElement]
     with ClassAttributes[SVGPathElement] {
  /**
    * @default "transparent"
    */
  @JSName("fill")
  var fill_SphereProps: String
  /**
    * @default "rsm-sphere"
    */
  @JSName("id")
  var id_SphereProps: String
  /**
    * @default 0.5
    */
  @JSName("strokeWidth")
  var strokeWidth_SphereProps: Double
  /**
    * @default "currentcolor"
    */
  @JSName("stroke")
  var stroke_SphereProps: String
}

object SphereProps {
  @scala.inline
  def apply(
    fill: String,
    id: String,
    stroke: String,
    strokeWidth: Double,
    ClassAttributes: ClassAttributes[SVGPathElement] = null,
    SVGAttributes: SVGAttributes[SVGPathElement] = null
  ): SphereProps = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    __obj.asInstanceOf[SphereProps]
  }
}

