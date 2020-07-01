package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedRaxHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */] extends DOMElement[P, T]

object DetailedRaxHTMLElement {
  @scala.inline
  def apply[/* <: typings.rax.mod.HTMLAttributes[T] */ P, /* <: typings.rax.mod.HTMLElement */ T](props: P, `type`: String, key: Key = null, ref: LegacyRef[T] = null): DetailedRaxHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedRaxHTMLElement[P, T]]
  }
}

