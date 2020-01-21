package typings.reactSimpleMaps.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.SVGAttributes
import typings.react.mod.SVGProps
import typings.std.SVGGElement
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationProps
  extends SVGAttributes[SVGGElement]
     with ClassAttributes[SVGGElement] {
  var connectorProps: SVGProps[SVGPathElement]
  /**
    * @default 0
    */
  var curve: js.UndefOr[Double] = js.undefined
  var subject: js.UndefOr[Point] = js.undefined
}

object AnnotationProps {
  @scala.inline
  def apply(
    connectorProps: SVGProps[SVGPathElement],
    ClassAttributes: ClassAttributes[SVGGElement] = null,
    SVGAttributes: SVGAttributes[SVGGElement] = null,
    curve: Int | Double = null,
    subject: Point = null
  ): AnnotationProps = {
    val __obj = js.Dynamic.literal(connectorProps = connectorProps.asInstanceOf[js.Any])
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationProps]
  }
}

