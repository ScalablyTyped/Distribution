package typings.rootAsn1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element[V /* <: String | Uint8Array */] extends js.Object {
  var children: js.UndefOr[js.Array[Element[V]]] = js.undefined
  var length: Double
  var lengthSize: Double
  var `type`: Double
  var value: js.UndefOr[V] = js.undefined
}

object Element {
  @scala.inline
  def apply[/* <: java.lang.String | typings.std.Uint8Array */ V](
    length: Double,
    lengthSize: Double,
    `type`: Double,
    children: js.Array[Element[V]] = null,
    value: V = null
  ): Element[V] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], lengthSize = lengthSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element[V]]
  }
}

