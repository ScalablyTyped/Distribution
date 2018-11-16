package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "FutureBuilder3")
@js.native
class FutureBuilder3[A, B, C, D] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.FutureBuilder3[A, B, C, D] {
  def this(oa: scalikeLib.scalikeMod.scalikeNs.Future[A], ob: scalikeLib.scalikeMod.scalikeNs.Future[B], oc: scalikeLib.scalikeMod.scalikeNs.Future[C], od: scalikeLib.scalikeMod.scalikeNs.Future[D]) = this()
  /* CompleteClass */
  override var oa: js.Any = js.native
  /* CompleteClass */
  override var ob: js.Any = js.native
  /* CompleteClass */
  override var oc: js.Any = js.native
  /* CompleteClass */
  override var od: js.Any = js.native
  /* CompleteClass */
  override def chain[E](oe: scalikeLib.scalikeMod.scalikeNs.Future[E]): scalikeLib.scalikeMod.scalikeNs.FutureBuilder4[A, B, C, D, E] = js.native
  /* CompleteClass */
  override def run[E](f: js.Function4[A, B, C, D, E]): scalikeLib.scalikeMod.scalikeNs.Future[E] = js.native
}

