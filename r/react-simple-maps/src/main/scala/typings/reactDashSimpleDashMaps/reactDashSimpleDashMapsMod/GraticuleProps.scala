package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.SVGAttributes
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleProps
  extends SVGAttributes[SVGPathElement]
     with ClassAttributes[SVGPathElement] {
  /**
    * @default [10, 10]
    */
  var step: js.UndefOr[Point] = js.undefined
}

object GraticuleProps {
  @scala.inline
  def apply(
    ClassAttributes: ClassAttributes[SVGPathElement] = null,
    SVGAttributes: SVGAttributes[SVGPathElement] = null,
    step: Point = null
  ): GraticuleProps = {
    val __obj = js.Dynamic.literal()
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleProps]
  }
}

