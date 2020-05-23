package typings.react.mod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ReactSVG for ReactSVGElement
trait ReactSVGElement extends DOMElement[SVGAttributes[SVGElement], SVGElement]

object ReactSVGElement {
  @scala.inline
  def apply(props: js.Any, `type`: js.Any, key: Key = null, ref: LegacyRef[SVGElement] = null): ReactSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSVGElement]
  }
}

