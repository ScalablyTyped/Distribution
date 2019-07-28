package typings.react.reactMod

import typings.react.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// string fallback for custom web-components
trait DOMElement[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */] extends ReactElement {
  var ref: LegacyRef[T]
}

object DOMElement {
  @scala.inline
  def apply[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */](props: js.Any, ref: LegacyRef[T], `type`: js.Any, key: Key = null): DOMElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props, ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMElement[P, T]]
  }
}

