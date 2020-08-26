package typings.rootAsn1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element[V /* <: String | Uint8Array */] extends js.Object {
  var children: js.UndefOr[js.Array[Element[V]]] = js.native
  var length: Double = js.native
  var lengthSize: Double = js.native
  var `type`: Double = js.native
  var value: js.UndefOr[V] = js.native
}

object Element {
  @scala.inline
  def apply[/* <: java.lang.String | typings.std.Uint8Array */ V](length: Double, lengthSize: Double, `type`: Double): Element[V] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], lengthSize = lengthSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element[V]]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element[_], /* <: java.lang.String | typings.std.Uint8Array */ V] (val x: Self with Element[V]) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setLengthSize(value: Double): Self = this.set("lengthSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: Element[V]*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Element[V]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

