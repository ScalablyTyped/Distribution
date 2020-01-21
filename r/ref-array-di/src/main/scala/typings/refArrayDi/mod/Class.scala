package typings.refArrayDi.mod

import typings.node.Buffer
import typings.refNapi.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-array-di", JSImport.Namespace)
@js.native
class Class[T] protected () extends ArrayType[T] {
  def this(`type`: String) = this()
  def this(`type`: Type) = this()
  def this(`type`: String, length: Double) = this()
  def this(`type`: Type, length: Double) = this()
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

