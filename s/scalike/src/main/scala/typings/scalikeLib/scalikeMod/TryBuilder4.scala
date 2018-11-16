package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "TryBuilder4")
@js.native
class TryBuilder4[A, B, C, D, E] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.TryBuilder4[A, B, C, D, E] {
  def this(oa: scalikeLib.scalikeMod.scalikeNs.Try[A], ob: scalikeLib.scalikeMod.scalikeNs.Try[B], oc: scalikeLib.scalikeMod.scalikeNs.Try[C], od: scalikeLib.scalikeMod.scalikeNs.Try[D], oe: scalikeLib.scalikeMod.scalikeNs.Try[E]) = this()
  /* CompleteClass */
  override var oa: js.Any = js.native
  /* CompleteClass */
  override var ob: js.Any = js.native
  /* CompleteClass */
  override var oc: js.Any = js.native
  /* CompleteClass */
  override var od: js.Any = js.native
  /* CompleteClass */
  override var oe: js.Any = js.native
  /* CompleteClass */
  override def chain[F](of: scalikeLib.scalikeMod.scalikeNs.Try[F]): scalikeLib.scalikeMod.scalikeNs.TryBuilder5[A, B, C, D, E, F] = js.native
  /* CompleteClass */
  override def run[F](f: js.Function5[A, B, C, D, E, F]): scalikeLib.scalikeMod.scalikeNs.Try[F] = js.native
}

