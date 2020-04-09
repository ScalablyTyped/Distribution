package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedRaxHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */] extends DOMElement[P, T]

object DetailedRaxHTMLElement {
  @scala.inline
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](props: P, `type`: String, key: Key = null, ref: LegacyRef[T] = null): DetailedRaxHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedRaxHTMLElement[P, T]]
  }
}

