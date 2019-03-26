package typings
package refDashUnionDashDiLib.refDashUnionDashDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-union-di", JSImport.Namespace)
@js.native
class namespacedCls () extends UnionType {
  def this(fields: js.Array[_]) = this()
  def this(fields: js.Object) = this()
  /** The current level of indirection of the buffer. */
  /* CompleteClass */
  override var indirection: scala.Double = js.native
  /** The size in bytes required to hold this datatype. */
  /* CompleteClass */
  override var size: scala.Double = js.native
  /** To invoke when `ref.get` is invoked on a buffer of this type. */
  /* CompleteClass */
  override def get(buffer: nodeLib.Buffer, offset: scala.Double): js.Any = js.native
  /** To invoke when `ref.set` is invoked on a buffer of this type. */
  /* CompleteClass */
  override def set(buffer: nodeLib.Buffer, offset: scala.Double, value: js.Any): scala.Unit = js.native
}

