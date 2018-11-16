package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "FutureBuilder2")
@js.native
class FutureBuilder2[A, B, C] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.FutureBuilder2[A, B, C] {
  def this(oa: scalikeLib.scalikeMod.scalikeNs.Future[A], ob: scalikeLib.scalikeMod.scalikeNs.Future[B], oc: scalikeLib.scalikeMod.scalikeNs.Future[C]) = this()
  /* CompleteClass */
  override var oa: js.Any = js.native
  /* CompleteClass */
  override var ob: js.Any = js.native
  /* CompleteClass */
  override var oc: js.Any = js.native
  /* CompleteClass */
  override def chain[D](od: scalikeLib.scalikeMod.scalikeNs.Future[D]): scalikeLib.scalikeMod.scalikeNs.FutureBuilder3[A, B, C, D] = js.native
  /* CompleteClass */
  override def run[D](f: js.Function3[A, B, C, D]): scalikeLib.scalikeMod.scalikeNs.Future[D] = js.native
}

