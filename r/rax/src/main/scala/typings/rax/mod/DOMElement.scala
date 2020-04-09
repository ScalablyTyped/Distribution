package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// string fallback for custom web-components
trait DOMElement[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */] extends RaxElement[P, String] {
  var ref: LegacyRef[T]
}

object DOMElement {
  @scala.inline
  def apply[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */](props: P, `type`: String, key: Key = null, ref: LegacyRef[T] = null): DOMElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMElement[P, T]]
  }
}

