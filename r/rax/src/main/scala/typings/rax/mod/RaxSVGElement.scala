package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// RaxSVG for RaxSVGElement
@js.native
trait RaxSVGElement extends DOMElement[SVGAttributes[SVGElement], SVGElement]

object RaxSVGElement {
  @scala.inline
  def apply(props: SVGAttributes[SVGElement], `type`: String): RaxSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxSVGElement]
  }
}

