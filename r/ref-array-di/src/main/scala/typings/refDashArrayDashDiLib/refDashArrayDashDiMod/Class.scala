package typings
package refDashArrayDashDiLib.refDashArrayDashDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-array-di", JSImport.Namespace)
@js.native
class Class[T] protected () extends ArrayType[T] {
  def this(`type`: java.lang.String) = this()
  def this(`type`: refDashNapiLib.refDashNapiMod.Type) = this()
  def this(`type`: java.lang.String, length: scala.Double) = this()
  def this(`type`: refDashNapiLib.refDashNapiMod.Type, length: scala.Double) = this()
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

