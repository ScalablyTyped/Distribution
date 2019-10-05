package typings.react.reactMod

import typings.react.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ReactSVG for ReactSVGElement
trait ReactSVGElement extends DOMElement[SVGAttributes[SVGElement], SVGElement]

object ReactSVGElement {
  @scala.inline
  def apply(
    props: js.Any,
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    key: Key = null,
    ref: LegacyRef[SVGElement] = null
  ): ReactSVGElement = {
    val __obj = js.Dynamic.literal(props = props)
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSVGElement]
  }
}

