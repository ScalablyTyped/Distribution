package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// RaxSVG for RaxSVGElement
trait RaxSVGElement extends DOMElement[SVGAttributes[SVGElement], SVGElement]

object RaxSVGElement {
  @scala.inline
  def apply(
    props: SVGAttributes[SVGElement],
    `type`: String,
    key: Key = null,
    ref: LegacyRef[SVGElement] = null
  ): RaxSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxSVGElement]
  }
}

