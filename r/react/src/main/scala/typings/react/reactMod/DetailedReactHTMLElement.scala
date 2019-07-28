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
    ref: LegacyRef[T],
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 115 */ js.Any,
    key: Key = null
  ): DetailedReactHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props, ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedReactHTMLElement[P, T]]
  }
}

