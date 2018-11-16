package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "TryBuilder3")
@js.native
class TryBuilder3[A, B, C, D] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.TryBuilder3[A, B, C, D] {
  def this(oa: scalikeLib.scalikeMod.scalikeNs.Try[A], ob: scalikeLib.scalikeMod.scalikeNs.Try[B], oc: scalikeLib.scalikeMod.scalikeNs.Try[C], od: scalikeLib.scalikeMod.scalikeNs.Try[D]) = this()
  /* CompleteClass */
  override var oa: js.Any = js.native
  /* CompleteClass */
  override var ob: js.Any = js.native
  /* CompleteClass */
  override var oc: js.Any = js.native
  /* CompleteClass */
  override var od: js.Any = js.native
  /* CompleteClass */
  override def chain[E](oe: scalikeLib.scalikeMod.scalikeNs.Try[E]): scalikeLib.scalikeMod.scalikeNs.TryBuilder4[A, B, C, D, E] = js.native
  /* CompleteClass */
  override def run[E](f: js.Function4[A, B, C, D, E]): scalikeLib.scalikeMod.scalikeNs.Try[E] = js.native
}

