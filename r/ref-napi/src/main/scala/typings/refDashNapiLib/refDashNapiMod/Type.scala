package typings
package refDashNapiLib.refDashNapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /** The alignment of this datatype when placed inside a struct. */
  var alignment: js.UndefOr[scala.Double] = js.undefined
  /** The current level of indirection of the buffer. */
  var indirection: scala.Double
  /** The name to use during debugging for this datatype. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The size in bytes required to hold this datatype. */
  var size: scala.Double
  /** To invoke when `ref.get` is invoked on a buffer of this type. */
  def get(buffer: nodeLib.Buffer, offset: scala.Double): js.Any
  /** To invoke when `ref.set` is invoked on a buffer of this type. */
  def set(buffer: nodeLib.Buffer, offset: scala.Double, value: js.Any): scala.Unit
}

object Type {
  @scala.inline
  def apply(
    get: (nodeLib.Buffer, scala.Double) => js.Any,
    indirection: scala.Double,
    set: (nodeLib.Buffer, scala.Double, js.Any) => scala.Unit,
    size: scala.Double,
    alignment: scala.Int | scala.Double = null,
    name: java.lang.String = null
  ): Type = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), indirection = indirection, set = js.Any.fromFunction3(set), size = size)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Type]
  }
}

