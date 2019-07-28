package typings.refDashStruct.refDashStructMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-struct", JSImport.Namespace)
@js.native
class Class () extends StructType {
  def this(fields: js.Array[_]) = this()
  def this(fields: js.Object) = this()
  def this(fields: js.Object, opt: js.Object) = this()
  /** The current level of indirection of the buffer. */
  /* CompleteClass */
  override var indirection: Double = js.native
  /** The size in bytes required to hold this datatype. */
  /* CompleteClass */
  override var size: Double = js.native
  /** To invoke when `ref.get` is invoked on a buffer of this type. */
  /* CompleteClass */
  override def get(buffer: Buffer, offset: Double): js.Any = js.native
  /** To invoke when `ref.set` is invoked on a buffer of this type. */
  /* CompleteClass */
  override def set(buffer: Buffer, offset: Double, value: js.Any): Unit = js.native
}

