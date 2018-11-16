package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "FutureBuilder4")
@js.native
class FutureBuilder4[A, B, C, D, E] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.FutureBuilder4[A, B, C, D, E] {
  def this(oa: scalikeLib.scalikeMod.scalikeNs.Future[A], ob: scalikeLib.scalikeMod.scalikeNs.Future[B], oc: scalikeLib.scalikeMod.scalikeNs.Future[C], od: scalikeLib.scalikeMod.scalikeNs.Future[D], oe: scalikeLib.scalikeMod.scalikeNs.Future[E]) = this()
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
  override def chain[F](of: scalikeLib.scalikeMod.scalikeNs.Future[F]): scalikeLib.scalikeMod.scalikeNs.FutureBuilder5[A, B, C, D, E, F] = js.native
  /* CompleteClass */
  override def run[F](f: js.Function5[A, B, C, D, E, F]): scalikeLib.scalikeMod.scalikeNs.Future[F] = js.native
}

