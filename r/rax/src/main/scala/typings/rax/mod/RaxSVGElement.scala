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
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxSVGElement]
  }
}

