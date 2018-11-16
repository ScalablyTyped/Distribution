package typings
package refLib.refMod

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

