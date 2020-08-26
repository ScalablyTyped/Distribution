package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaxElement[P, T /* <: String | JSXElementConstructor[_] */] extends js.Object {
  var key: Key | Null = js.native
  var props: P = js.native
  var `type`: T = js.native
}

object RaxElement {
  @scala.inline
  def apply[P, /* <: java.lang.String | typings.rax.mod.JSXElementConstructor[_] */ T](props: P, `type`: T): RaxElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxElement[P, T]]
  }
  @scala.inline
  implicit class RaxElementOps[Self <: RaxElement[_, _], P, /* <: java.lang.String | typings.rax.mod.JSXElementConstructor[_] */ T] (val x: Self with (RaxElement[P, T])) extends AnyVal {
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
    def setProps(value: P): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
  }
  
}

