package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */] extends DOMElement[P, T]

object DetailedReactHTMLElement {
  @scala.inline
  def apply[P /* <: HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](
    props: P,
    ref: LegacyRef[T],
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 114 */ js.Any,
    key: Key = null
  ): DetailedReactHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedReactHTMLElement[P, T]]
  }
}

