package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// string fallback for custom web-components
@js.native
trait DOMElement[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */] extends RaxElement[P, String] {
  var ref: LegacyRef[T] = js.native
}

object DOMElement {
  @scala.inline
  def apply[/* <: typings.rax.mod.HTMLAttributes[T] | typings.rax.mod.SVGAttributes[T] */ P, /* <: typings.rax.mod.Element */ T](props: P, `type`: String): DOMElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMElement[P, T]]
  }
  @scala.inline
  implicit class DOMElementOps[Self <: DOMElement[_, _], /* <: typings.rax.mod.HTMLAttributes[T] | typings.rax.mod.SVGAttributes[T] */ P, /* <: typings.rax.mod.Element */ T] (val x: Self with (DOMElement[P, T])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRefFunction1(value: /* instance */ T | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: LegacyRef[T]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

