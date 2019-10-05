package typings.react.reactMod

import typings.react.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */] extends DOMElement[P, T]

object DetailedReactHTMLElement {
  @scala.inline
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    props: js.Any,
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any,
    key: Key = null,
    ref: LegacyRef[T] = null
  ): DetailedReactHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props)
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedReactHTMLElement[P, T]]
  }
}

