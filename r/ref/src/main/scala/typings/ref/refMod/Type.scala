package typings.ref.refMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /** The alignment of this datatype when placed inside a struct. */
  var alignment: js.UndefOr[Double] = js.undefined
  /** The current level of indirection of the buffer. */
  var indirection: Double
  /** The name to use during debugging for this datatype. */
  var name: js.UndefOr[String] = js.undefined
  /** The size in bytes required to hold this datatype. */
  var size: Double
  /** To invoke when `ref.get` is invoked on a buffer of this type. */
  def get(buffer: Buffer, offset: Double): js.Any
  /** To invoke when `ref.set` is invoked on a buffer of this type. */
  def set(buffer: Buffer, offset: Double, value: js.Any): Unit
}

object Type {
  @scala.inline
  def apply(
    get: (Buffer, Double) => js.Any,
    indirection: Double,
    set: (Buffer, Double, js.Any) => Unit,
    size: Double,
    alignment: Int | Double = null,
    name: String = null
  ): Type = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), indirection = indirection.asInstanceOf[js.Any], set = js.Any.fromFunction3(set), size = size.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

