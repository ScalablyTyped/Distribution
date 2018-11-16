package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "TryBuilder2")
@js.native
class TryBuilder2[A, B, C] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.TryBuilder2[A, B, C] {
  def this(oa: scalikeLib.scalikeMod.scalikeNs.Try[A], ob: scalikeLib.scalikeMod.scalikeNs.Try[B], oc: scalikeLib.scalikeMod.scalikeNs.Try[C]) = this()
  /* CompleteClass */
  override var oa: js.Any = js.native
  /* CompleteClass */
  override var ob: js.Any = js.native
  /* CompleteClass */
  override var oc: js.Any = js.native
  /* CompleteClass */
  override def chain[D](od: scalikeLib.scalikeMod.scalikeNs.Try[D]): scalikeLib.scalikeMod.scalikeNs.TryBuilder3[A, B, C, D] = js.native
  /* CompleteClass */
  override def run[D](f: js.Function3[A, B, C, D]): scalikeLib.scalikeMod.scalikeNs.Try[D] = js.native
}

