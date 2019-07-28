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
    ref: LegacyRef[SVGElement],
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 55 */ js.Any,
    key: Key = null
  ): ReactSVGElement = {
    val __obj = js.Dynamic.literal(props = props, ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSVGElement]
  }
}

